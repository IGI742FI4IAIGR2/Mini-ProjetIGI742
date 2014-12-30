
import java.util.*;

/**
 * 
 */
public class Membre extends Visiteur implements MembreObservateur {

	/**
	 * 
	 */
	public Membre() {
	}

	public Membre(String nom, String prenom, String adresse2,
			String numTelephone2, Date dateNaissance2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public String idMembre;

	/**
	 * 
	 */
	public String adresse;

	/**
	 * 
	 */
	public String numtelephone;

	/**
	 * 
	 */
	public int nombre;

	/**
	 * 
	 */
	public String dateNaissance;
	
	/**
	 * 
	 */
	private Abonnement monAbonnement;
	
	/**
	 * 
	 */
	private Mediatheque maMediateque;




	/**
	 * 
	 */
	public void demandeReservation() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void identification() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void demandeEmprunt() {
		// TODO implement here
	}

	@Override
	public void verifierDisponibilite() {
		// TODO Auto-generated method stub
		
	}

	public Abonnement getMonAbonnement() {
		return monAbonnement;
	}

	public void setMonAbonnement(Abonnement monAbonnement) {
		this.monAbonnement = monAbonnement;
	}
	
	

}