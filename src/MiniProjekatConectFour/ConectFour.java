package MiniProjekatConectFour;

import java.util.Scanner;

public class ConectFour {
	// global variables
	final static int RED = 6;
	final static int KOLONA = 7;
	final static int DONJI_RED = RED - 1;

	// String array for game board
	static String[][] tabla = new String[RED][KOLONA];

	// creates scanner
	static Scanner scanner = new Scanner(System.in);

	public static void KreirajTablu() {
		// Method that fills board with " |" for the RED and KOLONA
		for (int i = 0; RED > i; i++) {
			for (int j = 0; KOLONA > j; j++) {
				tabla[i][j] = " |";
			}
		}
	}

	public static void IspisiTablu() {
		// Method that prints the board
		for (int i = 0; RED > i; i++) {
			for (int j = 0; KOLONA > j; j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void SpustiX() {

		int brojac = 1;// counter
		// Message for turn
		System.out.println("Igrac X je na redu");
		// gets input
		int kolona = scanner.nextInt();

		while (true) {
			if (kolona > RED) {
				System.out.println("To nije postojeca kolona");
				SpustiX();
				break;
			}
			// checks to see if space is blank, puts X there if it is
			if (tabla[DONJI_RED][kolona] == " |") {
				tabla[DONJI_RED][kolona] = "X|";
				break; // breaks loop after placing if space isn't blank, checks
						// to see if above on is

			} else if (tabla[DONJI_RED][kolona] == "X|" || tabla[DONJI_RED][kolona] == "O|") {
				if (tabla[DONJI_RED - brojac][kolona] == " |") {
					tabla[DONJI_RED - brojac][kolona] = "X|";
					break; // breaks loop after placing
				}
			}
			brojac++; // if the space wasn't blank, then loops again
			if (brojac == RED) { // checks to see if at end of column
				System.out.println("Ta kolona je puna");
				SpustiX();
				break;
			}
		}
	}

	public static void SpustiO() {
		int brojac = 1;
		System.out.println("Igrac O je na redu");
		int kolona = scanner.nextInt();

		while (true) {
			if (kolona > RED) {
				System.out.println("To nije postojeca kolona");
				SpustiO();
				break;
			}
			// checks to see if space is blank, puts O there if it is
			if (tabla[DONJI_RED][kolona] == " |") {
				tabla[DONJI_RED][kolona] = "O|";
				break; // breaks loop after placing
			} else if (tabla[DONJI_RED][kolona] == "X|" || tabla[DONJI_RED][kolona] == "O|") {
				// if space isn't blank, checks to see if one above is

				if (tabla[DONJI_RED - brojac][kolona] == " |") {
					// puts O if blank

					tabla[DONJI_RED - brojac][kolona] = "O|";
					break; // breaks loop after placing
				}
			}
			brojac++; // adds one to counter if the space wasn't blank, then
						// loops again
			if (brojac == RED) { // checks to see if at end of column
				System.out.println("Ta kolona je puna");
				SpustiO();
				break;
			}
		}
	}

	public static boolean ProvjeriXHorizontal() {

		boolean mjesto = true;
		int brojac = 0;
		while (mjesto) {
			// goes through the board horizontally
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "X|") {
						brojac++;
					} else {
						brojac = 0; // reset counter
					}
					// if counter is greater or equal to 4, player wins
					if (brojac >= 4) {
						System.out.println("Igrac X pobjedjuje");
						mjesto = false;
					}
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriXVertical() {
		// creates boolean to act as flag
		boolean mjesto = true;
		int brojac = 0;
		while (mjesto) {

			// goes through board vertically
			for (int j = 0; KOLONA > j; j++) {
				for (int i = 0; RED > i; i++) {
					if (tabla[i][j] == "X|") {
						brojac++;
					} else {
						brojac = 0; // reset counter
					}
					if (brojac >= 4) {
						System.out.println("Igrac X pobjedjuje");
						// if counter is greater or equal to 4, player wins
						mjesto = false;
					}
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriOVertical() {
		// creates boolean to act as flag
		boolean mjesto = true;
		// counter
		int brojac = 0;
		while (mjesto) {
			// goes through board vertically
			for (int j = 0; KOLONA > j; j++) {
				for (int i = 0; RED > i; i++) {
					if (tabla[i][j] == "O|") {
						brojac++;// if it finds an O, add 1 to counter
					} else {
						brojac = 0; // reset counter
					}
					// If counter is equal or greater than 4 player wins
					if (brojac >= 4) {
						System.out.println("Igrac O pobjedjuje");
						mjesto = false;
					}
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriOHorizontal() {
		// creates boolean to act as flag
		boolean mjesto = true;
		int brojac = 0;
		while (mjesto) {
			// goes through board vertically
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "O|") {
						brojac++;
					} else {
						brojac = 0; // reset counter
					}
					// if counter equals 4 or more player wins
					if (brojac >= 4) {
						System.out.println("Igrac O pobjedjuje");
						mjesto = false;
					}
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriXDiagonalForward() {
		boolean mjesto = true;
		int brojac = 0;
		Boolean check = false;
		int provjeraKolone = 1;
		int provjeraReda = 1;

		while (mjesto) { // goes through until an X is found
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "X|") {
						brojac++;
						check = true;
						while (check) {
							// goes through diagonally looking for Xs
							if (provjeraKolone + i <= RED - 1 && provjeraReda + j <= KOLONA - 1) {
								if (tabla[i + provjeraKolone][j + provjeraReda] == "X|") {
									brojac++;
								}
							}
							provjeraKolone++;
							provjeraReda++;

							if (provjeraKolone == RED - 1 || provjeraReda == KOLONA - 1) {
								check = false;
								break;
							}
							// if counter greater than or equal 4 player wins
							if (brojac >= 4) {
								System.out.println("Igrac X pobjedjuje");
								check = false;
								mjesto = false;
								break;
							}
						}
					}
					if (brojac >= 4) {
						mjesto = false;
						break;
					}
					// resets counter and checkers
					brojac = 0;
					provjeraKolone = 1;
					provjeraReda = 1;
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriODiagonalForward() {

		boolean mjesto = true;
		int brojac = 0;
		Boolean check = false;
		// checkers
		int provjeraKolone = 1;
		int provjeraReda = 1;

		while (mjesto) { // goes through until an O is found
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "O|") {
						brojac++;
						check = true;
						while (check) {
							// goes through diagonally looking for Os
							if (provjeraKolone + i <= RED - 1 && provjeraReda + j <= KOLONA - 1) {
								if (tabla[i + provjeraKolone][j + provjeraReda] == "O|") {
									brojac++;
								}
							}
							// adds 1 to checkers
							provjeraKolone++;
							provjeraReda++;
							if (provjeraKolone == RED - 1 || provjeraReda == KOLONA - 1) {
								check = false;
								break;
							}
							// If counter greater or equal 4 player wins
							if (brojac >= 4) {
								System.out.println("Igrac O pobjedjuje");
								check = false;
								mjesto = false;
								break;
							}
						}
					}
					if (brojac >= 4) {
						mjesto = false;
						break;
					}
					// resets counter and checkers
					brojac = 0;
					provjeraKolone = 1;
					provjeraReda = 1;
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriXDiagonalBack() {

		boolean mjesto = true;
		// counter
		int brojac = 0;
		// check boolean
		Boolean check = false;
		// checkers
		int provjeraKolone = 1;
		int provjeraReda = 1;

		while (mjesto) { // goes through until an X is found
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "X|") { 
						brojac++;
						check = true;
						while (check) { // goes through diagonally looking for
										// Xs
							if (i - provjeraKolone >= 0 && j - provjeraReda >= 0) {
								if (tabla[i - provjeraKolone][j - provjeraReda] == "X|") {
									brojac++; // if X is found, add 1 to
												// counter
								}
							}
							// adds 1 to checkers
							provjeraKolone++;
							provjeraReda++;

							if (provjeraKolone == 0 || provjeraReda == KOLONA - 1) {
								check = false;
								break;
							}
							// if counter is 4 or more player wins
							if (brojac >= 4) {
								System.out.println("Igrac X pobjedjuje");
								check = false;
								mjesto = false;
								break;
							}
						}
					}
					if (brojac >= 4) {
						mjesto = false;
						break;
					}
					// resets counter and checkers
					brojac = 0;
					provjeraKolone = 1;
					provjeraReda = 1;
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriODiagonalBack() {

		boolean mjesto = true;

		int brojac = 0;

		// check boolean
		Boolean check = false;

		// checkers
		int provjeraKolone = 1;
		int provjeraReda = 1;

		while (mjesto) {

			// goes through until an O is found
			for (int i = 0; RED > i; i++) {
				for (int j = 0; KOLONA > j; j++) {
					if (tabla[i][j] == "O|") { // if O is found, add one to
												// counter and go into loop
						brojac++;
						check = true;
						while (check) {
							// goes through diagonally looking for Os
							if (i - provjeraKolone >= 0 && j - provjeraReda >= 0) {
								if (tabla[i - provjeraKolone][j - provjeraReda] == "O|") {
									brojac++;
								}
							}

							// adds 1 to checkers
							provjeraKolone++;
							provjeraReda++;

							if (provjeraKolone == 0 || provjeraReda == KOLONA - 1) {
								check = false;
								break;
							}
							// If counter is equal or greater than 4 player wins
							if (brojac >= 4) {
								System.out.println("Igrac O pobjedjuje");
								check = false;
								mjesto = false;
								break;
							}
						}
					}
					if (brojac >= 4) {
						mjesto = false;
						break;
					}
					// resets counter and checkers
					brojac = 0;
					provjeraKolone = 1;
					provjeraReda = 1;
				}
			}
			break;
		}
		return mjesto;
	}

	public static boolean ProvjeriX() {
		// creates flag
		boolean mjesto = true;

		// checks all Xs at once, for clear main loop
		if (!ProvjeriXVertical() || !ProvjeriXHorizontal() || !ProvjeriXDiagonalBack() || !ProvjeriXDiagonalForward()) {
			mjesto = false;
		}
		return mjesto;
	}

	public static boolean ProvjeriO() {
		// creates flag
		boolean mjesto = true;

		// checks all Os at once, for clear main loop
		if (!ProvjeriOVertical() || !ProvjeriOHorizontal() || !ProvjeriODiagonalBack() || !ProvjeriODiagonalForward()) {
			mjesto = false;
		}
		return mjesto;
	}

	public static void main(String[] args) {
		// creates board
		KreirajTablu();

		// tells player how to play
		System.out.println("Unesite 0-6 za odabir kolone koju zelite: ");

		// displays board
		IspisiTablu();

		// creates boolean to determine status of game
		boolean mjesto = true;

		// main game loop
		while (mjesto) {
			// activates player Xs turn, then prints board
			SpustiX();
			IspisiTablu();

			// determines if player X has won
			if (!ProvjeriX()) {
				mjesto = false; // sets flag to false so loop is not repeated if
								// player X won
				break; // break to skip player Os turn if won
			}

			// activates player Os turn, then prints the board
			SpustiO();
			IspisiTablu();

			// determines if player X has won
			if (!ProvjeriO()) {
				mjesto = false; // sets flag to false so loop is not repeated if
								// player O won
				break; // break for consistency
			}
		}
	}

}