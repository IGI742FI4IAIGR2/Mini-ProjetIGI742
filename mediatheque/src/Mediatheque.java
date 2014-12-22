
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
	public void emprunterProduit(Produit produit, Membre membre) {
		ArrayList<Exemplaire> listeExemplaires=produit.getListeExemplaires();
		Exemplaire ex=null;
		boolean empruntPossible=false;
		if(size(membre.getListeEmprunts)<5){
			empruntPossible=true;
		}
		else{
			System.out.print("Vous avez atteint le quota d'emprunt");
		}
		boolean empruntDispo=false;
		Iterator<Exemplaire> it =listeExemplaires.iterator();
		while(!empruntDispo | it.hasNext()){
			ex = it.next();
			if(ex.getDisponibilite()){
				empruntDispo=true;
			}
		}
		if(empruntPossible&&empruntDispo){
			fabrique.creerEmprunt(ex,membre);
			ex.ajouterObservateurEmplacement(this);
			System.out.print("Produit emprunté");
		}
		else{
			System.out.print("Le produit n'est pas disponible, vous pouvez le réserver");
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