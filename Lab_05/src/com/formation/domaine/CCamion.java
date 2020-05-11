package com.formation.domaine;

public class CCamion extends CVehicule {

	// Donnees Membres

	private static int m_nNbreCamion = 0;

	// Constructeurs
	
	public CCamion() {
	 this("Iveco",55);
	}

	public CCamion(String strMarque, int nPuissanceMoteur) {
		// appel du constructeur a 4 arguments
		
		this(strMarque, nPuissanceMoteur,120,100);
	}

	public CCamion(String strMarque, int nPuissanceMoteur, double fPoidsChassis, double fPoidsMoteur) {
		
		super (strMarque, nPuissanceMoteur, fPoidsChassis, fPoidsMoteur);
		
		m_nNbreCamion++;
	}
	
	//function Members
	
	public void afficher() {
		super.afficher();
		System.out.println("Nomber de voitures: " + m_nNbreCamion);
	}

	@Override
	protected void calculerVitesseMax() {
		// TODO Auto-generated method stub
		m_fVitesseMax = m_fPoidsTotal * m_Moteur.getM_nPuissanceMoteur() / 700 ;
		
	}

	@Override
	public void rouler() {
		// TODO Auto-generated method stub
		System.out.println("Ca roule pour le camion de marque " + m_strMarque + "!");
	}
	
	@Override
	protected void finalize() {
		m_nNbreCamion--;
	}
   
}
