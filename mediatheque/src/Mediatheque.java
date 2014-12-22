
import java.util.*;

/**
 * 
 * @author mikael
 */
public class Mediatheque implements MediathequeObservatrice {

	/**
	 * 
	 */
	public Mediatheque(String nomC, String adresseC, Fabrique fabriqueC) {
		this.nom=nomC;
		this.adresse=adresseC;
		this.fabrique=fabriqueC;
	}

	private String nom;
	private String adresse;
	Fabrique fabrique;
	/**
	 * @author mikael
	 * Getter nom
	 */
	public String getNom(){
		return this.nom;
	}
	/**
	 * @author mikael
	 * @ Getter adresse
	 */
	public String getAdresse(){
		return this.adresse;
	}



	/**
	 * @author mikael
	 * @ changer l'emplacement d'un exemplaire
	 * @param Exemplaire
	 */
	public void rapatrierExemplaire(Exemplaire ex) {
		ex.setEmplacement(ex.getMaMediatheque());
	}
	
	/**
	 * emprunt d'un produit
	 * @author mikael
	 * @param Produit
	 */
	public boolean emprunterProduit(Produit produit, Membre membre) {
		ArrayList<Exemplaire> listeExemplaires=produit.getListeExemplaires();
		Exemplaire ex=null;
		boolean empruntPossible=false;
		Iterator<Exemplaire> it =listeExemplaires.iterator();
		while(!empruntPossible | it.hasNext()){
			ex = it.next();
			if(ex.getDisponibilite()){
				empruntPossible=true;
			}
		}
		if(empruntPossible){
			fabrique.creerEmprunt(ex,membre);
			ex.ajouterObservateurEmplacement(this);
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * @author mikael
	 * Reservation d'un produit
	 */
	public void reserverProduit(Produit produitAReserver, Membre membre) {
		produitAReserver.ajouterObservateurDispo(membre);
	}

	/**
	 * Rappatrier un exemplaire rendu dans une autre médiathèque
	 * @author mikael
	 * @param Exemplaire ex
	 */
	public void verifierEmplacement(Exemplaire ex) {
		if(ex.getEmplacement()!=ex.getMaMediatheque()){
			rapatrierExemplaire(ex);
		}
		ex.supprimerObservateurEmplacement(this);
	}
	
}