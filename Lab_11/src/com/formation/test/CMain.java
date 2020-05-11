package com.formation.test;


import com.formation.domaine.CVoiture;
import com.formation.domaine.VitesseException;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String strMarque;
		int nPuissance;

		if (args.length == 2) {
			strMarque = args[0];
			nPuissance = Integer.parseInt(args[1]);
		} else {
			strMarque = "Renault";
			nPuissance = 55;
		}

		CVoiture v = new CVoiture(strMarque, nPuissance);
		v.rouler();
	}
}
