
import java.util.*;

/**
 * 
 */
public class Fabrique {

	
	/**
	 * 
	 */
	public DVD creerProduit(String titre, Date dateSortie, String resume, String editeur, String reference, GenreFilm genre) {
			DVD produit = new DVD(titre, dateSortie, resume, editeur, reference, genre);
			return produit;
	}
	public Ouvrage creerProduit(String titre, Date dateSortie, String resume, String editeur, String codeISBN, TypeOuvrage type) {
		Ouvrage produit = new Ouvrage(titre, dateSortie, resume, editeur, codeISBN, type);
		return produit;
}
	
	/**
	 * 
	 */
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