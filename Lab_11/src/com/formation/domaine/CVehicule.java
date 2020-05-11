package com.formation.domaine;


abstract public class CVehicule
{

  // Données Membres
  //donnees generales
  protected String  m_strMarque;
  protected float   m_fVitesse = 0;
  protected float   m_fPoidsTotal = 0;
  //donnees chassis et moteur
  protected CChassis m_Chassis;
  protected CMoteur m_Moteur;

  // Constructeurs
  public CVehicule(String  strMarque,
		  int nPuissanceMoteur)
  {
    // appel du constructeur a 4 arguments
    this(strMarque, nPuissanceMoteur, 120, 100);
  }
 
  public CVehicule(String  strMarque,
		  int nPuissanceMoteur,
		  float fPoidsChassis,
		  float fPoidsMoteur
		  )
  {
    m_strMarque =strMarque;
    //donnees chassis
    m_Chassis = new CChassis(fPoidsChassis);
    //donnees moteur
    m_Moteur = new CMoteur(fPoidsMoteur,nPuissanceMoteur);
    calculerPoidsTotal();
    calculerVitesseMax();
  }


  // Fonctions Membres
  public void afficher()
  {
    System.out.println(	"------------------------");
    System.out.println(	"Marque: " + m_strMarque);
    //infos moteur
    m_Moteur.afficher();
    //infos chassis
    m_Chassis.afficher();
    // infos calculees
    System.out.println();
    System.out.println(	"Infos Calculees");
    System.out.println(	"Poids Total : " + m_fPoidsTotal);
    System.out.println(	"Vitesse Max: " + m_fVitesse + "Km/h");
  }

  abstract public void rouler();

  protected void calculerPoidsTotal()
  {
    m_fPoidsTotal = m_Moteur.getPoids() + m_Chassis.getPoids();
  }

  abstract protected void calculerVitesseMax();

  public String getMarque()
  {
    return m_strMarque;
  }

  public float getVitesseMax()
  {
    return m_fVitesse;
  }

  public float getPoidsTotal()
  {
    return m_fPoidsTotal;
  }
}
