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
    
    public static void main(String[] args) {
        
        String name = "";
        double price = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the current estate agent name: ");
        name = sc.next();
        
        System.out.println("Enter the property price: ");
        price = sc.nextDouble();
        
        EstateAgentSales estateAgentSales = new EstateAgentSales(name, price);
        estateAgentSales.printPropertyReport();
        sc.close();
    }
    
}
