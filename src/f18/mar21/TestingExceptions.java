/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18.mar21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Calum
 */
public class TestingExceptions {
    
    public static void main(String[] args){
        try {
            firstMethod();
        } catch (HomeworkExceptiom ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void firstMethod() throws HomeworkExceptiom{
        throw new HomeworkExceptiom();
    }
}
