package produit;

public class Poisson extends Produit{
	private String dateDePeche;
	private int quantite;
	
	public Poisson (int quantite, String dateDePeche) {
		super("poisson", Unite.KILOGRAMME);
		this.dateDePeche = dateDePeche;
		this.quantite = quantite;
	}
	
	
	@Override
	public String descriptionProduit(){
		return "poissons pechés "+dateDePeche;
	}
}
