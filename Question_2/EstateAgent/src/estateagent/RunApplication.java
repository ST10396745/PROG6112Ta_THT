/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagent;

import java.util.Scanner;

/**
 *
 * @author William Stainton
 */
public class RunApplication {
    // Main method for the program
    public static void main(String[] args) {
        // Initialize variables for estate agent's name and property price
        String name = "";
        double price = 0;
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt for and read the estate agent's name
        System.out.println("Enter the current estate agent name: ");
        name = sc.next();
        // Prompt for and read the property price
        System.out.println("Enter the property price: ");
        price = sc.nextDouble();
        
        // Create an EstateAgentSales instance with the provided inputs
        EstateAgentSales estateAgentSales = new EstateAgentSales(name, price);
        // Print the estate agent's property report
        estateAgentSales.printPropertyReport();
        // Close the scanner
        sc.close();
    }
    
}
