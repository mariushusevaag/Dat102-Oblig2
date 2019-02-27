package no.hvl.dat102.person;

@SuppressWarnings("serial")
public class ElementNotFoundException extends RuntimeException{
	
	public ElementNotFoundException(String collection) {
		super("the element is not found in the " + collection);
	}

}