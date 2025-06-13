package ExamPractice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("ABC", "DEF");
		Book book2 = new Book("GHI", "KLM");
		
		ArrayList<Book> booksList = new ArrayList<>();
		
		Library library = new Library(booksList);
		System.out.println("Is book added? " + book1.title + " " + library.addBook(book1));
		System.out.println("Is book added? " + book2.title + " " +library.addBook(book2));
        library.displayBooks();
        System.out.println(library.searchBook(book2));
        System.out.println("Is book removed? " + book1.title + " " +library.removeBook(book1));
        library.displayBooks();
	}

}
