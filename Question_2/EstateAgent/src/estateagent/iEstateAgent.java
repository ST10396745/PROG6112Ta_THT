/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package estateagent;

/**
 *
 * @author William Stainton
 */
// This interface defines the contract that any class representing an estate agent
// should implement. It provides methods to retrieve information about the estate agent.
public interface iEstateAgent {
    // Get the name of the estate agent.
    String getAgentName();
     // Get the property price associated with the estate agent.
    double getPropertyPrice();
    // Get the commission earned by the estate agent, typically calculated as a
    // percentage of the property price.
    double getAgentCommission();
}
