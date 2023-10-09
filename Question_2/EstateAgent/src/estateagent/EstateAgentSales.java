/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estateagent;

/**
 *
 * @author William Stainton
 */
public class EstateAgentSales extends EstateAgent{

    public EstateAgentSales(String name, double price) {
        super(name, price);
    }
    
    public void printPropertyReport(){
        System.out.println("ESTATE AGENT REPORT");
        System.out.println("*******************");
        System.out.println("ESTATE AGENT NAME: " + getAgentName());
        System.out.println("PROPERTY PRICE: R " + getPropertyPrice());
        System.out.println("AGENT COMMISSION: R " + getAgentCommission());
    }
    
}
