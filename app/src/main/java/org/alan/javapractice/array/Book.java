package org.alan.javapractice.array;

public class Book {
	
	private String bookName;  // 2mv, 1ctt, 5meth
	private String author;
	
	public Book() {}  // Default constructor
	
	public Book(String bookName, String author) {  // Constructor with two parameters
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {  // Get1
		return bookName;
	}
	
	public void setBookName(String bookName) {  // Set1
		this.bookName = bookName;
	}

	public String getAuthor() {  // Get2
		return author;
	}
	
	public void setAuthor(String author) {  // Set2
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);  // 
	}
	
}
