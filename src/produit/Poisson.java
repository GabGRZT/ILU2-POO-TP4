package produit;

public class Poisson extends Produit{
	private String dateDePeche;
	
	public Poisson (String nom, Unite unite,String dateDePeche) {
		super("sanglier", unite);
		this.dateDePeche = dateDePeche;
	}
	
	
}
