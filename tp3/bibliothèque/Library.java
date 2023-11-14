package tp3.bibliothèque;

import java.util.HashMap;

public class Library {
	private String name;
	private String address;
	private HashMap<String, Artwork> artworks = new HashMap<>();

	public Library(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void addArtwork (Artwork artwork) {
		artworks.put(artwork.title, artwork);

		System.out.println("L'oeuvre " + artwork.getTitle() + " a été ajoutée à la bibliothèque.");
	}
	
}
