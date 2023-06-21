package org.alan.java.object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book){
			Book x = (Book) obj;
			
			if(this.bookNumber == x.bookNumber)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return bookNumber;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "Selfish Gene");
		Book book3 = new Book(200, "Selfish Gene");
		
		System.out.println(book1);            // Instance information
		System.out.println(book1.toString()); // Instance information
		System.out.println(book1.equals(book3));
		
	}
}
