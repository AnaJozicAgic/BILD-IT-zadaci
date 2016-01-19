package zadaci_18_01_2016;

import java.util.InputMismatchException;

public class BrojKnjige {

	public static void main(String[] args) throws InputMismatchException {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Handling the exception
		try {

			// Prompting the user to enter values to be processed
			System.out.println("Unesite devet brojeva za izracunavanje ISBN ");
			
			// Placing the values in an array
			int[] brojevi = new int[9];
			for (int i = 0; i < brojevi.length; i++) {
				brojevi[i] = input.nextInt();
			}

			int checksum = 0; // Variable to store value of the 10. number

			int up = 0;// position counter needed for ISBN calculation

			// loop for summing the values
			for (int i = 0; i < brojevi.length; i++) {
				up++;
				checksum += brojevi[i] * up;
			}
			checksum %= 11;

			// conditions for outputting the ISBN
			if (checksum == 10) {
				for (int i = 0; i < brojevi.length; i++) {

					System.out.print(brojevi[i] + " ");
				}
				System.out.print("X");
			} else {
				for (int i = 0; i < brojevi.length; i++) {
					System.out.print(brojevi[i] + " ");
				}
				System.out.print(checksum);
			}
		} catch (Exception e) {
			System.out.println(" Doslo je do greske ");
		}

		input.close();
	}
}
