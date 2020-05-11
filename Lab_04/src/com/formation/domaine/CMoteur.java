package com.formation.domaine;

public class CMoteur {

	private int m_nPuissanceMoteur;
	private double m_fPoidsMoteur;

	public CMoteur() {

		this(55, 100);
	}

	public CMoteur(int m_nPuissanceMoteur, double m_fPoidsMoteur) {
		super();
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}

	public int getM_nPuissanceMoteur() {
		return m_nPuissanceMoteur;
	}

	public void setM_nPuissanceMoteur(int m_nPuissanceMoteur) {
		this.m_nPuissanceMoteur = m_nPuissanceMoteur;
	}

	public double getM_fPoidsMoteur() {
		return m_fPoidsMoteur;
	}

	public void setM_fPoidsMoteur(double m_fPoidsMoteur) {
		this.m_fPoidsMoteur = m_fPoidsMoteur;
	}
    
	public void affiche() {
		System.out.println();
		System.out.println("Info Moteur");
		System.out.println("Poids: " + m_fPoidsMoteur);
		System.out.println("Puissance: "+ m_nPuissanceMoteur + "ch");
	}
}
