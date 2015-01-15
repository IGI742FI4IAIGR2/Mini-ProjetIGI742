
import java.util.*;

/**
 * 
 */
public class Produit implements SujetDisponibilite {

	private String titre;
	private String dateSortie;
	private String resume;
	private String editeur;
	private ArrayList<Exemplaire> listeExemplaires;
	private ArrayList<Membre> listeObservateurDisponibilite;
	
	public Produit() {
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
		this.listeObservateurDisponibilite.get(0).verifierDisponibilite(this); //On notifie l observateur
		this.listeObservateurDisponibilite.remove(0);							//On le retire de la liste
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(String dateSortie2) {
		this.dateSortie = dateSortie2;
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

	public ArrayList<Membre> getListeObservateurDisponibilite() {
		return listeObservateurDisponibilite;
	}
}