
import java.util.*;

/**
 * Classe Ouvrage
 * @author Marion
 */
public class Ouvrage extends Produit {

	//D�claration des variables
		private String 			codeISBN;
		private TypeOuvrage 		type;
		
	public Ouvrage() {
		super();
	}
	
	public Ouvrage(String titre, Date dateSortie, String resume,
			String editeur, String codeISBN2, TypeOuvrage type2) {
		super();
		this.setTitre(titre);
		this.setDateSortie(dateSortie);
		this.setResume(resume);
		this.setCodeISBN(codeISBN2);
		this.setEditeur(editeur);
		this.setType(type2);
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

}