package com.formation.domaine;

public class GrandeVitesseException extends VitesseException {

	private static final long serialVersionUID = 1L;

	public GrandeVitesseException(double fVitesse, CVehicule v) {
		super(fVitesse, v);
	}

	// Fonctions Membres
	public String toString() {
		String strErreur = "Exception : vitesse trop haute !\n";
		return strErreur + super.toString();
	}

}
