package com.formation.domaine;

public class CChassic {

	private double m_fPoidsChassic;

	public CChassic() {
		this(120);
	}

	public CChassic(double m_fPoidsChassic) {
		super();
		this.m_fPoidsChassic = m_fPoidsChassic;
	}

	public double getM_fPoidsChassic() {
		return m_fPoidsChassic;
	}

	public void setM_fPoidsChassic(double m_fPoidsChassic) {
		this.m_fPoidsChassic = m_fPoidsChassic;
	}

	public void affiche() {
		System.out.println();
		System.out.println("Infos Carrosserie");
		System.out.println("Poids: " + m_fPoidsChassic);
	}
}
