
import java.util.*;

/**
 *       
 */
public class DVD extends Produit {

	private String reference;
	private GenreFilm genre;
	private Realisateur realisateur;

	public DVD() {
	}

	public DVD(String titre, String dateSortie, String resume, String editeur,
			String reference2, GenreFilm genre2, Realisateur realisateur) {
		this.setTitre(titre);
		this.setDateSortie(dateSortie);
		this.setgenre(genre2);
		this.setResume(resume);
		this.setEditeur(editeur);
		this.setreference(reference2);
		this.realisateur=realisateur;
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
	public void setRealisateur(Realisateur realisateur){
		this.realisateur=realisateur;
	}
	public Realisateur getRealisateur(){
		return this.realisateur;
	}
}