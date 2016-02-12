package MiniProjekatHangMan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class HangMan {
	// data fields
	static String[] GRADOVI = { "ZAGREB", "BEOGRAD", "DUBROVNIK", "GRADACAC", "SARAJEVO", "ZENICA", "BJELJINA",
			"TRAVNIK", "SREBRENICA", "TESANJ", "GRACANICA" };
	static int POZICIJA;
	static String ZADATAK;
	static ArrayList<Character> znakovi = new ArrayList<>();
	static String pokusaji = "";
	static Scanner input = new Scanner(System.in);

	public static void isprazniCrtice() {
		// clearing the array and storing dashes to it
		znakovi.clear();
		for (int i = 0; i < ZADATAK.length(); i++) {
			znakovi.add('-');
		}
		System.out.println();
	}

	public static void printajCrtice() {
		// printing dashes
		for (int i = 0; i < znakovi.size(); i++) {
			System.out.print(znakovi.get(i).charValue());
		}
		System.out.println();

	}

	public static void provjeraIgreJedanSimbol(String slovo) {
		// if one symbol is entered, check for possible solutions
		if (ZADATAK.equals(rjesenje())) {
			System.out.println("Cestitke, pobjeda je vasa!");
		}
		// if solution is not complete setting letter at its position in the
		// array
		for (int i = 0; i < ZADATAK.length(); i++) {
			if (ZADATAK.charAt(i) == slovo.charAt(0)) {
				znakovi.set(i, slovo.charAt(0));
			}
		}
	}

	public static String rjesenje() {
		// summing the solution
		String rjesenje = "";
		for (int i = 0; i < znakovi.size(); i++) {
			rjesenje += znakovi.get(i).charValue();
		}

		return rjesenje;
	}

	public static void main(String[] args) {
		// String to store attempts
		pokusaji = "";
		// getting random position for the String array so the ZADATAK could be
		// found
		POZICIJA = (int) (Math.random() * 11);
		// Determining task
		ZADATAK = GRADOVI[POZICIJA];
		// Clear dashes
		isprazniCrtice();
		// print dashes
		printajCrtice();
		// counter
		int brojac = 0;
		// prompting user to start the game
		System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec\nili unesite 0 za izlaz iz igre");

		String rijec = input.next().toUpperCase();
		// if entered vale is 0 exit the system
		if (rijec.equals("0")) {
			System.exit(1);
		}
		// Loop to spin the game
		while (brojac != 5) {
			// if word is entered check if player wins or looses
			if (rijec.length() > 1) {
				if (ZADATAK.equals(rijec)) {
					System.out.println("Cestitke, pobjeda je vasa");
					main(args);
				} else {
					System.out.println("Vas zadatak je bio: " + ZADATAK);
					System.out.println("Vi gubite!");

					main(args);
				}
			}
			// if letter is entered check if
			if (rijec.length() == 1) {
				// add letter to the attempts
				pokusaji += rijec;
				// check if entered letter is a part of the task
				provjeraIgreJedanSimbol(rijec);
				// Check for potential solution
				if (ZADATAK.equals(rjesenje())) {
					System.out.println("Cestitke, pobjeda je vasa!");

					main(args);

				}
				// print attempts
				System.out.println("Vasi pokusaji: " + pokusaji);
				System.out.println();
				// print dashes
				printajCrtice();

			}
			// if letter is not a part of the task, letter is counted as a mis
			if (!ZADATAK.contains(rijec)) {
				brojac++;
			}
			// if player misses 5 times, player looses
			if (brojac == 5) {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|       O       ");
				System.out.println("|      /O\\     ");
				System.out.println("|      / \\    ");
				System.out.println();
				System.out.println("Vas zadatak je bio: " + ZADATAK);
				System.out.println("Objesen/a!");
				System.out.println();
				main(args);
				// if mised under 5 times player can attempt again
			} else if (brojac == 4) {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|       O       ");
				System.out.println("|      /O\\     ");
				System.out.println("|      /        ");
				System.out.println();
				System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec");
				rijec = input.next().toUpperCase();
			} else if (brojac == 3) {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|       O       ");
				System.out.println("|      /O\\     ");
				System.out.println("|              ");
				System.out.println();
				System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec");
				rijec = input.next().toUpperCase();
			} else if (brojac == 2) {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|       O       ");
				System.out.println("|      /O       ");
				System.out.println("|               ");
				System.out.println();
				System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec");
				rijec = input.next().toUpperCase();

			} else if (brojac == 1) {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|       O       ");
				System.out.println("|       O       ");
				System.out.println("|               ");
				System.out.println();
				System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec");
				rijec = input.next().toUpperCase();

			}

			else {
				System.out.println("\n________________");
				System.out.println("|       |       ");
				System.out.println("|               ");
				System.out.println("|               ");
				System.out.println("|               ");
				System.out.println();
				System.out.println("Unesite slovo ili pokusajte pogoditi koja je rijec");
				rijec = input.next().toUpperCase();

			}
		}

	}
}
