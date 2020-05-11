package com.formation.test;

import com.formation.domaine.CCamion;
import com.formation.domaine.CVehicule;
import com.formation.domaine.CVoiture;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CVehicule[] listeVehicule;
		listeVehicule = new CVehicule[10];

		listeVehicule[0] = new CVoiture("Peugeot", 100);
		listeVehicule[1] = new CCamion("Iveco", 200);

		for (int i = 0; i < listeVehicule.length && listeVehicule[i] != null; i++) {

			if(listeVehicule[i] instanceof CVoiture){
				((CVoiture)listeVehicule[i]).rouler();
			}else if(listeVehicule[i] instanceof CCamion ){
				((CCamion)listeVehicule[i]).rouler();
			}


		}

	}
}
