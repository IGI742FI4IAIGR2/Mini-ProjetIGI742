
import junit.framework.TestCase;
import java.util.ArrayList;

public class MembreTest extends TestCase {

	protected void setUp() throws Exception {
	}
	protected static Fabrique fabrique;
	private Membre m1 = new Membre();// Cr�ation du membre
	private Produit p = new Produit();// Cr�ation d'un produit
	private Mediatheque media = new Mediatheque();
	private Exemplaire exP = new Exemplaire(p, media);// Cr�ation d'un exemplaire de ce produit
	
	public void testIdentification() {	
		m1.setIdMembre(74);
		m1.setMdp("1234");
		m1.identification(74,"1243");
		if (m1.identification(74,"1243")) {
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