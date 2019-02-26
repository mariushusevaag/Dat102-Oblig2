package no.hvl.dat102.mengde.medlem;

public class Datakontakt {

	private final static int STANDARD = 100;
	private Medlem[] Tab;
	private int antallM;
	
	public Datakontakt() {
		Tab = new Medlem[STANDARD];
		antallM = 0;
	}
	 
	public Medlem[] getMedlemsTabell() {
		return Tab;
	}
	
	public void leggTilMedlem(Medlem person) {
		for(int i = 0; i < antallM; i++) {
			if(Tab[i].equals(person))
				return;
		}
		
		Tab[antallM] = person;
		antallM++;
	}
	
	public int getStorrelse() {
		return antallM;
	}
	
	public Medlem getMedlem(String medlemsnavn) {
		int m = finnMedlemsIndeks(medlemsnavn);
		Medlem medlem = null;
		if(m != -1) {
			medlem = Tab[m];
		}
		
		return medlem;
	}
	
	public int finnMedlemsIndeks(String medlemsnavn) {
		int indeks = -1;
		boolean funnet = false;
		
		for (int i = 0; i < Tab.length && !funnet; i++) {
			if (Tab[i].getNavn().equals(medlemsnavn)) {
				indeks = i;
				funnet = true;
			}
		}
		
		return indeks;
	}
	
	public int finnPartnerFor(String medlemsnavn) {
		boolean funnet = false;
		int m1 = finnMedlemsIndeks(medlemsnavn);
		int m2 = -1;
		int indeks = -1;
		for (int i = 0; i < antallM && !funnet; i++) {
			m2 = i;
			if((Tab[m2].passerTil(Tab[m1]) && Tab[m2].getStatusIndeks() == -1) && m1 != m2) {
				Tab[m2].setStatusIndeks(m1);
				Tab[m1].setStatusIndeks(m2);
				indeks = m2;
				funnet = true;
			} 
		}
		return indeks;
	}
	
	public void tilbakestillStatusIndeks(String medlemsnavn) {
		int m1 = finnMedlemsIndeks(medlemsnavn);
		int m2 = Tab[m1].getStatusIndeks();
		if(m2 != -1) {
			Tab[m1].setStatusIndeks(-1);
			Tab[m2].setStatusIndeks(-1);
		}
	}
	
}
