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
public class UserInput2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        double average = (double)(a + b + c) / 3;

        System.out.println("Average of 3 numbers: " + average);

    }
}
