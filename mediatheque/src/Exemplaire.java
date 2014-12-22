
import java.util.*;

/**
 * 
 */
public class Exemplaire implements SujetEmplacement {

	/**
	 * 
	 */
	public Exemplaire(Produit produit) {
	}

	/**
	 * 
	 */
	private String codeExemplaire;
	private EtatExemplaire etat;
	private Boolean disponibilite;
	private Mediatheque emplacement;
	private Mediatheque maMediatheque;
	private ArrayList <MediathequeObservatrice>listeObservateurEmplacement;
	
	public String getCodeExemplaire(){
		return this.codeExemplaire;
	}
	public EtatExemplaire getEtat(){
		return this.etat;
	}
	public Boolean getDisponibilite(){
		return this.disponibilite;
	}
	public Mediatheque getEmplacement(){
		return this.emplacement;
	}
	public Mediatheque getMaMediatheque(){
		return this.maMediatheque;
	}
	
	public void setEtat(EtatExemplaire etatChange){
		this.etat=etatChange;
	}
	public void setDisponibilite(Boolean dispo){
		this.disponibilite=dispo;
	}
	public void setEmplacement(Mediatheque media){
		this.emplacement=media;
	}
	
	

	@Override
	public void ajouterObservateurEmplacement(Mediatheque mediatheque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerObservateurEmplacement(Mediatheque mediatheque) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurEmplacement() {
		// TODO Auto-generated method stub
		
	}



}