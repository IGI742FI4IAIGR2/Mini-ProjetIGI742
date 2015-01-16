
import java.util.*;

/**
 * 
 */
public class Emprunt {

	/**
	 * 
	 */
	public Emprunt(Exemplaire exC, Membre membreC) {
		this.dateEmprunt= new GregorianCalendar();
		this.ex=exC;
		this.membre=membreC;
	}

	/**
	 * Attributs
	 */
	private GregorianCalendar dateEmprunt;
	private GregorianCalendar dateRetour;
	private Exemplaire ex;
	private Membre membre;
	
	public GregorianCalendar getDateEmprunt(){
		return this.dateEmprunt;
	}
	public GregorianCalendar getDateRetour(){
		return this.dateRetour;
	}
	public Exemplaire getExemplaire(){
		return this.ex;
	}
	public Membre getMembre(){
		return this.membre;
	}
	
	public void setDateRetour(){
		this.dateRetour=new GregorianCalendar();
	}

	/**@author jerome
	 * Restitution d'un exemplaire
	 */
	public void restituer(Mediatheque cetteMediatheque) {
		ex.setDisponibilite(true);
		ex.setEmplacement(cetteMediatheque);
		membre.getListeEmprunts().remove(membre.getListeEmprunts().indexOf(this));				  //On retire l emprunt de la liste
		System.out.println("Retour Ok");
		if (ex.getMonProduit().getListeObservateurDisponibilite().size() > 0){
			ex.getMonProduit().notifierObservateurDispo();
		}
		
	}
	
	/**
	 * @author mikael
	 * Relance en cas d'emprunt trop long
	 */
	public int relance(){
		GregorianCalendar today = new GregorianCalendar();
		today.add(Calendar.DATE, 21);;
		return (this.dateEmprunt.compareTo(today));	//compareTo renvoie -1 si dateEmprunt<today 0 si == et 1 si >
	}

}