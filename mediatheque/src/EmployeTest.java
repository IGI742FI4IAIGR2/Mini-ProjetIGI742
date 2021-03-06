import java.util.ArrayList;
import junit.framework.TestCase;
import java.util.GregorianCalendar;

/**
 * @author NATHAN
 *
 */
public class EmployeTest extends TestCase {

	
	private Employe employe = new Employe(1);
	protected static Fabrique fabrique = new Fabrique();
	
	public void testEmploye() {
		fail("Not yet implemented");
	}
	
	/**
	 * test de la modification de l'état d'un exemplaire
	 * @author nathan
	 */
	public void testModifierEtatExemplaire() {
		Produit p = new Produit();
		Mediatheque media = new Mediatheque();
		Exemplaire ex = new Exemplaire(p, media);
		ex.setEtat(EtatExemplaire.Mauvais);
		employe.modifierEtatExemplaire(ex, EtatExemplaire.Bon);
		if (!EtatExemplaire.Bon.equals(ex.getEtat())){
			fail("Erreur");
		}
	}
	
	/**
	 * La methode commanderProduit n'a pas ete developpe dans la classe Employe
	 */
	public void testCommanderProduit() {
		fail("Not yet implemented");
	}

	/**
	 * test de la methode renouvellerAbonnement
	 * @author nathan
	 */
	public void testRenouvellerAbonnement() {
		Membre m = new Membre();
		fail("Not yet implemented");
	}

	/**
	 * test de la methode supprimerAbonnement
	 * @author nathan
	 */
	public void testSupprimerAbonnement() {
		Membre m = new Membre();
		Abonnement a = new Abonnement();
		m.setMonAbonnement(a);
		m.getMonAbonnement().setDureeAbonnement(DureeAbonnement.troisMois);
		employe.supprimerAbonnement(m);
		if(!m.getMonAbonnement().getDureeAbonnement().equals(DureeAbonnement.expire)){
			fail("erreur");
		}
	}
	
	/**
	 * La methode editerInfoMembre n'a pas ete developpe dans la classe Employe
	 */
	public void testEditerInfoMembre() {
		fail("Not yet implemented");
	}
	
	/**
	 * test de la methode supprimerMembre
	 * cas d'un membre et d'un employe d'une mediatheque differente non traite
	 * @author nathan
	 */
	public void testSupprimerMembre() {
		Membre m = new Membre();
		Abonnement a = new Abonnement();
		a.setTypeAbonnement(TypeAbonnement.LivDVDSimple);
		Mediatheque media = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",fabrique);
		employe.setMaMediateque(media);
		m.setMaMediateque(media);
		m.setMonAbonnement(a);
		employe.supprimerMembre(m);
		if (!m.getMonAbonnement().getTypeAbonnement().equals(TypeAbonnement.PlusAbonne)){
			fail("Erreur");
		}
	}

	/**
	 * test de la methode ajouterMembre
	 * @author nathan
	 */
	//encore un pb
	public void testAjouterMembre() {
		Mediatheque media = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",fabrique);
		employe.setMaMediateque(media);
		Membre me1 = employe.ajouterMembre("Dupont","Jean","15 rue de rumilly 74000 Annecy","0450123596","22/12/1986",new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		if(!media.getListeMembre().contains(me1)){
			fail("Erreur");
		}
	}
	
	/**
	 * La methode gererCarte n'a pas ete developpe dans la classe Employe
	 */
	public void testGererPerteCarte() {
		fail("Not yet implemented");
	}

	/**
	 * La methode attribuerCarte n'a pas ete developpe dans la classe Employe
	 */
	public void testAttribuerCarte() {
		fail("Not yet implemented");
	}

}
