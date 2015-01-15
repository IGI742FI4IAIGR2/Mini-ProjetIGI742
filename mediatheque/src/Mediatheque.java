
import java.util.*;

/**
 * 
 * @author mikael
 */
public class Mediatheque implements MediathequeObservatrice {

	/**
	 * 
	 */
	public Mediatheque(String nomC, String adresseC, Fabrique fabriqueC) {
		this.nom=nomC;
		this.adresse=adresseC;
		this.fabrique=fabriqueC;
	}

	private String nom;
	private String adresse;
	Fabrique fabrique;

	private ArrayList<Produit> listeProduit;
	private ArrayList<Membre> listeMembre;
	private ArrayList<Employe> listeEmploye;
	
	/**
	 * @author nathan
	 * Getter listeProduit
	 */
	public ArrayList<Produit> getListeProduit() {
		return listeProduit;
	}
	/**
	 * @author nathan
	 * Setter listeProduit
	 */
	public void setListeProduit(ArrayList<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	/**
	 * @author nathan
	 * Getter listeMembre
	 */
	public ArrayList<Membre> getListeMembre() {
		return listeMembre;
	}
	/**
	 * @author nathan
	 * Setter listeMembre
	 */
	public void setListeMembre(ArrayList<Membre> listeMembre) {
		this.listeMembre = listeMembre;
	}
	/**
	 * @author mikael
	 */
	public ArrayList<Employe> getListeEmploye(){
		return listeEmploye;
	}
	/**
	 * @author mikael
	 * Getter nom
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * @author mikael
	 * @ Getter adresse
	 */
	public String getAdresse(){
		return this.adresse;
	}


	/**
	 * @author mikael
	 * @ changer l'emplacement d'un exemplaire
	 * @param Exemplaire
	 */
	public void rapatrierExemplaire(Exemplaire ex) {
		ex.setEmplacement(ex.getMaMediatheque());
	}
	
	/**
	 * emprunt d'un produit
	 * @author mikael
	 * @param Produit
	 */
	public Emprunt emprunterProduit(Produit produit, Membre membre) {
		ArrayList<Exemplaire> listeExemplaires=produit.getListeExemplaires();
		Exemplaire ex=null;
		Emprunt emprunt=null;
		boolean empruntPossible=false;
		if(membre.getListeEmprunts().size()<5){
			empruntPossible=true;
		}
		else{
			System.out.print("Vous avez atteint le quota d'emprunt");
		}
		boolean empruntDispo=false;
		Iterator<Exemplaire> it =listeExemplaires.iterator();
		while(!empruntDispo | it.hasNext()){
			ex = it.next();
			if(ex.getDisponibilite()){
				empruntDispo=true;
			}
		}
		if(empruntPossible&&empruntDispo){
			fabrique.creerEmprunt(ex,membre);
			ex.ajouterObservateurEmplacement(this);
			System.out.print("Produit emprunté");
		}
		else{
			System.out.print("Le produit n'est pas disponible, vous pouvez le réserver");
		}
		return emprunt;
	}

	/**
	 * @author mikael
	 * Reservation d'un produit
	 */
	public void reserverProduit(Produit produitAReserver, Membre membre) {
		produitAReserver.ajouterObservateurDispo(membre);
	}

	/**
	 * Rappatrier un exemplaire rendu dans une autre médiathèque
	 * @author mikael
	 * @param Exemplaire ex
	 */
	public void verifierEmplacement(Exemplaire ex) {
		if(ex.getEmplacement()!=ex.getMaMediatheque()){
			rapatrierExemplaire(ex);
		}
		ex.supprimerObservateurEmplacement(this);
	}
	
	/**
	 * @author mikael
	 * 
	 */
	public Membre creerMembre(String nom, String prenom, String adresse, String numTelephone, String dateNaissance){
		Membre membre = fabrique.creerMembre(nom, prenom, adresse, numTelephone, dateNaissance);
		int idMembre = this.getListeMembre().get(this.getListeMembre().size()-1).getIdMembre()+1;
		membre.setIdMembre(idMembre);
		membre.setMaMediateque(this);
		this.getListeMembre().add(membre);
		return membre;
	}
	/**
	 * @author mikael
	 * 
	 */
	public Employe creerEmploye(String nom, String prenom, String adresse, String numTelephone, String dateNaissance){
		Employe employe = fabrique.creerEmploye(nom, prenom, adresse, numTelephone, dateNaissance);
		int idEmploye = this.getListeEmploye().get(this.getListeEmploye().size()-1).getIdEmploye()+1;
		employe.setIdMembre(idEmploye);
		employe.setMaMediateque(this);
		employe.setMonAbonnement(new Abonnement());
		this.getListeEmploye().add(employe);
		return employe;
	}
	
}





