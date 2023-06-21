package org.alan.java.polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerHeo = new Customer();
		customerHeo.setCustomerID(10010);
		customerHeo.setCustomerName("Heo");
		customerHeo.bonusPoint = 1000;
		
		System.out.println(customerHeo.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "Kim", 12345);    // Declare VIPC type as C type
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("======== calculating discount ration and bonus point ========");
		
		int price = 10000;
		int heoPrice = customerHeo.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price);
		
		System.out.println(customerHeo.getCustomerName() + " paid " +  heoPrice + ".");
		System.out.println(customerHeo.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " paid " +  kimPrice + ".");
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
