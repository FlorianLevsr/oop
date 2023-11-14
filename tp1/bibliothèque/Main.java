package tp1.bibliothèque;

import tp3.bibliothèque.Author;
import tp3.bibliothèque.Book;

class Main {

	public static void main(String[] args) {
		
		Author author1 = new Author(
			"Florian",
			"Levavasseur"
		);

		Author author2 = new Author(
			"Xavier",
			"Levavasseur"
		);

		Book book1 = new Book(
			author1,
			"Tout sur la POO",
			2023,
			"1234"
		);

		Book book2 = new Book(
			author2,
			"Tout sur TMUX",
			2023,
			"4321"
		);

		System.out.println("Création du premier livre: " + book1);
		System.out.println("Création du second livre: " + book2);

		Bookshelf bookshelf = new Bookshelf();

		System.out.println("Création étagère (vide au début): " + bookshelf);

		bookshelf.addBook(book1);
		System.out.println("Ajout du premier livre à l'étagère.");
		bookshelf.addBook(book2);
		System.out.println("Ajout du second livre à l'étagère.");

		System.out.println("La bibliothèque contient désormais " + bookshelf.getBooks().size() + " livre(s): " + bookshelf);

		System.out.println("Premier auteur: " + author1 + ", et le(s) livre(s) dont il est l'auteur: " + author1.getAuthorOf());
	}

}