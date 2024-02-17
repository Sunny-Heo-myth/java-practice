package org.alan.javapractice.inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerHeo = new Customer();
		customerHeo.setCustomerID(10010);
		customerHeo.setCustomerName("Sunny");
		customerHeo.bonusPoint = 1000;
		System.out.println(customerHeo.showCustomerInfo());
		
		VIPCustomer customerLizi = new VIPCustomer();
		customerLizi.setCustomerID(10020);
		customerLizi.setCustomerName("Lily Elizabeth");
		customerLizi.bonusPoint = 10000;
		System.out.println(customerLizi.showCustomerInfo());
	}

}
