import junit.framework.TestCase;

/**
 * @author NATHAN
 *
 */
public class EmployeTest extends TestCase {

	
	private Employe employe = new Employe(1);
	
	public void testEmploye() {
		fail("Not yet implemented");
	}
	
	public void testModifierEtatProduit() {
		Produit p = new Produit();
		Exemplaire ex = new Exemplaire(p);
		ex.setEtat(EtatExemplaire.Mauvais);
		employe.modifierEtatProduit(ex, EtatExemplaire.Bon);
		if (!EtatExemplaire.Bon.equals(ex.getEtat())){
			fail("Erreur");
		}
	}

	public void testCommanderProduit() {
		fail("Not yet implemented");
	}

	public void testRenouvellerAbonnement() {
		fail("Not yet implemented");
	}

	public void testSupprimerAbonnement() {
		fail("Not yet implemented");
	}

	public void testEditerInfoMembre() {
		fail("Not yet implemented");
	}

	public void testSupprimerMembre() {
		fail("Not yet implemented");
	}

	public void testAjouterMembre() {
		fail("Not yet implemented");
	}

	public void testGererPerteCarte() {
		fail("Not yet implemented");
	}

	public void testAttribuerCarte() {
		fail("Not yet implemented");
	}

}
