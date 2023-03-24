package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier (String nom, Unite unite, int poids, Gaulois chasseur) {
		super("sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
}