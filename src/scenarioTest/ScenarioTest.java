package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Sanglier>[] marcheSanglier = new IEtal[3];//Essai 2 : on ne peut pas construire
		IEtal<Poisson>[] marchePoisson = new IEtal[3];//Essai 2 : on ne peut pas construire 
		IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marcheSanglier[0] = etalSanglier;
		marchePoisson[0] = etalPoisson;
	}
	
}
