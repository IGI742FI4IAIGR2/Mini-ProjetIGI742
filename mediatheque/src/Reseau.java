
import java.util.*;

/**
 * 
 */
public class Reseau {

	
	
	public static void main(String[] args){
		Fabrique f1 = new Fabrique();
		Mediatheque media1 = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",f1);
		Employe e1 = media1.creerEmploye("Dupont", "Robert", "1 rue de chez lui 74000 annecy", "0404040404", "01/01/1960");	
		
		Auteur pennac = new Auteur("Pennac", "Daniel");
		Ouvrage feeCarabine = e1.ajouterProduit("La Fée carabine", "1987", "L'inspecteur de police Vanini faisait un tour de quartier quand il est tué par une vieille dame maniant un P38...", "Gallimard", "2-07-040370-X", TypeOuvrage.Roman,pennac);
		Membre m1 = e1.ajouterMembre("Dupont", "Georges", "3 rue du pont 74000 Annecy", "0404040404", "01/01/1965", new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		Membre m2 = e1.ajouterMembre("Dupond", "Jean", "3 rue du pont 74000 Annecy", "0404040404", "01/01/1965", new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		System.out.println(m1);
		e1.ajouterExemplaire(feeCarabine, EtatExemplaire.Moyen, true);
		
		m1.demandeEmprunt(feeCarabine);
		
		m2.demandeEmprunt(feeCarabine);
		m2.demandeReservation(feeCarabine);
		m1.rendreEmprunt(media1, m1.getListeEmprunts().get(0));
		
	}

}