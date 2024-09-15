package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

  public static void main(String args[]) {

     

    int n = Integer.parseInt(showInputDialog("Oppgi fakultet:"));

    int sum = 1;

    while (n > 1) {

        sum *= n*(n-1);

        n -= 2;

    }

    System.out.println(sum);   

  }

}