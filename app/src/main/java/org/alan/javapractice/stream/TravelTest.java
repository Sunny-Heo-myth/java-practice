package org.alan.javapractice.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("Lee", 40, 100);
		TravelCustomer customerHeo = new TravelCustomer("Heo", 30, 10000);
		TravelCustomer customerHan = new TravelCustomer("Han", 20, 1000);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerHeo);
		customerList.add(customerHan);
		
		System.out.println("======== CustomerList ========");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("Total expense : " + total);
		
		System.out.println("======== 20 and above years old CustomerList ========");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).
		sorted().forEach(s -> System.out.println(s));

	}

}
