package no.hvl.dat102.mengde.medlem;

public class Hobby {
	private String hobbyNavn;
	
	public Hobby(String hobby) {
		hobbyNavn = hobby;
	}
	
	public String toString() {
		String tekst = "<" + hobbyNavn + ">";
		return tekst; 
	}
	
	public boolean equals(Object hobby2) {
		Hobby hobbyDenAndre = (Hobby)hobby2;
		return (hobbyNavn.equals(hobbyDenAndre.getHobbyNavn()));
	}
	
	public void setHobbyNavn(String hobbyTxt) {
		this.hobbyNavn = hobbyTxt;
	}
	
	public String getHobbyNavn() {
		return hobbyNavn;
	}
}
