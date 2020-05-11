package com.formation.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.formation.domaine.CCamion;
import com.formation.domaine.CVehicule;
import com.formation.domaine.CVoiture;

public class CMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		List<CVehicule> listeVehicule;
		listeVehicule = new ArrayList<CVehicule>();

		listeVehicule.add(new CVoiture("Peugeot", 100));
		listeVehicule.add(new CCamion("Iveco", 200));
		
		Map<String, CVehicule> mapVehicule = new Hashtable<String, CVehicule>();
		
		mapVehicule.put("Peugeot", new CVoiture("Peugeot", 100));
		mapVehicule.put("Iveco", new CVoiture("Iveco", 200));

		// Etape 1

		for (int i = 0; i < listeVehicule.size()
				&& listeVehicule.get(i) != null; i++) {
			CVehicule v = listeVehicule.get(i);
			if (v instanceof CVoiture) {
				((CVoiture) v).rouler();
			} else if (v instanceof CCamion) {
				((CCamion) v).rouler();
			}
		}

		// Etape 2
		Iterator<CVehicule> iterator = listeVehicule.iterator();
		CVehicule v;
		while (iterator.hasNext()) {
			v = iterator.next();
			if (v instanceof CVoiture) {
				((CVoiture) v).rouler();
			} else if (v instanceof CCamion) {
				((CCamion) v).rouler();
			}
		}
		
		// Etape 3
		 ((CVehicule)mapVehicule.get("Iveco")).afficher();
		
	}
}
