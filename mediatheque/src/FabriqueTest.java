import junit.framework.TestCase;

public class FabriqueTest extends TestCase {

	public void testCreerProduitStringDateStringStringStringGenreFilm() {
		fail("Not yet implemented");
	}

	public void testCreerProduitStringDateStringStringStringTypeOuvrage() {
		fail("Not yet implemented");
	}

	public void testCreerExemplaire() {
		Produit mProduit = new Produit();
		Exemplaire testExemplaire = new Exemplaire(mProduit);
		assertSame(mProduit,testExemplaire.getMonProduit());
	}

	public void testCreerMembre() {
		Fabrique maFabrique = new Fabrique();
		Membre testMembre;
		testMembre = maFabrique.creerMembre("Toto", "Jose", "1 impasse des toto", "0606060606", "25120000");
		assertSame("25120000",testMembre.getDateNaissance());
		assertSame("Toto",testMembre.getNom());
		assertSame("Jose",testMembre.getPrenom());
		assertSame("1 impasse des toto",testMembre.getAdresse());
		assertSame("0606060606",testMembre.getNumtelephone());
	}

	public void testCreerEmprunt() {
		Emprunt testEmprunt = new Emprunt(null, null);
		fail("Not yet implemented");
	}

	public void testCreerCommande() {
		fail("Not yet implemented");
	}

}
