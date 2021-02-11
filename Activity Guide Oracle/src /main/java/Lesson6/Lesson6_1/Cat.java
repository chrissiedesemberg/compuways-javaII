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
public class Cat extends Animal implements Pet {
    
    //A String field called name
    String name;
    
    //Getter and setter methods for the name field
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //A constructor that receives a name String and passes a value of 4 to the parent constructor
    public Cat(String name) {
        super(4);
        this.name = name;
        
    }
    
    //A no-argument constructor that passes a value of "Fluffy" to the other constructor
        //in this class
        public Cat() {
        super(4);
        this.name = "Fluffy";
    }
    
    //An eat() method that prints out "Cats like to eat spiders and fish."
        public void eat(){
            System.out.println("Cats like to eat spiders and fish.");
        }
   
        @Override
    //A play() method that prints out name + " likes to play with string."
        public void play(){
            System.out.println(name + " likes to play with string.\n\n");
        }
    
}
