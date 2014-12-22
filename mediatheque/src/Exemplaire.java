
import java.util.*;

/**
 * 
 */
public class Exemplaire implements SujetEmplacement {

	/**
	 * 
	 */
	public Exemplaire(Produit produit) {
	}

	/**
	 * 
	 */
	public String codeExemplaire;

	/**
	 * 
	 */
	public EtatExemplaire etat;

	/**
	 * 
	 */
	public Boolean disponibilite;

	/**
	 * 
	 */
	public String emplacement;

	/**
	 * 
	 */
	public Mediatheque maMediatheque;

	/**
	 * 
	 */
	public ArrayList <MediathequeObservatrice>listeObservateurEmplacement;

	@Override
	public void ajouterObservateurEmplacement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerObservateurEmplacement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurEmplacement() {
		// TODO Auto-generated method stub
		
	}



}