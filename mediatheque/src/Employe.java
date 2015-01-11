
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
	
	/**@author J�r�me & Nathan
	 * @param
	 */
	public void modifierEtatExemplaire(Exemplaire mExemplaire, EtatExemplaire mEtat) {
		if(mExemplaire.getEtat() != mEtat){
		mExemplaire.setEtat(mEtat);
		}
		else{
			System.out.println("L'exemplaire est deja dans cette etat");
		}
	}

	/**
	 * 
	 */
	public void commanderProduit() {
		// TODO implement here
	}

	/**@author J�r�me & Nathan
	 * @param
	 */
	public void renouvellerAbonnement(Membre mMembre, DureeAbonnement nouvelleDuree, GregorianCalendar dateDebut){
		mMembre.getMonAbonnement().setDureeAbonnement(nouvelleDuree);
		mMembre.getMonAbonnement().setDateDebut(dateDebut);
	}

	/**@author J�r�me & Nathan
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

	/**@author J�r�me & Nathan
	 * @param Membre mMembre
	 */
	public void supprimerMembre(Membre mMembre) {
		if (this.getMaMediateque() == mMembre.getMaMediateque()){
			if (mMembre.getMonAbonnement().getTypeAbonnement() == TypeAbonnement.PlusAbonne){
				System.out.println("Le membre que vous souhaitez supprimer � d�j� �t� supprim� !");
			}else{
				mMembre.getMonAbonnement().setTypeAbonnement(TypeAbonnement.PlusAbonne);
			}
		}else{
			System.out.println("Vous tentez de supprimer un membre appartenant � une m�diath�que diff�rente de la votre !");
		}
	}

	/** ajout d'un membre � la m�diath�que
	 * @author J�r�me & Nathan
	 * @param 
	 */
	public void ajouterMembre(String nom, String prenom, String adresse, String numTelephone, String dateNaissance, Abonnement abonnement) {
		Membre membre = this.getMaMediateque().creerMembre(nom, prenom, adresse, numTelephone, dateNaissance);
		membre.setMonAbonnement(abonnement);
	}
	/**
	 * @author mikael
	 * 
	 */
	public void ajouterEmploye(String nom, String prenom, String adresse, String numTelephone, String dateNaissance){
		this.getMaMediateque().creerEmploye(nom, prenom, adresse, numTelephone, dateNaissance);
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