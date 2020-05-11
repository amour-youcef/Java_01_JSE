package com.formation.domaine;

public class CChassis {

	private double m_fPoidsChassis;

	public CChassis() {
		this(120);
	}

	public CChassis(double m_fPoidsChassic) {
		super();
		this.m_fPoidsChassis = m_fPoidsChassic;
	}

	public double getM_fPoidsChassic() {
		return m_fPoidsChassis;
	}

	public void setM_fPoidsChassic(double m_fPoidsChassic) {
		this.m_fPoidsChassis = m_fPoidsChassic;
	}

	public void affiche() {
		System.out.println();
		System.out.println("Infos Carrosserie");
		System.out.println("Poids: " + m_fPoidsChassis);
	}
}
