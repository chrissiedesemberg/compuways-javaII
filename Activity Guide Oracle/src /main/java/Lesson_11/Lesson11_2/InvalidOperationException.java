/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11.Lesson11_2;

/**
 *
 * @author Chrissie
 */
public class InvalidOperationException extends Exception {
    
    InvalidOperationException() {
        super();
    }
    
    InvalidOperationException(String message){
        super(message);
    }
    
    InvalidOperationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    InvalidOperationException(Throwable cause) {
        super(cause);
    }
    
}
