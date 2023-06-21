package org.alan.java.inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerHeo = new Customer(10010, "Heo");
		customerHeo.bonusPoint = 1000;
		
		VIPCustomer customerAnna = new VIPCustomer(10020, "Anna", 12345);
		customerAnna.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerHeo.getCustomerName() + ", " + customerHeo.calcPrice(price));
		System.out.println(customerAnna.getCustomerName() + ", " + customerAnna.calcPrice(price));
		
	}

}
