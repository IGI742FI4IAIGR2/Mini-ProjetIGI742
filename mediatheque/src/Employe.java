
import java.util.*;

/**
 * 
 */
public class Employe extends Membre {

	/**
	 * 
	 */
	public Employe() {
	}

	/**
	 * 
	 */
	public int idEmploye;


	/**
	 * 
	 */
	public void modifierEtatProduit() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void commanderProduit() {
		// TODO implement here
	}

	/**@author J�r�me & Nathan
	 * 
	 */
	public void renouvellerAbonnement(Membre mMembre, DureeAbonnement nnouvelleDuree){
		//mMembre.
		// TODO implement here
	}

	/**
	 * 
	 */
	public void supprimerAbonnement() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void editerInfoMembre() {
		// TODO implement here
	}

	/**@author J�r�me & Nathan
	 * @param Membre mMembre
	 */
	public void supprimerMembre(Membre mMembre) {
		mMembre.getMonAbonnement().setTypeAbonnement(TypeAbonnement.PlusAbonne);;
		// TODO implement here
	}

	/**
	 * 
	 */
	public Membre ajouterMembre() {
		return null;
		// TODO implement here
	}

	/**
	 * 
	 */
	public void gererPerteCarte() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void attribuerCarte() {
		// TODO implement here
	}

}