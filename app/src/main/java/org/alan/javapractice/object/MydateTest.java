package org.alan.javapractice.object;

public class MydateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2005);
		
		System.out.println(date1.equals(date2));
	}

}
