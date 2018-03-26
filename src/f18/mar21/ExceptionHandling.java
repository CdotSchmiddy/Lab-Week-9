/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18.mar21;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Calum
 */
public class ExceptionHandling {
    
    public static int quotient(int numerator, int denominator){
        return numerator/denominator;
    }
    
    public static void main(String[] args){
        boolean continueLoop = true;
        do{
            
        try{
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = keyboard.nextInt();
        
        System.out.print("Enter the denominator: ");
        int denominator = keyboard.nextInt();
        System.out.printf("Result: %d/%d=%d %n", numerator, denominator, quotient(numerator, denominator));
        continueLoop = false;
        }
        catch (InputMismatchException mismatchException){
            System.out.println("Only integers are accepted.");
            }
        catch (ArithmeticException mathException){
            System.err.println(mathException.getMessage());
        }
        catch (Exception e){ //generic exception catch all
            System.err.println(e.getMessage());
        }
        }while (continueLoop);
    }
}
