
import java.util.*;

/**
 * 
 * @author mikael
 */
public class Mediatheque implements MediathequeObservatrice {

	/**
	 * 
	 */
	public Mediatheque(){
		
		 }
	
	public Mediatheque(String nomC, String adresseC, Fabrique fabriqueC) {
		this.nom=nomC;
		this.adresse=adresseC;
		this.fabrique=fabriqueC;
	}

	private String nom;
	private String adresse;
	Fabrique fabrique;

	private ArrayList<Produit> listeProduit=new ArrayList<Produit>();
	private ArrayList<Membre> listeMembre = new ArrayList<Membre>();
	private ArrayList<Employe> listeEmploye = new ArrayList<Employe>();
	
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
		Iterator<Exemplaire> it =listeExemplaires.iterator();
		boolean empruntDispo = false;
		Exemplaire ex = null;
		Emprunt emprunt = null;
		boolean empruntPossible = false;
		
		if(membre.getListeEmprunts().size()<5){
			empruntPossible=true;
		}
		else{
			System.out.println("Vous avez atteint le quota d'emprunt");
		}
		
		while(!empruntDispo && it.hasNext()){
			ex = it.next();
			if(ex.getDisponibilite()){
				empruntDispo=true;
			}
		}
		if(empruntPossible&&empruntDispo){
			fabrique.creerEmprunt(ex,membre);
			ex.ajouterObservateurEmplacement(this);
			ex.setDisponibilite(false);
			System.out.println("Produit emprunté : "+ex.getMonProduit().getTitre()+" exemplaire : "+ex.getCodeExemplaire());
		}
		else{
			System.out.println("Le produit n'est pas disponible, vous pouvez le réserver");
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
		int idEmploye;
		if(this.getListeMembre().size()>0){
			idEmploye = this.getListeMembre().get(this.getListeMembre().size()-1).getIdMembre()+1;
		}
		else{
			idEmploye = 1;
		}
		membre.setIdMembre(idEmploye);
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
		int idEmploye, i;
		if(this.getListeEmploye().size()>0){
			idEmploye = this.getListeEmploye().get(this.getListeEmploye().size()-1).getIdEmploye()+1;
		}
		else{
			idEmploye = 1;
		}
		employe.setIdMembre(idEmploye);
		employe.setMaMediateque(this);
		employe.setMonAbonnement(new Abonnement());
		this.getListeEmploye().add(employe);
		return employe;
	}
	/**
	 * @author mikael
	 */
	public DVD ajouterProduit(String titre, String dateSortie, String resume, String editeur, String reference, GenreFilm genre, Realisateur realisateur){
		DVD produit = fabrique.creerProduit(titre, dateSortie, resume, editeur, reference, genre, realisateur);
		this.listeProduit.add(produit);
		return produit;
		}
	public Ouvrage ajouterProduit(String titre, String dateSortie, String resume, String editeur, String codeISBN, TypeOuvrage type, Auteur auteur){
		Ouvrage produit = fabrique.creerProduit(titre, dateSortie, resume, editeur, codeISBN, type, auteur);
		this.listeProduit.add(produit);
		return produit;
		}
	
	/**
	 * @author mikael
	 * 
	 */
	public void ajouterExemplaire(Produit produit, EtatExemplaire etat, Boolean disponibilite){
		Exemplaire exemplaire = fabrique.creerExemplaire(produit, this);
		exemplaire.setEmplacement(this);
		exemplaire.setDisponibilite(true);
		produit.getListeExemplaires().add(exemplaire);
	}
	
}





