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
	
	/**@author Jerome
	 * @param
	 */
	public void demandeReservation(Produit mProduit) {
		this.maMediateque.reserverProduit(mProduit, this);
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
			Emprunt emprunt =this.maMediateque.emprunterProduit(mProduit, this);
			if(emprunt!=null){
				this.listeEmprunts.add(emprunt);
			}
		}
		else{
			System.out.println("Vous n etes plus abonnee");
		}
	}

	/**@author Jerome
	 *@param
	 */
	public void rendreEmprunt(Mediatheque mMedia, Emprunt mEmprunt) {
		int index;
		boolean bRendre = false;
		
		if(mMedia == this.maMediateque) //Si mediatheque est celle du membre
		{
			bRendre = true;
		}
		else //Sinon on verifie le type d abonnement
		{
			if(this.monAbonnement.getTypeAbonnement() == TypeAbonnement.LivPass || this.monAbonnement.getTypeAbonnement() == TypeAbonnement.LivDVDPass) //Si abo. Ok
			{
				bRendre = true;
			}
			else
			{
				bRendre = false;
			}
		}
		
		if(this.listeEmprunts.contains(mEmprunt) && bRendre){ //On verifie si l'emprunt est dans la liste et si on peut restituer
			index = this.listeEmprunts.lastIndexOf(mEmprunt); //On recupere l index de l emprunt dans la liste
			this.listeEmprunts.get(index).restituer(mMedia);  //On appel la methode de restituion
			this.listeEmprunts.remove(index);				  //On retire l emprunt de la liste
			System.out.println("Retour Ok");
		}
		else{
			System.out.println("Restitution Impossible");
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

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
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
