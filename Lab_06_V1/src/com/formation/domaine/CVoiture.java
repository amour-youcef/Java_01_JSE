package com.formation.domaine;

public class CVoiture extends CVehicule {

	// Donn�es Membres
	private static int m_nNbreVoiture = 0;

	// Constructeurs

	public CVoiture() {
		this("Renault", 55);
	}

	public CVoiture(String strMarque, int nPuissanceMoteur) {
		// appel du constructeur a 4 arguments
		this(strMarque, nPuissanceMoteur, 120, 100);
	}

	public CVoiture(String strMarque, int nPuissanceMoteur,
			double fPoidsChassis, double fPoidsMoteur) {
		super(strMarque, nPuissanceMoteur, fPoidsChassis, fPoidsMoteur);
		m_nNbreVoiture++;
	}

	protected void calculerVitesseMax() {
		m_fVitesseMax = m_fPoidsTotal * m_Moteur.getM_nPuissanceMoteur() / 500;
	}

	// Fonctions Membres
	public void afficher() {
		super.afficher();
		System.out.println("Nombre de voitures: " + m_nNbreVoiture);
	}

	public void rouler() {
		try {
			if (m_fVitesseMax < 50)
				throw new BasseVitesseException(m_fVitesseMax, this);
			if (m_fVitesseMax > 120)
				throw new GrandeVitesseException(m_fVitesseMax, this);
			System.out.println("Ca roule pour la voiture de marque "
					+ m_strMarque + " !");
		} catch (VitesseException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	protected void finalize() {
		m_nNbreVoiture--;
	}

}
