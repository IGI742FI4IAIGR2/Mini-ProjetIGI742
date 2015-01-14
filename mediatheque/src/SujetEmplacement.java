/**
 * @author Marion
 * Interface pour l'évènement "l'emplacement de l'exemplaire a changé"
 */

public interface SujetEmplacement {

	public void ajouterObservateurEmplacement(Mediatheque mediatheque);
	public void supprimerObservateurEmplacement(Mediatheque mediatheque);
	public String notifierObservateurEmplacement();

}