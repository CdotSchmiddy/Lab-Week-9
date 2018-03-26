/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18.mar21;

/**
 *
 * @author Calum
 */
public class BlankException extends Exception {
    
    //no argument constructor
    public BlankException(){
        super("Input cannot be blank");
    }
    
    //constructor with a message
    public BlankException(String message)
    {
        super(message);
    }
    
    //constructor used for chaining excpetions
    public BlankException(Throwable throwable){
        super(throwable);
    }
    
    //constructor with a message and chaining excoetions
    public BlankException(String message, Throwable throwable){
        super(message, throwable);
    }
}