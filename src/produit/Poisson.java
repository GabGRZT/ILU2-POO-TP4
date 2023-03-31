package produit;

public class Poisson extends Produit{
	private String dateDePeche;
	
	public Poisson (String dateDePeche) {
		super("poisson", Unite.KILOGRAMME);
		this.dateDePeche = dateDePeche;
	}
	
	
	@Override
	public String descriptionProduit(){
		return "poissons pechés "+dateDePeche;
	}
}
