package no.hvl.dat102.person;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		printIntro();
		Scanner sc = new Scanner(System.in);
		int method = 0;

		// For å unngå trøbbel med newline-characters og scanner
		try{
			method = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e){
			e.printStackTrace();
		}

		switch(method)
		{
			case 0: System.out.println("Ugyldig input");
			break;

			case 1: kjoerSirkulaerKoe(sc);
			break;

			case 2: kjoerKjedetKoe(sc);
			break;

			case 3: kjoerTabellOrdnettListe(sc);
			break;

			case 4: kjoerKjedetOrdnetListe(sc);
			break;

			default: System.out.println("Error reading input..");
			sc.close();
			break;
		}
	}

	public static void printIntro()
	{
		

		System.out.println("**************************");
		System.out.println("Oppgave 5");
		System.out.println("**************************");
		System.out.println("Hvilken kø/liste vil du bruke?");
		System.out.println("1. Sirkulær kø");
		System.out.println("2. Kjedet kø");
		System.out.println("3. TabellOrdnet liste");
		System.out.println("4. KjedetOrdnet liste");
		System.out.println("**************************");
		System.out.println("Skriv inn nummer:");
	}


	public static void kjoerKjedetKoe(Scanner sc)
	{
		KjedetKø<Person> personKø = new KjedetKø<>();

		System.out.println("Antall personer som skal legges til: ");
		int count = 0;

		try{
			count = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		int i = 0;
		while(i<count)
		{
			System.out.println("**************************\nPerson " + (i+1));
			Person person = new Person();

			System.out.println("Fornavn: ");
			person.setFornavn(sc.nextLine());

			System.out.println("Etternavn: ");
			person.setEtternavn(sc.nextLine());

			System.out.println("Fødselsår: ");
			try{
				person.setFodselsaar(Integer.parseInt(sc.nextLine()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			if(person!= null)
				personKø.enqueue(person);
			i++;
			System.out.println("**************************\n");
		}

		while(personKø.size()>0)
		{
			System.out.println(personKø.dequeue().toString());
		}
	}

	public static void kjoerSirkulaerKoe(Scanner sc)
	{
		SirkulærKø<Person> personKø = new SirkulærKø<>();

		System.out.println("Antall personer som skal legges til: ");
		int count = 0;

		try{
			count = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		int i = 0;
		while(i<count)
		{
			System.out.println("**************************\nPerson " + (i+1));
			Person person = new Person();

			System.out.println("Fornavn: ");
			person.setFornavn(sc.nextLine());

			System.out.println("Etternavn: ");
			person.setEtternavn(sc.nextLine());

			System.out.println("Fødselsår: ");
			try{
				person.setFodselsaar(Integer.parseInt(sc.nextLine()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			if(person!= null)
				personKø.enqueue(person);
			i++;
			System.out.println("**************************\n");
		}

		while(personKø.size()>0)
		{
			System.out.println(personKø.dequeue().toString());
		}
	}

	public static void kjoerTabellOrdnettListe(Scanner sc)
	{
		TabellOrdnetListe<Person> personListe = new TabellOrdnetListe<>();

		System.out.println("Antall personer som skal legges til: ");
		int count = 0;

		try{
			count = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		int i = 0;
		while(i<count)
		{
			System.out.println("**************************\nPerson " + (i+1));
			Person person = new Person();

			System.out.println("Fornavn: ");
			person.setFornavn(sc.nextLine());

			System.out.println("Etternavn: ");
			person.setEtternavn(sc.nextLine());

			System.out.println("Fødselsår: ");
			try{
				person.setFodselsaar(Integer.parseInt(sc.nextLine()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			if(person!= null)
				personListe.leggTil(person);
			i++;
			System.out.println("**************************\n");
		}

		while(personListe.rear>0)
		{
			System.out.println(personListe.removeLast().toString());

		}
	}

	public static void kjoerKjedetOrdnetListe(Scanner sc)
	{
		KjedetOrdnetListe<Person> personListe = new KjedetOrdnetListe<>();
		System.out.println("Antall personer som skal legges til: ");
		int count = 0;

		try{
			count = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		int i = 0;
		while(i<count)
		{
			System.out.println("**************************\nPerson " + (i+1));
			Person person = new Person();

			System.out.println("Fornavn: ");
			person.setFornavn(sc.nextLine());

			System.out.println("Etternavn: ");
			person.setEtternavn(sc.nextLine());

			System.out.println("Fødselsår: ");
			try{
				person.setFodselsaar(Integer.parseInt(sc.nextLine()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			if(person!= null)
				personListe.leggTil(person);
			i++;
			System.out.println("**************************\n");
		}

		while(personListe.count>0)
		{
			System.out.println(personListe.removeLast().toString());

		}
	}
}