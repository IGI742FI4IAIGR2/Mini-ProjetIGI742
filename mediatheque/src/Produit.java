
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
		this.listeObservateurDisponibilite.add(membre);
		
	}

	@Override
	public void supprimerObservateurDispo(Membre membre) {
		this.listeObservateurDisponibilite.remove(membre);
	}

	@Override
	public void notifierObservateurDispo() {
		this.getListeObservateurDisponibilite().get(0).verifierDisponibilite(this);
		
	}

	public ArrayList<Membre> getListeObservateurDisponibilite() {
		return listeObservateurDisponibilite;
	}



}