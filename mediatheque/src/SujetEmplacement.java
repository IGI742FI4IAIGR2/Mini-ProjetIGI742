/**
 * @author Marion
 * Interface pour l'�v�nement "l'emplacement de l'exemplaire a chang�"
 */

public interface SujetEmplacement {

	public void ajouterObservateurEmplacement(Mediatheque mediatheque);
	public void supprimerObservateurEmplacement(Mediatheque mediatheque);
	public String notifierObservateurEmplacement();

}