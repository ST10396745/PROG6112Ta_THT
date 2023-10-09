/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagent;

/**
 *
 * @author William Stainton
 */
// Subclass of EstateAgent, representing an estate agent sales report.
public class EstateAgentSales extends EstateAgent{

    // Constructor to initialize the estate agent's name and property price.
    public EstateAgentSales(String name, double price) {
        super(name, price);
    }
    
    // Method to print the property sales report for the estate agent.
    public void printPropertyReport(){
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("*******************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }
    
}
