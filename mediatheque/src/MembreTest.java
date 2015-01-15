
import junit.framework.TestCase;
import java.util.ArrayList;

public class MembreTest extends TestCase {

	protected void setUp() throws Exception {
	}
	protected static Fabrique fabrique;
	private Membre m1 = new Membre();// Création du membre	
	private Produit p = new Produit();// Création d'un produit 
	private Exemplaire exP = new Exemplaire(p);// Création d'un exemplaire de ce produit	
	private Mediatheque Centre = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",fabrique);
	
	public void testIdentification() {	
		m1.setIdMembre("id74");
		m1.setmdp();		
		m1.identification("id74","1243");
		if (m1.identification("id74","1243")) {
			fail("ok");
		}
	}

	/*public void testDemandeEmprunt() {
		m1.setDateEmprunt(2014,05,12);
		p.demandeEmprunt(exP);
		if (p.DemandeEmprunt()) {
			fail("ok ");
		}		
	}*/
}