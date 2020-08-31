/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit1_StringUserInput;

import java.util.Scanner;

/**
 *
 * @author maanderson
 */
public class UserInput_String {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String fName = input.next();
        
        System.out.print("Enter last name: ");
        String lName = input.next();
        
        String fullName = fName + " " + lName;
        
        System.out.println("Full Name: " + fullName);
        
        input.nextLine(); //allows you to enter strings using nextLine
        
        System.out.print("Enter your comments: ");
        String comments = input.nextLine();
        
        System.out.println("Comments: " + comments);
        
        
        
    }
}
