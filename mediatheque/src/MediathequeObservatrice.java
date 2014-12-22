
import java.util.*;

/**
 * @author mikael
 * @description interface permettant de détecter le changement d'emplacement des exemplaires
 */
public interface MediathequeObservatrice {

	/**
	 * @author mikael
	 * @param ExemplaireDVD
	 */
	public void verifierEmplacement(ExemplaireDVD ex);
	/**
	 * @author mikael
	 * @param ExemplaireLivre
	 */
	public void verifierEmplacement(ExemplaireLivre ex);
	

}