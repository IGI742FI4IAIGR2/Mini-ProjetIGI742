
import java.util.*;

/**
 * 
 */
public class Exemplaire implements SujetEmplacement {

	private int codeExemplaire;
	private EtatExemplaire etat;
	private Boolean disponibilite;
	private Mediatheque emplacement;
	private Mediatheque maMediatheque;
	private Produit monProduit;
	private ArrayList <MediathequeObservatrice>listeObservateurEmplacement= new ArrayList <MediathequeObservatrice>();
	
	public Exemplaire(Produit produit, Mediatheque mediatheque) {
		this.monProduit = produit;
		this.maMediatheque=mediatheque;
		codeExemplaire=1;
		int i;
		this.disponibilite = true;
		if(monProduit.getListeExemplaires().size() > 0){
			for(i=0;i<monProduit.getListeExemplaires().size();i++){
				if(codeExemplaire<monProduit.getListeExemplaires().get(i).getCodeExemplaire()){
					codeExemplaire=i+1;
				}
			}
		}
		
		
	}

	public Produit getMonProduit() {
		return monProduit;
	}
	public void setMonProduit(Produit monProduit) {
		this.monProduit = monProduit;
	}
	public int getCodeExemplaire(){
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