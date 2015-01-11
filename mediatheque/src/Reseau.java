
import java.util.*;

/**
 * 
 */
public class Reseau {

	
	
	public static void main(String[] args){
		Fabrique f1 = new Fabrique();
		Mediatheque media1 = new Mediatheque("Novel","3 rue de Novel 74000 Annecy",f1);
		Employe e1 = new Employe(1);
		e1.setNom("Dupont");
		e1.setPrenom("Robert");
	}

}