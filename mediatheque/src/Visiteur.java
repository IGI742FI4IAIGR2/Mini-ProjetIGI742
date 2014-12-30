
import java.util.*;

/**
 * 
 */
public class Visiteur extends Personne {
	
	/**
	 * 
	 */
	public Visiteur() {
	}
	
	/**
	 * 
	 */
	public Mediatheque maMediatheque;
	
	/** 
	 * retourne la liste des produits présents dans la médiathèque
	 * @author jérôme & nathan
	 * @param maMediatheque
	 * @return une liste de Produits
	 */
	public ArrayList<Produit> consulterProduits(Mediatheque maMediatheque) {
		return maMediatheque.getListeProduits;
	}

}