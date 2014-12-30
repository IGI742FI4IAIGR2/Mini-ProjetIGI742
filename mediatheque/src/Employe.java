
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

	/**@author Jérôme & Nathan
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

	/**@author Jérôme & Nathan
	 * @param Membre mMembre
	 */
	public void supprimerMembre(Membre mMembre) {
		if (mMembre.getMonAbonnement().getTypeAbonnement() == TypeAbonnement.PlusAbonne){
			System.out.println("Le membre que vous souhaitez supprimer à déjà été supprimé !");
		}else{
			mMembre.getMonAbonnement().setTypeAbonnement(TypeAbonnement.PlusAbonne);
		}
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