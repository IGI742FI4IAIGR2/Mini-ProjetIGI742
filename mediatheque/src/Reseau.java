
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Reseau {

	
	
	public static void main(String[] args)  throws IOException
	{
		//Artifice pour mettre en pause
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		Fabrique f1 = new Fabrique();
		Mediatheque media1 = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",f1);
		System.out.println("Création d'un employé");
		Employe e1 = media1.creerEmploye("Dupont", "Robert", "1 rue de chez lui 74000 annecy", "0404040404", "01/01/1960");	
		System.out.println("Employé "+e1.getPrenom()+" "+e1.getNom()+" créé");
		stdin.readLine(); //pause
		System.out.println("Création d'un ouvrage");
		Auteur pennac = new Auteur("Pennac", "Daniel");
		Ouvrage feeCarabine = e1.ajouterProduit("La Fée carabine", "1987", "L'inspecteur de police Vanini faisait un tour de quartier quand il est tué par une vieille dame maniant un P38...", "Gallimard", "2-07-040370-X", TypeOuvrage.Roman,pennac);
		System.out.println("Ouvrage "+feeCarabine.getTitre()+" créé");
		stdin.readLine(); //pause
		System.out.println("Création d'un membre");
		Membre m1 = e1.ajouterMembre("Dupont", "Georges", "3 rue du pont 74000 Annecy", "0404040404", "01/01/1965", new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		System.out.println("Membre "+m1.getPrenom()+" "+m1.getNom()+" créé");
		stdin.readLine(); //pause
		System.out.println("Création d'un autre membre");
		Membre m2 = e1.ajouterMembre("Dupond", "Jean", "3 rue du pont 74000 Annecy", "0404040404", "01/01/1965", new Abonnement(1,new GregorianCalendar(),DureeAbonnement.sixMois,TypeAbonnement.LivDVDPass));
		System.out.println("Membre "+m2.getPrenom()+" "+m2.getNom()+" créé");
		stdin.readLine(); //pause
		System.out.println("Ajout d'un exemplaire à l'ouvrage");
		e1.ajouterExemplaire(feeCarabine, EtatExemplaire.Moyen, true);
		stdin.readLine(); //pause
		System.out.println("Georges Dupont veut emprunter la Fée Carabine");
		m1.demandeEmprunt(feeCarabine);
		stdin.readLine(); //pause
		System.out.println("Jean Dupont veut emprunter la Fée Carabine");
		m2.demandeEmprunt(feeCarabine);
		stdin.readLine(); //pause
		System.out.println("Jean Dupont réserve la Fée Carabine");
		m2.demandeReservation(feeCarabine);
		stdin.readLine(); //pause
		System.out.println("Georges Dupont rend la Fée Carabine");
		m1.rendreEmprunt(media1, m1.getListeEmprunts().get(0));
		
	}

}