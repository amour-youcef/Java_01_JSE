package com.formation.domaine;

public abstract class CVehicule {

	protected String m_strMarque;
	protected double m_fVitesseMax;
	protected double m_fPoidsTotal;
	protected CChassis m_Chassis;
	protected CMoteur m_Moteur;

	public CVehicule() {
	this("Renault", 55);
	}

	public CVehicule(String strMarque, int nPuissanceMoteur) {
		
		// appel du constructeur a 4 arguments
		
		this(strMarque, nPuissanceMoteur,120,100);
	}

	public CVehicule(String strMarque, int nPuissanceMoteur, double m_PoidsChassis, double m_fPoidsMoteur) {
		
		this.m_strMarque = strMarque;
		this.m_Chassis = new CChassis(m_PoidsChassis);
		this.m_Moteur = new CMoteur(nPuissanceMoteur, m_fPoidsMoteur);
		
		calculerPoidsTotal();
		calculerVitesseMax();
		
	}
  

	public void afficher() {
		System.out.println("-------------------------------------");
		System.out.println("Marque: " + m_strMarque);
		
		//infos moteur 
		m_Moteur.affiche();
		
		// infos chassis
		m_Chassis.affiche();
		
		//infos calculees
		
		System.out.println();
		System.out.println("Infos Calculees");
		System.out.println("Poids Total :" + m_fPoidsTotal);
		System.out.println("Vitesse Max: "+ m_fVitesseMax + "km/h");
	}
   
	protected void calculerPoidsTotal() {
		m_fPoidsTotal = m_Moteur.getM_fPoidsMoteur() + m_Chassis.getM_fPoidsChassic();
	}
   
	protected abstract void calculerVitesseMax();
	
	protected abstract void rouler() throws BasseVitesseException, GrandeVitesseException;

	public String getM_strMarque() {
		return m_strMarque;
	}

	public void setM_strMarque(String m_strMarque) {
		this.m_strMarque = m_strMarque;
	}

	public double getM_fVitesseMax() {
		return m_fVitesseMax;
	}

	public void setM_fVitesseMax(double m_fVitesseMax) {
		this.m_fVitesseMax = m_fVitesseMax;
	}

	public double getM_fPoidsTotal() {
		return m_fPoidsTotal;
	}

	public void setM_fPoidsTotal(double m_fPoidsTotal) {
		this.m_fPoidsTotal = m_fPoidsTotal;
	}
	
	
}
