package com.jjh.bookshop.books;

public class Book {
	private int isbn;
	private String title;
	private String category;
	private String author;

	public Book() {}

	public Book(int isbn, String title, String category, String author) {
		this.isbn = isbn;
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return(String.format("Book [ISBN=%s, Title=%s, Category=%s, Author=%s]", isbn, title, category, author));
	}
}
