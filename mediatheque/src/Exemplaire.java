
import java.util.*;

/**
 * 
 */
public class Exemplaire implements SujetEmplacement {

	private String codeExemplaire;
	private EtatExemplaire etat;
	private Boolean disponibilite;
	private Mediatheque emplacement;
	private Mediatheque maMediatheque;
	private Produit monProduit;
	private ArrayList <MediathequeObservatrice>listeObservateurEmplacement;
	
	public Exemplaire(Produit produit) {
		this.monProduit = produit;
		
	}

	public Produit getMonProduit() {
		return monProduit;
	}
	public void setMonProduit(Produit monProduit) {
		this.monProduit = monProduit;
	}
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
		this.listeObservateurEmplacement.add(mediatheque);
		
	}

	@Override
	public void supprimerObservateurEmplacement(Mediatheque mediatheque) {
		this.listeObservateurEmplacement.remove(mediatheque);
		
	}

	@Override
	public String notifierObservateurEmplacement() {
		return emplacement.getNom();
	}
}