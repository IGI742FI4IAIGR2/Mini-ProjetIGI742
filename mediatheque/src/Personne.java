/**
 * 
 * @author jérôme & nathan
 */

public class Personne {
	
	private String nom;
	private String prenom;
	
	// Constructeurs
	public Personne(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
		
	}
	
	public Personne(){
		
	}

	// Getters & Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// Méthodes
	public String toString() {
		return "nom: " + this.nom + "prénom: " + this.prenom;
	}
	
}
