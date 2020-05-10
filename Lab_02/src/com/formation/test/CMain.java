
package com.formation.test;

import com.formation.domaine.CVoiture;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CVoiture voiture=null;

		if (args.length == 2) {
			voiture=new CVoiture(args[0], Integer.parseInt(args[1]));
		} else {
			voiture=new CVoiture();
		}

		voiture.afficher();

	}

}