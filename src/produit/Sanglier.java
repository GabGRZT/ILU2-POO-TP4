package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int quantite;
	private Gaulois chasseur;
	
	public Sanglier ( int quantite, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.quantite = quantite;
		this.chasseur = chasseur;
	}
	
	@Override
	public String descriptionProduit(){
		return "sanglier de "+quantite+Unite.KILOGRAMME+" chassé par "+chasseur;
	}
}
