package MiniProjekatTicTacToe;

import java.util.Scanner;

public class TicTacToe {
	// static array for board
	static String[][] ticTacToe = new String[3][3];
	static Scanner input = new Scanner(System.in);

	public static void popuniTablu() {
		// method for reseting board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ticTacToe[i][j] = null;
			}
		}
	}

	public static void ispisiTablu() {
		// method for printing board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ticTacToe[i][j] == null) {
					System.out.print("___|");
				} else {
					System.out.print(ticTacToe[i][j]);
				}

			}
			System.out.println();
		}
	}

	public static void upisiX() {
		// Method to place X value at certain position in the array if position
		// is empty

		// prompting user to enter position of X
		System.out.println("Unesite 0,1 ili 2 za poziciju u redu X:");
		int igrac1red = input.nextInt();
		System.out.println("Unesite 0,1 ili 2 za poziciju u koloni X:");
		int igrac1kolona = input.nextInt();

		// enable reenter position while entered position is taken
		while (ticTacToe[igrac1red][igrac1kolona] != null) {
			System.out.println("Polje je popunjeno:");
			System.out.println("Unesite 0,1 ili 2 za poziciju u redu X:");
			igrac1red = input.nextInt();
			System.out.println("Unesite 0,1 ili 2 za poziciju u koloni X:");
			igrac1kolona = input.nextInt();
		}
		// so if position is empty place a sign
		if (ticTacToe[igrac1red][igrac1kolona] == null) {
			ticTacToe[igrac1red][igrac1kolona] = " X |";
		}

	}

	public static void upisiO() {
		// Method to place O value at certain position in the array if position
		// is empty
		// prompting user to enter position of
		System.out.println("Unesite 0,1 ili 2 za poziciju u redu O:");
		int igrac2red = input.nextInt();
		System.out.println("Unesite 0,1 ili 2 za poziciju u koloni O:");
		int igrac2kolona = input.nextInt();
		// enable reenter position while entered position is taken
		while (ticTacToe[igrac2red][igrac2kolona] != null) {
			System.out.println("Polje je popunjeno:");
			System.out.println("Unesite 0,1 ili 2 za poziciju u redu O:");
			igrac2red = input.nextInt();
			System.out.println("Unesite 0,1 ili 2 za poziciju u koloni O:");
			igrac2kolona = input.nextInt();
		}
		// so if position is empty place a sign
		if (ticTacToe[igrac2red][igrac2kolona] == null) {
			ticTacToe[igrac2red][igrac2kolona] = " O |";
		}

	}

	public static boolean igraj() {

		// conditions for win, loose or tide game
		if (ticTacToe[0][0] == " X |" && ticTacToe[0][1] == " X |" && ticTacToe[0][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[1][0] == " X |" && ticTacToe[1][1] == " X |" && ticTacToe[1][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[1][0] == " X |" && ticTacToe[1][1] == " X |" && ticTacToe[1][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[0][0] == " X |" && ticTacToe[1][0] == " X |" && ticTacToe[2][0] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[0][1] == " X |" && ticTacToe[1][1] == " X |" && ticTacToe[2][1] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[0][2] == " X |" && ticTacToe[1][2] == " X |" && ticTacToe[2][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[0][0] == " X |" && ticTacToe[1][1] == " X |" && ticTacToe[2][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[2][0] == " X |" && ticTacToe[1][1] == " X |" && ticTacToe[0][2] == " X |") {
			System.out.println("Pobjedio je igrac X.");
			return false;
		}
		if (ticTacToe[0][0] == " O |" && ticTacToe[0][1] == " O |" && ticTacToe[0][2] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[1][0] == " O |" && ticTacToe[1][1] == " O |" && ticTacToe[1][2] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[1][0] == " O |" && ticTacToe[1][1] == " O |" && ticTacToe[1][2] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[0][0] == " O |" && ticTacToe[1][0] == " O |" && ticTacToe[2][0] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[0][1] == " O |" && ticTacToe[1][1] == " O |" && ticTacToe[2][1] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[0][2] == " O |" && ticTacToe[1][2] == " O |" && ticTacToe[2][2] == " O |") {
			System.out.println("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[0][0] == " O |" && ticTacToe[1][1] == " O |" && ticTacToe[2][2] == " O |") {
			System.out.print("Pobjedio je igrac O.");
			return false;
		}
		if (ticTacToe[2][0] == " O |" && ticTacToe[1][1] == " O |" && ticTacToe[0][2] == " O |") {
			System.out.println("Pobjedio je igrac O.");

			return false;
		}
		if (ticTacToe[0][0] != null && ticTacToe[0][1] != null && ticTacToe[0][2] != null && ticTacToe[1][0] != null
				&& ticTacToe[1][1] != null && ticTacToe[1][2] != null && ticTacToe[2][0] != null
				&& ticTacToe[2][1] != null && ticTacToe[2][2] != null) {
			System.out.println("Rezultat je nerijesen.");

			return false;

		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println();
			// Prompting user to start or end the game
			System.out.println("Unesite 5 za pokretanje igrice ili 0 za izlaz : ");
			int provjera = input.nextInt();
			if (provjera == 5) {

				// display board
				ispisiTablu();
				// loop to continue game until win, lose or tide
				while (igraj()) {

					// enable input for first player
					upisiX();
					// print board with entered sign
					ispisiTablu();
					// if win,lose,or tide restart game
					if (!igraj()) {
						// reset board
						popuniTablu();
						main(args);
					}
					//enable input for second player
					upisiO();
					ispisiTablu();

				
				// if win,lose,or tide restart game
				if (!igraj()) {
					popuniTablu();

					main(args);
				}
				}
			} else {
				//end game
				System.exit(1);
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske: ");

		}

	}
}