
import java.util.*;

/**
 * 
 */
public class Fabrique {

	
	/**
	 * 
	 */
	public DVD creerProduit(String titre, String dateSortie, String resume, String editeur, String reference, GenreFilm genre, Realisateur realisateur) {
		DVD produit = new DVD(titre, dateSortie, resume, editeur, reference, genre, realisateur);
		return produit;
	}
	
	public Ouvrage creerProduit(String titre, String dateSortie, String resume, String editeur, String codeISBN, TypeOuvrage type, Auteur auteur) {
		Ouvrage produit = new Ouvrage(titre, dateSortie, resume, editeur, codeISBN, type, auteur);
		return produit;
	}
	
	/**
	 * 
	 */
	public Exemplaire creerExemplaire(Produit produit, Mediatheque mediatheque){
		Exemplaire exemplaire = new Exemplaire(produit, mediatheque);
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