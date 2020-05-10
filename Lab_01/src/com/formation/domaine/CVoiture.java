package com.formation.domaine;

public class CVoiture {
    String m_strMarque;
    double m_fVitesseMax;
    double m_fPoidsTotal;
    double m_fPoidsChassis;
    int    m_nPuissanceMoteur;
    double m_fPoidsMoteur;



	public CVoiture() {
		this("Renault", 55);
	}



	public CVoiture(String strMarque, int nPuissanceMoteur) {
	    // appel du constructeur a 4 arguments
	    this(strMarque, nPuissanceMoteur, 120, 100);
	}



	public CVoiture(String m_strMarque,	int m_nPuissanceMoteur,
			        double m_fPoidsChassis, double m_fPoidsMoteur) {
		this.m_strMarque = m_strMarque;
		this.m_fPoidsChassis = m_fPoidsChassis;
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	    calculerPoidsTotal();
	    calculerVitesseMax();
	}



	public void afficher() {
	    System.out.println(	"------------------------");
	    System.out.println(	"Marque: " + m_strMarque);
	    //infos moteur
	    System.out.println();
	    System.out.println(	"Infos Moteur");
	    System.out.println(	"Poids: " + m_fPoidsMoteur);
	    System.out.println(	"Puissance: " + m_nPuissanceMoteur + " ch");
	    //infos chassis
	    System.out.println();
	    System.out.println(	"Infos Carrosserie");
	    System.out.println(	"Poids: " + m_fPoidsChassis);
	    // infos calculees
	    System.out.println();
	    System.out.println(	"Infos Calculees");
	    System.out.println(	"Poids Total : " + m_fPoidsTotal);
	    System.out.println(	"Vitesse Max: " + m_fVitesseMax + "Km/h");
	}

	private void calculerPoidsTotal(){
		m_fPoidsTotal = m_fPoidsMoteur + m_fPoidsChassis;
	}

	private void calculerVitesseMax(){
		m_fVitesseMax = m_fPoidsTotal * m_nPuissanceMoteur / 500;
	}




}
