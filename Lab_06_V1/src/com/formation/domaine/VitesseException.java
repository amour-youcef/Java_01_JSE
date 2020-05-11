package com.formation.domaine;


public class VitesseException extends Exception
{

	private static final long serialVersionUID = 1L;
// Donn�es Membres
  private double m_fVitesse = 0;
  private CVehicule m_vehicule = null;

  // Constructeurs
  public VitesseException(double fVitesse, CVehicule v)
  {
    m_fVitesse = fVitesse;
    m_vehicule = v;
  }

  // Fonctions Membres
  public String toString()
  {
    String strVitesse = "vitesse: " + m_fVitesse + " Km/h\n";
    String strMarque = "Vehicule de marque " + m_vehicule.getM_strMarque() + " en faute\n";
    return strMarque + strVitesse;
  }

}
