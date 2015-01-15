
import java.util.*;

/**
 * 
 */
public class Reseau {

	
	
	public static void main(String[] args){
		Fabrique f1 = new Fabrique();
		Mediatheque media1 = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",f1);
		Employe e1 = media1.creerEmploye("Dupont", "Robert", "1 rue de chez lui 74000 annecy", "0404040404", "01/01/1960");
		
	}

}