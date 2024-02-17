package org.alan.javapractice.witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerHeo = new Customer(10010, "Heo");
		Customer customerHan = new Customer(10010, "Han");
		Customer customerLizi = new GoldCustomer(10010, "Lizi");
		Customer customerRyu = new GoldCustomer(10010, "Ryu");
		Customer customerLee = new VIPCustomer(10010, "Lee", 12345);
		
		customerList.add(customerHeo);
		customerList.add(customerHan);
		customerList.add(customerLizi);
		customerList.add(customerRyu);
		customerList.add(customerLee);
		
		System.out.println("======== printing customerInfo ========");
		for(Customer x : customerList) {
			System.out.println(x.showCustomerInfo());
		}
		
		System.out.println("======== calculating saleRatio & bonusPoint ========");
		int price = 10000;
		for(Customer x : customerList) {
			int cost = x.calcPrice(price);
			System.out.println(x.getCustomerName() + " paid " + cost + ". ");
			System.out.println(x.getCustomerName() + "'s bonusPoint is " + x.bonusPoint + ". ");
		}
	}

}
