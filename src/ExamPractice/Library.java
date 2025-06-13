package ExamPractice;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books;
	
	Library(ArrayList<Book> books){
		this.books = books;
	}
	
	
	public boolean addBook(Book book) {
		return books.add(book);
	}
	
	public boolean removeBook(Book book) {
		return books.remove(book);
	}
	
	public int searchBook(Book book) {
		return books.indexOf(book);
	}
	
	public void displayBooks() {
		for(Book book: books) {
			System.out.printf("Title: %s, Author: %s\n", book.title, book.author);
		}
	}
}
