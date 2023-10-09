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
    
    // Private instance variables to store agent information
    private String agentName;
    private double propertyPrice;
    // Constant commission rate set to 20%
    private final double agentCommission = 0.20;

    // Constructor to initialize agentName and propertyPrice
    public EstateAgent(String name, double price) {
        this.agentName = name;
        this.propertyPrice = price;
    }

    // Constructor to initialize agentName and propertyPrice
    public String getAgentName() {
        return agentName;
    }

    // Getter method to retrieve the property price
    public double getPropertyPrice() {
        return propertyPrice;
    }

    // Getter method to calculate and retrieve the agent's commission
    public double getAgentCommission() {
        // Commission is calculated as a percentage of property price
        return propertyPrice * agentCommission;
    }
    
}
