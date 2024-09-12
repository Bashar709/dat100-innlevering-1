package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgaveO3 {

	public static void main(String[] args) {
		int i = Integer.parseInt(showInputDialog("Skriv inn et tall: "));

		int fakultet = 1;

		if (i <= 0) {
			showMessageDialog(null, "ugyldig, prøv på nytt: ");
			i = Integer.parseInt(showInputDialog("Skriv inn et tall større enn 0: "));

		} else {

		}

		for (int n = 1; n <= i; n++) {
			fakultet *= n;

			System.out.println(n + "! = " + fakultet);
		}

	}
}