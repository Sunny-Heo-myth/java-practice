package org.alan.javapractice.polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {                // reseting member variable
		customerGrade = "SILVER";
		bonusRatio = .01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public int getCustomerID() {  // to get and set protected method from outside of the class
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String grade) {
		this.customerGrade = grade;
	}
	
	public String showCustomerInfo() {
		return "Your name is " + customerName + " and your grade is " + 
				customerGrade + ". Your bonus point is " +  bonusPoint + ". ";
	}
	
}
