
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
		if (mMembre.getMonAbonnement().getTypeAbonnement() == TypeAbonnement.PlusAbonne){
			System.out.println("Le membre que vous souhaitez supprimer � d�j� �t� supprim� !");
		}else{
			mMembre.getMonAbonnement().setTypeAbonnement(TypeAbonnement.PlusAbonne);
		}
	}

	/** ajout d'un membre � la m�diath�que
	 * @author J�r�me & Nathan
	 * @param Membre mMembre
	 */
	public void ajouterMembre(Membre mMembre) {
		if (this.getMaMediateque() == mMembre.getMaMediateque()){
			if (!maMediatheque.getListeMembre().contains(mMembre)){
				maMediatheque.getListeMembre().add(mMembre);
			}
		}else{
			System.out.println("Vous tentez de supprimer un membre d'une m�diath�que diff�rente de la votre !");
		}
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