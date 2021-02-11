/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6.Lesson6_1;

/**
 *
 * @author Chrissie
 */
public class Fish extends Animal implements Pet {
    
    //A String field called name
    String name;
    
    //A no-argument constructor that passes a value of 0 to the parent constructor
    public Fish() {
        super(0);
    }
    
    //Getter and setter methods for the name field
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
    //An eat() method that prints out "Fish eat pond scum."
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
    
    //A walk() method that overrides the Animal class walk method. It should first call
    //the super class walk method, and then print "Fish, of course, can't walk;
    //they swim."
    
    @Override
    public void walk() {
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    
    @Override
    //A play() method that prints out "Just keep swimming."
    public void play(){
        System.out.println("Just keep swimming.\n\n");
    }
    
}
