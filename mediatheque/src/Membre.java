
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
	private String idMembre;

	/**
	 * 
	 */
	private String adresse;

	/**
	 * 
	 */
	private String numtelephone;

	/**
	 * 
	 */
	private int nombre;

	/**
	 * 
	 */
	private String dateNaissance;
	
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
	private ArrayList<Emprunt> listeEmprunts;
	
	/**
	 * 
	 */
	private String mdp;



	/**
	 * 
	 */
	public void demandeReservation() {
		// TODO implement here
	}

	/**@author Jérôme & Nathan
	 * @param idMembre
	 * @param mdp
	 */
	public boolean identification(String idMembre, String mdp) {
		if(this.idMembre == idMembre && this.mdp == mdp){
			System.out.println("Vous vous êtes correctement identifié! ");
			return true;
		}else{
			System.out.println("Identification impossible! ");
			return false;
		}
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

	// Getters & Setters
	
	public Abonnement getMonAbonnement() {
		return monAbonnement;
	}

	public void setMonAbonnement(Abonnement monAbonnement) {
		this.monAbonnement = monAbonnement;
	}

	public String getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(String idMembre) {
		this.idMembre = idMembre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumtelephone() {
		return numtelephone;
	}

	public void setNumtelephone(String numtelephone) {
		this.numtelephone = numtelephone;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Mediatheque getMaMediateque() {
		return maMediateque;
	}

	public void setMaMediateque(Mediatheque maMediateque) {
		this.maMediateque = maMediateque;
	}

	public ArrayList<Emprunt> getListeEmprunts() {
		return listeEmprunts;
	}

	public void setListeEmprunts(ArrayList<Emprunt> listeEmprunts) {
		this.listeEmprunts = listeEmprunts;
	}
	
	

}