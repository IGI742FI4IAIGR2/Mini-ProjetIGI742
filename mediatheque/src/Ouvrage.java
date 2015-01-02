
import java.util.*;

/**
 * Classe Ouvrage
 * @author Marion
 */
public class Ouvrage extends Produit {

	//Déclaration des variables
		public String 			codeISBN;
		public TypeOuvrage 		type;
		
	public Ouvrage() {
		super();
	}
	
	public Ouvrage(String titre, Date dateSortie, String resume,
			String editeur, String codeISBN2, TypeOuvrage type2) {
		super();
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