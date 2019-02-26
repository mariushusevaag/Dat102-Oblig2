package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.medlem.Datakontakt;
import no.hvl.dat102.mengde.medlem.Tekstgrensesnitt;

public class KlientMedlem {

public static void main(String[] args) {
		
		Datakontakt kjør = new Datakontakt();
		Tekstgrensesnitt kjører = new Tekstgrensesnitt(kjør);
		kjører.start();

	}

}
