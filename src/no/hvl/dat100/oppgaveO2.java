package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class oppgaveO2 {

	public static void main(String[] args) {
//    	maks skatt på kvar trinn
		double skatt = 0;
		double maks1 = (292850 - 208051) * 0.017;
		double maks2 = (670000 - 291851) * 0.04;
		double maks3 = (937900 - 670000) * 0.136;
		double maks4 = (1350000 - 937900) * 0.166;

// input på brutto intekt
		double inntekt = Double.parseDouble(showInputDialog("Skriv inn bruttoinntekten din: "));

// if og else på dei forskjellige trinnene
//		trinn 0
		if (inntekt >= 0 && inntekt <= 208050) {
			skatt = 0;
			showMessageDialog(null, "Du har ingen trinnskatt");
		}
//		trinn 1
		else if (inntekt >= 208051 && inntekt <= 292850) {
			skatt = (inntekt - 208050) * 0.017;
			showMessageDialog(null, skatt + " kr i skatt ");
		}
//		trinn 2
		else if (inntekt >= 292851 && inntekt <= 670000) {
			skatt = maks1 + (inntekt - 292850) * 0.04;
			showMessageDialog(null, "Beregnet trinnskatt: " + skatt);
		}
//		trinn 3
		else if (inntekt >= 670001 && inntekt <= 937900) {
			skatt = maks1 + maks2 + (inntekt - 670000) * 0.136;
			showMessageDialog(null, "Beregnet trinnskatt: " + skatt);
		} 
//		trinn 4
		else if (inntekt >= 937901 && inntekt <= 1350000) {
			skatt = maks1 + maks2 + maks3 + (inntekt - 937900) * 0.166;
			showMessageDialog(null, "Beregnet trinnskatt: " + skatt);
		} 
//		trinn 5
		else if (inntekt >= 1350001) {
			skatt = maks1 + maks2 + maks3 + maks4 + (inntekt - 1350000) * 0.176;
			showMessageDialog(null, "Beregnet trinnskatt: " + skatt);
		}

		else {
			showMessageDialog(null, "Ugyldig inntekt"); 
		}
	}
}
