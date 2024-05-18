/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleinterest;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user to enter the rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter the time period
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}

    