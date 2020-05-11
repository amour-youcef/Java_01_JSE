
package com.formation.test;

import com.formation.domaine.CCamion;
import com.formation.domaine.CVoiture;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CVoiture voiture=null;
		CCamion camion = null;
        
		if (args.length == 2) {
			voiture=new CVoiture(args[0], Integer.parseInt(args[1]));
		} else {
			voiture=new CVoiture();
		}
		
		
		if (args.length == 2) {
			camion=new CCamion(args[0], Integer.parseInt(args[1]));
		} else {
			camion=new CCamion();
		}
		
		
		voiture.afficher();
		System.out.println(" ==================================camion");
		camion.afficher();
	}

}