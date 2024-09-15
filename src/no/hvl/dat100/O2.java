package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

  public static void main(String args[]) {
	  
	
	  for (int i = 0; i < 10; i++) {
		  
		  int poeng = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));

		  while (poeng < 0 || poeng > 100) {

			  System.out.println("Ugyldig verdi");
			  poeng = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));

        } 

		  if (poeng <= 100 && poeng > 89) {
        	
			  System.out.println("Din karakter er A");
		  } else if (poeng <= 89 && poeng > 79) {
			  System.out.println("Din karakter er B");
		  } else if (poeng <= 79 && poeng > 59) {
			  System.out.println("Din karakter er C");
		  } else if (poeng <= 59 && poeng > 49) {
			  System.out.println("Din karakter er D");
		  } else if (poeng <= 49 && poeng > 39) {
			  System.out.println("Din karakter er E");
		  } else  {
			  System.out.println("Din karakter er F");

        }
	  }
  }
}
