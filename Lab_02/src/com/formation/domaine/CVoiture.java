package com.formation.domaine;

public class CVoiture {
	
    String m_strMarque;
    double m_fVitesseMax;
    double m_fPoidsTotal;
    
    CChassic m_Chassis;
    CMoteur m_Moteur;


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
		
		this.m_Chassis = new CChassic(m_fPoidsChassis);
		this.m_Moteur = new CMoteur(m_nPuissanceMoteur, m_fPoidsMoteur);
		
	    calculerPoidsTotal();
	    calculerVitesseMax();
	}



	public void afficher() {
		
	    System.out.println(	"------------------------");
	    System.out.println(	"Marque: " + m_strMarque);
	    
	    //infos moteur
	    
	    m_Moteur.affiche();
	    
	    //infos chassis
	    
	    m_Chassis.affiche();
	    
	    // infos calculees
	    
	    System.out.println();
	    System.out.println(	"Infos Calculees");
	    System.out.println(	"Poids Total : " + m_fPoidsTotal);
	    System.out.println(	"Vitesse Max: " + m_fVitesseMax + "Km/h");
	}

	private void calculerPoidsTotal(){
		m_fPoidsTotal = m_Moteur.getM_fPoidsMoteur() + m_Chassis.getM_fPoidsChassic();
	}

	private void calculerVitesseMax(){
		m_fVitesseMax = m_fPoidsTotal * m_Moteur.getM_nPuissanceMoteur() / 500;
	}




}
