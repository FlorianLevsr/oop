package tp1.bibliothèque;
public class Book {
	private Author author;
	private String title;
	private int parutionDate;
	private String id;

	public Book (
		Author author,
		String title,
		int parutionDate,
		String id
	) {
		this.author = author;
		this.title = title;
		this.parutionDate = parutionDate;
		this.id = id;

		author.linkBookToAuthor(this);
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getParutionDate() {
		return parutionDate;
	}

	public void setParutionDate(int parutionDate) {
		this.parutionDate = parutionDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", parutionDate=" + parutionDate + ", id=" + id + "]";
	}

}
