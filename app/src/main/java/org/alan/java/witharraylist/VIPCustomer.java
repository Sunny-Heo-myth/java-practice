package org.alan.java.witharraylist;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = .05;
		saleRatio = .1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);        // (int) typechange
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "Your private agent number is " + agentID + ".";
		// super.method abbreviate code
	}
	
	public int getAgentID() {
		return agentID;
	}
}
