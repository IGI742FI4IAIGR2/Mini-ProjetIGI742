
import java.util.*;

/**
 * 
 */
public class Emprunt {

	/**
	 * 
	 */
	public Emprunt(ExemplaireDVD exC, Membre membreC) {
		this.dateEmprunt= new Date();
		this.ex=exC;
		this.membre=membreC;
	}

	/**
	 * Attributs
	 */
	private Date dateEmprunt;
	private Date dateRetour;
	private ExemplaireDVD ex;
	private Membre membre;
	
	public Date getDateEmprunt(){
		return this.dateEmprunt;
	}
	public Date getDateRetour(){
		return this.dateRetour;
	}
	public ExemplaireDVD getExemplaire(){
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
	 * Relance en cas d'emrpunt trop long
	 */
	

}