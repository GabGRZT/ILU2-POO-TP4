package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.*;

public class ScenarioTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		IEtal<Sanglier>[] marcheSanglier = new IEtal[3];//Essai 2 : on ne peut pas construire
//		IEtal<Poisson>[] marchePoisson = new IEtal[3];//Essai 2 : on ne peut pas construire 
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalSanglier;
		marche[2] = etalPoisson;
		
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		marche[0].installerVendeur(obelix, sangliersObelix, 8);
		marche[1].installerVendeur(asterix, sangliersAsterix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);
		
		
	}
	
}
