package tp3.bibliothèque;

public abstract class Artwork {
	protected String title;
	protected Author author;
	protected int parutionYear;

	public Artwork (
		String title,
		Author author,
		int parutionYear
	) {
		this.title = title;
		this.author = author;
		this.parutionYear = parutionYear;
	}

}
