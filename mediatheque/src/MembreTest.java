import junit.framework.TestCase;


public class MembreTest extends TestCase {

	protected void setUp() throws Exception {
	}
	
	public void testIdentification() {
		// Création du membre
		Membre m1 = new Membre();
		m1.setIdMembre("id74");
		m1.getmdp("1234");		
		m1.identification("id74","1243");
		if (m1.identification("id74","1243")){
			fail("Erreur");
	}

	public void testDemandeEmprunt() {
		fail("Not yet implemented");
	}

	public void testVerifierDisponibilite() {
		fail("Not yet implemented");
	}

}
