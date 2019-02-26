package no.hvl.dat102.mengde.medlem;

import no.hvl.dat102.mengde.kjedet.KjedetMengde;

public class Medlem {
	private String navn;
	private KjedetMengde<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem(String navn) {
		this.navn = navn;
		hobbyer = null;
		statusIndeks = -1;
	} 
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setStatusIndeks(int indeks) {
		this.statusIndeks = indeks;
	}
	
	public int getStatusIndeks() {
		return statusIndeks;
	}
	
	public void setHobbyer(KjedetMengde<Hobby> hobbyMengde) {
		hobbyer = hobbyMengde;
	}
	
	public KjedetMengde<Hobby> getHobbyer(){
		return hobbyer;
	}
	
	public boolean equals(Medlem medlem2) {
		boolean erLik = true;
		
		if(getNavn() != medlem2.getNavn()) {
			erLik = false;
		}
		
		if(!getHobbyer().equals(medlem2.getHobbyer())) {
			erLik = false;
		}
		
		return erLik;
	}
	
	public boolean passerTil(Medlem medlem2) {
		boolean passer = true;
		
		if (!this.getHobbyer().equals(medlem2.getHobbyer())) {
			passer = false;
		}
		
		return passer;
	}
	 
	public void skrivUt() {
		
		System.out.println("Medlemsnavn: " + navn + "\nMedlemsindeks: " + 
		statusIndeks + "\nMedlemshobbyer: \n" + hobbyer.toString());
		
	}
}
