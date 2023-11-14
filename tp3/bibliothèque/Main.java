package tp3.bibliothèque;

class Main {

	public static void main(String[] args) {
		var author1 = new Author("Florian", "Levavasseur");

		var book1 = new Book(
			"Tout sur la POO",
			author1,
			2023,
			"1234"
		);

		System.out.println(book1);
	}

}