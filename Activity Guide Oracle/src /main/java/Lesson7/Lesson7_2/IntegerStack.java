/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7.Lesson7_2;

/**
 *
 * @author Chrissie
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void push(Integer element){
        data.addFirst(element);
        System.out.println("Number added to list: " + element);
}
    
    public void pop(){
        if (data.isEmpty()) {
            System.out.println("Nothing to remove.");
        }
        else {
            System.out.println("Item removed: " + data.removeFirst());
        }
    }
    
    public Integer peek() {
        return data.peekFirst();
        }
    
    public String toString(){
        return data.toString();
    }
    
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Stack before removed: " + stack + "\n");
        
        stack.pop();
        System.out.println("Stack after removed: " + stack + "\n");
        
        int number = stack.peek();
        System.out.println("Peek used: " + number);
        System.out.println("Stack after peeked: " + stack + "\n");

        System.out.println("toString: " + stack.toString());
        
    }
        
}
    



