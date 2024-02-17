package org.alan.javapractice.inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer customerLena = new VIPCustomer(10030, "Lena", 2000);
		customerLena.bonusPoint = 1000;

		System.out.println(customerLena.getCustomerName() + ", " + customerLena.calcPrice(10000));
	}

}
