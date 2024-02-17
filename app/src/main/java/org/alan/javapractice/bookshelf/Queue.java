package org.alan.javapractice.bookshelf;

public interface Queue {
	
	void enQueue(String title);
	String deQueue();
	int getsize();
}
