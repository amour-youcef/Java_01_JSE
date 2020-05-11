package com.formation.domaine;

public class CChassis
{
	
  // Données Membres	
  private float m_fPoids = 120;

  // Constructeurs	
  public CChassis(float fPoids)
  {
    m_fPoids = fPoids;
  }


  // Fonctions Membres
  public void afficher()
  {
    System.out.println();
    System.out.println(	"Infos Carrosserie:");
    System.out.println(	"Poids: " + m_fPoids);
  }

  public float getPoids()
  {
    return m_fPoids;
  }
}
