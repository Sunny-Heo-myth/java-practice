package org.alan.java.witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = .02;
		saleRatio = .1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}
