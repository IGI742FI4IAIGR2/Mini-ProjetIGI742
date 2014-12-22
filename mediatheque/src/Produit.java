
import java.util.*;

/**
 * 
 */
public class Produit implements SujetDisponibilite {

	/**
	 * 
	 */
	public Produit() {
	}

	private String titre;
	private Date dateSortie;
	private String resume;
	private String editeur;
	private ArrayList<Exemplaire> listeExemplaires;
	private ArrayList<Membre> listeObservateurDisponibilite;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	
	public ArrayList<Exemplaire> getListeExemplaires(){
		return this.listeExemplaires;
	}

	@Override
	public void ajouterObservateurDispo(Membre membre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerObservateurDispo(Membre membre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurDispo() {
		// TODO Auto-generated method stub
		
	}



}