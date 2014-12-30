
import java.util.*;

/**
 * 
 */
public class Abonnement {

	/**
	 * 
	 */
	public Abonnement() {
	}

	/**
	 * 
	 */
	public int idAbonnement;

	/**
	 * 
	 */
	public GregorianCalendar dateDebut;

	/**
	 * 
	 */
	public DureeAbonnement dureeAbonnement ;

	/**
	 * 
	 */
	public TypeAbonnement typeAbonnement;

	// Getters & Setters
	
	public int getIdAbonnement() {
		return idAbonnement;
	}

	public void setIdAbonnement(int idAbonnement) {
		this.idAbonnement = idAbonnement;
	}

	public GregorianCalendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(GregorianCalendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public DureeAbonnement getDureeAbonnement() {
		return dureeAbonnement;
	}

	public void setDureeAbonnement(DureeAbonnement dureeAbonnement) {
		this.dureeAbonnement = dureeAbonnement;
	}

	public TypeAbonnement getTypeAbonnement() {
		return typeAbonnement;
	}

	public void setTypeAbonnement(TypeAbonnement typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}


}