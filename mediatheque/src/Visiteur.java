
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
	 * retourne la liste des produits pr�sents dans la m�diath�que
	 * @author j�r�me & nathan
	 * @param maMediatheque
	 * @return une liste de Produits
	 */
	public ArrayList<Produit> consulterProduits(Mediatheque maMediatheque) {
		return maMediatheque.getListeProduit();
	}

}