package org.alan.java.object;

public class EqualsTest {

	public static void main(String[] args) {
		Book book1 = new Book(200, "Selfish Gene");
		Book book2 = book1;
		Book book3 = new Book(200, "Selfish Gene");
		
		if(book1 == book2)
			System.out.println("book1 and book2 have same address.");
		else
			System.out.println("book1 and book2 have different address.");
		
		if(book1.equals(book2))
			System.out.println("book1 and book2 have same data.");
		else
			System.out.println("book1 and book2 have different data.");
		
		
		if(book1 == book3)
			System.out.println("book1 and book2 have same address.");
		else
			System.out.println("book1 and book2 have different address.");
		
		if(book1.equals(book3))
			System.out.println("book1 and book2 have same data.");
		else
			System.out.println("book1 and book2 have different data.");
	}

}