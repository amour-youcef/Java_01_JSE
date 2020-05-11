package com.formation.domaine;

public class BasseVitesseException extends VitesseException {

	private static final long serialVersionUID = 1L;

	public BasseVitesseException(double fVitesse, CVehicule v) {
		super(fVitesse, v);
	}

	// Fonctions Membres
	public String toString() {
		String strErreur = "Exception : vitesse trop basse !\n";
		return strErreur + super.toString();
	}

}
