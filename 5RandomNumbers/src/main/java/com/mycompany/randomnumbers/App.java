/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumbers;

/**
 *
 * @author Sanele
 */
import java.util.Random;

public class App {
    
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate and print 5 random numbers between 79 and 200
        System.out.println("5 random numbers between 79 and 200:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(200) + 79;
            System.out.println(randomNumber);
        }
    }
}

    
 
