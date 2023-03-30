package villagegaulois;

import personnages.Gaulois;
import produit.Sanglier;
import villagegauloisold.Etal;

public interface IEtal {
	Gaulois getVendeur();
	double donnerPrix();
	int contientProduit(String produit, int quantiteSouhaitee);
	double acheterProduit(int quantiteSouhaitee);
	String etatEtal();
	void installerVendeur(String string, Etal<Sanglier> etalSanglier, int i);
}