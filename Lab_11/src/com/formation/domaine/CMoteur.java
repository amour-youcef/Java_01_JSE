package com.formation.domaine;

public class CMoteur
{
	
  // Données Membres	
  private float m_fPoids = 100;
  private int m_nPuissance = 55;

  // Constructeurs	
  public CMoteur()
  {
  }

  public CMoteur(float fPoids, int nPuissance)
  {
    m_fPoids = fPoids;
    m_nPuissance = nPuissance;
  }


  // Fonctions Membres
  public void afficher()
  {
    System.out.println();
    System.out.println(	"Infos Moteur:");
    System.out.println(	"Poids: " + m_fPoids);
    System.out.println(	"Puissance: " + m_nPuissance + " ch");
  }

  public float getPoids()
  {
    return m_fPoids;
  }
	
  public int getPuissance()
  {
    return m_nPuissance;
  }
}
