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

public class ContactTest {
    
    public static void main(String[] args){
      Contact contact1 = new Contact("Jim", "Morrison", "jim@hotmail.com");
      System.out.printf("%s%n", contact1.getFirstName());
      Contact contact2 = new Contact("Dun", "Kirk", "chrisnolan@hotmail.com");
      System.out.printf("%s%n", contact2.getLastName());
      Contact contact3 = new Contact("", "", "");
    }
    
}
