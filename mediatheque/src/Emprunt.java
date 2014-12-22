
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

	/**
	 * Restitution d'un exemplaire
	 */
	public void restituer() {
		// TODO implement here
	}
	
	/**
	 * Relance en cas d'emprunt trop long
	 */
	public int relance(){
		GregorianCalendar today = new GregorianCalendar();
		today.add(Calendar.DATE, 21);;
		return (this.dateEmprunt.compareTo(today));	//compareTo renvoie -1 si dateEmprunt<today 0 si == et 1 si >
	}

}