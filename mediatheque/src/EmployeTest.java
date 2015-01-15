import java.util.ArrayList;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

/**
 * @author NATHAN
 *
 */
public class EmployeTest extends TestCase {

	
	private Employe employe = new Employe(1);
	protected static Fabrique fabrique;
	
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
		Membre m = new Membre();
		ArrayList<Membre> listeMembre = new ArrayList<Membre>();
		Mediatheque media = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",fabrique);
		employe.setMaMediateque(media);
		media.setListeMembre(listeMembre );
		employe.ajouterMembre("Dupont", "Georges", "3 rue du pont 74000 Annecy", "0404040404", "01/01/1965", new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		if(!media.getListeMembre().contains(m)){
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
