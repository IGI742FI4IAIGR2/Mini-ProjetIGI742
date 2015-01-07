
import java.util.*;

/**
 *       
 */
public class DVD extends Produit {

	public String reference;
	public GenreFilm genre;

	public DVD() {
	}

	public DVD(String titre, Date dateSortie, String resume, String editeur,
			String reference2, GenreFilm genre2) {
		// TODO Auto-generated constructor stub
	}
	
	//on va donné une référence 
	public void setreference(String reference) {
		this.reference= reference;
	}
	
	//on va récupéré la référence 
	public String getreference() {
		return reference;
	}
		
	//on va donné un genre 
	public void setgenre(GenreFilm genre) {
		this.genre= genre; 
	}
	
	//on va récupéré le genre
	public GenreFilm getgenre() {
		return genre;
	}
}