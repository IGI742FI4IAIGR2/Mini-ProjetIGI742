import junit.framework.TestCase;


public class MembreTest extends TestCase {

	protected void setUp() throws Exception {
	}
	private Membre m1 = new Membre();
	private Mediatheque Centre = new Mediatheque("MediaCentre", "chemin la rose", Fabrique fabriqueC);
	public void testIdentification() {
		// Création du membre		
		m1.setIdMembre("id74");
		m1.setmdp();		
		m1.identification("id74","1243");
		if (m1.identification("id74","1243")) {
			fail("Erreur");
		}
	}

	public void testDemandeEmprunt() {
		Produit p = new Produit();
		new Exemplaire(p);
		demandeEmprunt(p);
		if (p.DemandeEmprunt("id74","1243")) {
			fail("ok ");
		}
		
	}

	private void demandeEmprunt(Produit p) {
		// TODO Auto-generated method stub
		
	}

	public void testVerifierDisponibilite() {
		fail("Not yet implemented");
	}

}
