/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estateagent;

/**
 *
 * @author William Stainton
 */
public abstract class EstateAgent implements iEstateAgent{
    
    private String agentName;
    private double propertyPrice;
    private final double agentCommission = 0.20;

    public EstateAgent(String name, double price) {
        this.agentName = name;
        this.propertyPrice = price;
    }

    public String getAgentName() {
        return agentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getAgentCommission() {
        return propertyPrice * agentCommission;
    }
    
    
    
    
    
    
    
}
