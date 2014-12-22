
import java.util.*;

/**
 * 
 */
public class Emprunt {

	/**
	 * 
	 */
	public Emprunt(Exemplaire exC, Membre membreC) {
		this.dateEmprunt= new Date();
		this.ex=exC;
		this.membre=membreC;
	}

	/**
	 * Attributs
	 */
	private Date dateEmprunt;
	private Date dateRetour;
	private Exemplaire ex;
	private Membre membre;
	
	public Date getDateEmprunt(){
		return this.dateEmprunt;
	}
	public Date getDateRetour(){
		return this.dateRetour;
	}
	public Exemplaire getExemplaire(){
		return this.ex;
	}
	public Membre getMembre(){
		return this.membre;
	}
	
	public void setDateRetour(){
		this.dateRetour=new Date();
	}

	/**
	 * 
	 */
	public void restituer() {
		// TODO implement here
	}
	
	/**
	 * Relance en cas d'emprunt trop long
	 */
	

}