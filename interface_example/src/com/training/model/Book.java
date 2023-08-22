package com.training.model;

public class Book {

	private int bookNumber;
	private String bookName;
	private String author;
	
	public Book() {
		super();
	}
	public Book(int bookNumber, String bookName, String author) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
}
