package com.formation.domaine;

public class CVoiture extends CVehicule {
	
	
	//Donnees des Membres
	
	private static int m_nNbreVoiture = 0 ;
	
	// Constructeurs
	
	public CVoiture() {
		this("Renault", 55);
	}



	public CVoiture(String strMarque, int nPuissanceMoteur) {
	    // appel du constructeur a 4 arguments
	    this(strMarque, nPuissanceMoteur, 120, 100);
	}



	public CVoiture(String strMarque,	int nPuissanceMoteur,
			        double fPoidsChassis, double fPoidsMoteur) {
		
		super(strMarque, nPuissanceMoteur, fPoidsChassis, fPoidsMoteur);
		
	    calculerPoidsTotal();
	    calculerVitesseMax();
	}


	@Override
	protected void calculerVitesseMax() {
		// TODO Auto-generated method stub
		m_fVitesseMax = m_fPoidsTotal * m_Moteur.getM_nPuissanceMoteur() / 500 ;
	}
	
	//Fonctions Membres
	public void afficher() {
		super.afficher();
		System.out.println("Nombre de voitures : " + m_nNbreVoiture);
	}


	@Override
	protected void rouler() {
		// TODO Auto-generated method stub
		
		System.out.println("Ca roule pour la voiture de marque " + m_strMarque + "!");
		
	}

 
	protected void finalize() {
		m_nNbreVoiture--;
	}


}
