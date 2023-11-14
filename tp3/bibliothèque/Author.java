package tp3.bibliothèque;

import java.util.ArrayList;
import java.util.List;

public class Author {

	private String lastname;
	private String firstname;
	private List<Book> authorOf;

	public Author (
		String firstname,
		String lastname
	) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.authorOf = new ArrayList<Book>();
	}

	public void linkArtworkToAuthor (Book book) {
		authorOf.add(book);
	}

	@Override
	public String toString() {
		return "Author [lastname=" + lastname + ", firstname=" + firstname + "]";
	}

	public List<Book> getAuthorOf() {
		return authorOf;
	}

}
