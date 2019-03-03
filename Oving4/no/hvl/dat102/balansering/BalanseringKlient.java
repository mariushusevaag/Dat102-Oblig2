package no.hvl.dat102.balansering;

public class BalanseringKlient {
	public static void main(String[] args) {
		final String filnavn = "balanseringMedFeil.txt";
	
		// Leser inn en tekst fra fil
		Balansering balansering = new Balansering();
		balansering.lesFraFil(filnavn);
	}
}
