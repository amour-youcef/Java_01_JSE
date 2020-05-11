//: MyGrep.java
import java.io.*;

public class MyGrep {
  
  static String grep(String sPattern, String sFilename)
    {
      StringBuffer sb = new StringBuffer();
      FileReader in = null;
      String line;
	try
	  {
	    in = new FileReader(sFilename);
	    BufferedReader dataIn = new BufferedReader(in);
	    int lineCount = 1;
	    while ((line = dataIn.readLine()) != null)
	      {
		if ((line.indexOf(sPattern) != -1))
		  {
		    sb.append(lineCount + ": " + line + "\n");
		  }
		lineCount++;
	      }
	    in.close();
	  }
	catch ( IOException e)
	  {
	    System.out.println("Erreur E/S");
	    return "";
	  }

	return sb.toString();
    }
  
  public static void main(String args[]) 
    {
      if ( args.length >= 2 )
	{
	  String sResult = grep(args[0], args[1]);
	  System.out.println(sResult);
	}
    else
      System.out.println("Usage: MyGrep chaine fichier");
    }
}