package com.formation.domaine;


public class CVoiture extends CVehicule implements Runnable
{

  // Données Membres
  private static int  m_nNbreVoiture = 0;
  private Thread t_selfThread = null;
  private int m_nNombreDeToursParcourus = 0;
  private static boolean b_CourseFinie = false;

  // Constructeurs
  public CVoiture(String  strMarque,
		  int nPuissanceMoteur)
  {
    // appel du constructeur a 4 arguments
    this(strMarque, nPuissanceMoteur, 120, 100);
  }
 
  public CVoiture(String  strMarque,
		  int nPuissanceMoteur,
		  float fPoidsChassis,
		  float fPoidsMoteur
		  )
  {
    super(strMarque,
	  nPuissanceMoteur,
	  fPoidsChassis,
	  fPoidsMoteur);
    m_nNbreVoiture++;
  }


  // Fonctions Membres
  public void run()
    {
	// int fDureeDunTourEn_ms = (int)(1 * 3600 * 1000 /getVitesseMax());
	int fDureeDunTourEn_ms = (int)(1 * 3600 * 10 /getVitesseMax());
	while(true) {
	    try {
		t_selfThread.sleep(fDureeDunTourEn_ms);
		m_nNombreDeToursParcourus++;
		System.out.println(m_nNombreDeToursParcourus + " tour(s) effectués par la " + this.getMarque() );
		if ( m_nNombreDeToursParcourus == 10 )
		    {
			String messsage = "C'est fini pour ";
			if ( !b_CourseFinie )
			    {
				b_CourseFinie = true;
				messsage = "C'est gagné pour ";
			    }
			System.out.println(messsage + this.getMarque() );
			return;
		    }
	    } catch (InterruptedException e){}
	}
    }

  public void afficher()
  {
    super.afficher();
    System.out.println(	"Nombre de voitures: " + m_nNbreVoiture);
  }

  public void rouler()
  {
    if(t_selfThread == null) {
        t_selfThread = new Thread(this);
	System.out.println("C'est parti pour la voiture de marque " + m_strMarque + " (vitesse max = " + getVitesseMax() + " km/h) !");
	t_selfThread.start();
    }
  }

  protected void finalize()
  {
    m_nNbreVoiture--;
  }

  protected void calculerVitesseMax()
  {
    m_fVitesse = m_fPoidsTotal * m_Moteur.getPuissance() / 500;
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

    CVoiture voiture = new CVoiture(strMarque,	nPuissance);
    voiture.afficher();
  }
}
