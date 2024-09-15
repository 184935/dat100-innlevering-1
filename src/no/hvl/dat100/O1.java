package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class O1 {

  public static void main(String args[]) {

    double brutto = Double.parseDouble(showInputDialog("Hva er din pruttolønn?"));
    double skatt = 0;
    double skatteBelop = 0;

    while (brutto > 208050) {

        if (brutto > 1350001) {

            skatteBelop = brutto - 1350000;
            skatt += skatteBelop*0.176;
            brutto = brutto - skatteBelop;

        } else if (brutto > 937901) {

            skatteBelop = brutto - 937900;
            skatt += skatteBelop*0.166;
            brutto = brutto - skatteBelop;

        } else if (brutto > 670001) {

            skatteBelop = brutto - 670000;
            skatt += skatteBelop*0.136;
            brutto = brutto - skatteBelop;

        } else if (brutto > 292851) {
        	
            skatteBelop = brutto - 292850;
            skatt += skatteBelop*0.04;
            brutto = brutto - skatteBelop;

        } else {
        	
            skatteBelop = brutto - 208050;
            skatt += skatteBelop*0.017;
            brutto = brutto - skatteBelop;

        }
    }
    skatt = round(skatt);
    System.out.println(skatt);
  }
}
