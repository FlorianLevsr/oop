package tp1.bibliothèque;

import java.util.ArrayList;

public class Author {

	private String lastname;
	private String firstname;
	private ArrayList<Book> authorOf;

	public Author (
		String firstname,
		String lastname
	) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.authorOf = new ArrayList<Book>();
	}

	public void linkBookToAuthor (Book book) {
		authorOf.add(book);
	}

	@Override
	public String toString() {
		return "Author [lastname=" + lastname + ", firstname=" + firstname + "]";
	}

	public ArrayList<Book> getAuthorOf() {
		return authorOf;
	}

}
