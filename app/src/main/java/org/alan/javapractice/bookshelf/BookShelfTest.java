package org.alan.javapractice.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("Lectures on Physics vol.1");
		shelfQueue.enQueue("Lectures on Physics vol.2");
		shelfQueue.enQueue("Lectures on Physics vol.3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
