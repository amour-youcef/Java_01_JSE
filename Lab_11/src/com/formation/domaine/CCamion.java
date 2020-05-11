package com.formation.domaine;


public class CCamion extends CVehicule
{

  // Données Membres
  private static int  m_nNbreCamion = 0;

  // Constructeurs
  public CCamion(String  strMarque,
		  int nPuissanceMoteur)
  {
    // appel du constructeur a 4 arguments
    this(strMarque, nPuissanceMoteur, 120, 100);
  }
 
  public CCamion(String  strMarque,
		  int nPuissanceMoteur,
		  float fPoidsChassis,
		  float fPoidsMoteur
		  )
  {
    super(strMarque,
	  nPuissanceMoteur,
	  fPoidsChassis,
	  fPoidsMoteur);
    m_nNbreCamion++;
  }


  // Fonctions Membres
  public void afficher()
  {
    super.afficher();
    System.out.println(	"Nombre de camions: " + m_nNbreCamion);
  }

  public void rouler()
  {
    System.out.println(	"Ca roule pour le camion de marque " + m_strMarque + " !");
  }

  protected void finalize()
  {
    m_nNbreCamion--;
  }

  protected void calculerVitesseMax()
  {
    m_fVitesse = m_fPoidsTotal * m_Moteur.getPuissance() / 700;
  }

  // Point d'entrée du Test Unitaire
  public static void main(String args[])
  {

    String strMarque;
    int nPuissance;

    if (args.length == 2)
      {
	strMarque = args[0];
	nPuissance = Integer.parseInt(args[1]);
      }
    else
      {
	strMarque = "Renault";
	nPuissance = 55;
      }

    CCamion voiture = new CCamion(strMarque,	nPuissance);
    voiture.afficher();
  }
}
