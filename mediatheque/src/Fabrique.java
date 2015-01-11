
import java.util.*;

/**
 * 
 */
public class Fabrique {

	
	/**
	 * 
	 */
	public Produit creerProduit(String titre, Date dateSortie, String resume, String editeur, String reference, GenreFilm genre) {
		Produit produit = new DVD(titre,dateSortie,resume,editeur,reference,genre);
		return produit;
	}
	
	/**
	 * 
	 */
	public Produit creerProduit(String titre, Date dateSortie, String resume, String editeur, String codeISBN, TypeOuvrage type) {
		Produit produit = new Ouvrage(titre,dateSortie,resume,editeur,codeISBN,type);
		return produit;
	}
	
	public Exemplaire creerExemplaire(Produit produit){
		Exemplaire exemplaire = new Exemplaire(produit);
		return exemplaire;
	}

	/**
	 * 
	 */
	public Membre creerMembre(String nom, String prenom, String adresse, String numTelephone, String dateNaissance) {
		Membre membre = new Membre(nom, prenom, adresse, numTelephone, dateNaissance);
		return membre;
	}
	public Employe creerEmploye(String nom, String prenom, String adresse, String numTelephone, String dateNaissance){
		Employe employe = new Employe(nom, prenom, adresse, numTelephone, dateNaissance);
		return employe;
	}

	/**
	 * 
	 */
	public Emprunt creerEmprunt(Exemplaire ex, Membre membre) {
		Emprunt emprunt = new Emprunt(ex,membre);
		return emprunt;
	}

	/**
	 * 
	 */
	public void creerCommande() {
		// TODO implement here
	}

}