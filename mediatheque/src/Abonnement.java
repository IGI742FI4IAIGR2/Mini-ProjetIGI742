
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
	public Date dateDebut;

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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
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