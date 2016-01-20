package zadaci_19_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Karte {

	//Method for playing the game
	public static void kartice(int check) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Object> karte = new ArrayList<>();//ArrayList of card objects

		//Adding objects to the list
		karte.add('A');
		karte.add(2);
		karte.add(3);
		karte.add(4);
		karte.add(5);
		karte.add(6);
		karte.add(7);
		karte.add(8);
		karte.add(9);
		karte.add(10);
		karte.add('J');
		karte.add('Q');
		karte.add('K');
		
		

		int poz = (int) (Math.random() * karte.size());//Randomizing position of the card

		ArrayList<String> simboli = new ArrayList<>();//ArrayList of strings for storing the symbol objects
		
		//Adding objects to the ArrayList 
		simboli.add(" Srce");
		simboli.add(" Pik");
		simboli.add(" Kocka");
		simboli.add(" Djetelina");
		
		int pozS = (int) (Math.random() * simboli.size());//Randomizing position of the symbol
		
		//So if conditions are met: starting and continuing card draw or ending the game
		if (check == 1) {
			System.out.println("Vasa karta je " + karte.get(poz).toString() + simboli.get(pozS).toString());
			System.out.println(
					"Unesite 1 za vracanje vase karte u spil i izvlacenje nove karte \n"
					+ "ili bilo koji drugi broj za izlaz iz igrice");
			check = input.nextInt();
			kartice(check);
		} else {
			System.exit(2);
		}
		input.close();

	}

	public static void main(String[] args) throws InputMismatchException {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Handling Exceptions
	try {
		
		//Prompting user to enter value to start the game
		System.out.println("Unesite 1 za izvlacenje karte ili bilo koji drugi broj za izlaz iz igrice.");
		int ulaz = input.nextInt();
		
		//Invoking method
		kartice(ulaz);
	} catch (InputMismatchException e) {
		System.out.println("Doslo je do greske.");

	}	
	input.close();
	}

}
