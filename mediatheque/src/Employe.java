
import java.util.*;

/**
 * 
 */
public class Employe extends Membre {

	/**
	 * 
	 */
	private int idEmploye;
	
	/**
	 * 
	 */
	public Employe(int idEmploye) {
		this.idEmploye=idEmploye;
	}

	// Getters & Setters
	public int getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}
	
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
	 * @param
	 */
	public void renouvellerAbonnement(Membre mMembre, DureeAbonnement nouvelleDuree, GregorianCalendar dateDebut){
		mMembre.getMonAbonnement().setDureeAbonnement(nouvelleDuree);
		mMembre.getMonAbonnement().setDateDebut(dateDebut);
	}

	/**@author Jérôme & Nathan
	 * @param
	 */
	public void supprimerAbonnement(Membre mMembre) {
		mMembre.getMonAbonnement().setDureeAbonnement(DureeAbonnement.expire);
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
		if (this.getMaMediateque() == mMembre.getMaMediateque()){
			if (mMembre.getMonAbonnement().getTypeAbonnement() == TypeAbonnement.PlusAbonne){
				System.out.println("Le membre que vous souhaitez supprimer à déjà été supprimé !");
			}else{
				mMembre.getMonAbonnement().setTypeAbonnement(TypeAbonnement.PlusAbonne);
			}
		}else{
			System.out.println("Vous tentez de supprimer un membre appartenant à une médiathèque différente de la votre !");
		}
	}

	/** ajout d'un membre à la médiathèque
	 * @author Jérôme & Nathan
	 * @param Membre mMembre
	 */
	public void ajouterMembre(Membre mMembre) {
		if (this.getMaMediateque() == mMembre.getMaMediateque()){
			if (!maMediatheque.getListeMembre().contains(mMembre)){
				maMediatheque.getListeMembre().add(mMembre);
			}
		}else{
			System.out.println("Vous tentez d'ajouter un membre dans une médiathèque différente de la votre !");
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