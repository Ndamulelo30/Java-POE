/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditionaloperator;

/**
 *
 * @author Sanele
 */
import java.util.Scanner;

public class ConditionalOperator {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Find the minimum using conditional operator
        int min = (num1 < num2) ? num1 : num2;

        // Output the result
        System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);

        scanner.close();
    }
}

    
