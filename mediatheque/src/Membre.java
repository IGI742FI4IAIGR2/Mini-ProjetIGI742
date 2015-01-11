import java.util.*;

/**
 * @author 
 */
public class Membre extends Visiteur implements MembreObservateur {

	private int idMembre;
	private String adresse;
	private String numtelephone;
	private int nombre;
	private String dateNaissance;
	private Abonnement monAbonnement;
	private Mediatheque maMediateque;
	private ArrayList<Emprunt> listeEmprunts;
	private String mdp;
	
	public Membre() {
	}

	public Membre(String nom, String prenom, String adresse2,
			String numTelephone2, String dateNaissance2) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.adresse = adresse2;
		this.numtelephone = numTelephone2;
		this.dateNaissance = dateNaissance2;
	}
	
	/**
	 * 
	 */
	public void demandeReservation() {
		// TODO implement here
	}

	/**@author Jerome & Nathan
	 * @param idMembre
	 * @param mdp
	 */
	public boolean identification(int idMembre, String mdp) {
		if(this.idMembre == idMembre && this.mdp == mdp){
			System.out.println("Vous vous ���tes correctement identifi���! ");
			return true;
		}else{
			System.out.println("Identification impossible! ");
			return false;
		}
	}

	/**@author Jerome
	 *@param
	 */
	public void demandeEmprunt(Produit mProduit) {
		if(this.monAbonnement.getDureeAbonnement() != DureeAbonnement.expire){
			this.maMediateque.emprunterProduit(mProduit, this);
		}
		else{
			System.out.println("Vous n etes plus abonnee");
		}
	}

	@Override
	public void verifierDisponibilite(Produit ceProduit) {
		demandeEmprunt(ceProduit);
		
	}

	// Getters & Setters
	
	public Abonnement getMonAbonnement() {
		return monAbonnement;
	}

	public void setMonAbonnement(Abonnement monAbonnement) {
		this.monAbonnement = monAbonnement;
	}

	public String setmdp(){
		return mdp;
	}
	
	public int getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(int idMembre) {
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
