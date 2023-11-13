package tp1.bibliothèque;

import java.util.ArrayList;

public class Bookshelf {

	private ArrayList<Book> books;

	public Bookshelf () {
		this.books = new ArrayList<Book>();
	}
	
	public void addBook (Book book) {
		books.add(book);
	};

	public void removeBook (Book book) {
		books.remove(book);
	}

	@Override
	public String toString() {
		return "Bookshelf [books=" + books + "]";
	}

	public ArrayList<Book> getBooks() {
		return books;
	};

}
