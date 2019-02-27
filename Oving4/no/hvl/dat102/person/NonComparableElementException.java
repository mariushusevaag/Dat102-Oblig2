package no.hvl.dat102.person;

@SuppressWarnings("serial")
public class NonComparableElementException extends RuntimeException{


	public NonComparableElementException(String element) {
		super("The " + element + " is not comparable");
	}

}