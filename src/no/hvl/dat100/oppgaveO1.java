package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

// Karakterskall utregning
public class oppgaveO1 {

	public static void main(String[] args) {

		for (int student = 0; student < 10; student++) {

//			input på poengsum inkuldert kovertering til integer 
			int poengSum = Integer.parseInt(showInputDialog("Skriv inn poengsum på student " + (student + 1)));

			if (poengSum >= 90 && poengSum <= 100) {
				showMessageDialog(null, "Resultat: A");
				System.out.println("A");
			}

			else if (poengSum >= 80 && poengSum <= 89) {
				showMessageDialog(null, "Resultat B");
				System.out.println("B");
			}

			else if (poengSum >= 60 && poengSum <= 79) {
				showMessageDialog(null, "Resultat: C");
				System.out.println("C");
			}

			else if (poengSum >= 50 && poengSum <= 59) {
				showMessageDialog(null, "Resultat: D");
				System.out.println("D");
			}

			else if (poengSum >= 40 && poengSum <= 49) {
				showMessageDialog(null, "Resultat: E");
				System.out.println("E");
			}

			else if (poengSum >= 0 && poengSum <= 39) {
				showMessageDialog(null, "Resultat: F");
				System.out.println("F");
			}

			else {
				showMessageDialog(null, "Ugyldig poeng, prøv på nytt: ");
				student--;
			}

		}
	}
}