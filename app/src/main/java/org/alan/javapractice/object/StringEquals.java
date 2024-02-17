package org.alan.javapractice.object;

public class StringEquals {

	public static void main(String[] args) {
		
		Book book1 = new Book(200, "Selfish Gene");
		Book book2 = book1;
		Book book3 = new Book(200, "Selfish Gene");

		System.out.println(book1 == book3);
		System.out.println(book1.equals(book3));
	}

}
