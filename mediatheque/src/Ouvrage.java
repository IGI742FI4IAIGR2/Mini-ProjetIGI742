
import java.util.*;

/**
 * Classe Ouvrage
 * @author Marion
 */
public class Ouvrage extends Produit {

	//D�claration des variables
		private String 			codeISBN;
		private TypeOuvrage 		type;
		private Auteur auteur;
		
	public Ouvrage() {
		super();
	}
	
	public Ouvrage(String titre, String dateSortie, String resume,
			       String editeur, String codeISBN2, TypeOuvrage type2, Auteur auteur) {
		super();
		this.setTitre(titre);
		this.setDateSortie(dateSortie);
		this.setResume(resume);
		this.setCodeISBN(codeISBN2);
		this.setEditeur(editeur);
		this.setType(type2);
		this.auteur = auteur;
	}
	
	//Getter et Setter
		public String getCodeISBN()
		{
			return codeISBN;
		}
	
		public void setCodeISBN(String codeISBN)
		{
			this.codeISBN 		= codeISBN;
		}
	
		public TypeOuvrage getType()
		{
			return type;
		}
	
		public void setType(TypeOuvrage type)
		{
			this.type 			= type;
		}

		public Auteur getAuteur() {
			return auteur;
		}

		public void setAuteur(Auteur auteur) {
			this.auteur = auteur;
		}

}