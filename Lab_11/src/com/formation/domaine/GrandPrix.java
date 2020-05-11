package com.formation.domaine;

import java.util.*;

public class GrandPrix
{

  // Point d'entrée de l'application (c'est une fonction membre)

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

    Vector listeVehicule = new Vector();

    listeVehicule.addElement(new CVoiture(strMarque, nPuissance));
    listeVehicule.addElement(new CVoiture("Ferrari", 500));
    listeVehicule.addElement(new CVoiture("Peugeot", 300));


    donnerLeDepart(listeVehicule);
  }

  public static void donnerLeDepart(Vector listeVehicule)
  {
    CVehicule v;
    for (Enumeration e = listeVehicule.elements(); e.hasMoreElements(); )
      {
	v = (CVehicule)e.nextElement();
	v.rouler();
      }

  }


}
