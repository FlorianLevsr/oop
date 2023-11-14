package tp3.bibliothèque;

public class Book extends Artwork{
	private String isbn;

	
	public Book(String title, Author author, int parutionYear, String isbn) {
		super(title, author, parutionYear);
		this.isbn = isbn;

		author.linkArtworkToAuthor(this);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", author= [" + author + "]]";
	}

}
