package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class PoredjenjeNizova {

	// Method to check if arrays are absolutely equal
	public static boolean equals(int[] niz1, int[] niz2) {

		// loop for checking if arrays are equal
		for (int i = 0; i < niz1.length;) {
			if (Arrays.equals(niz1, niz2)) {
				return true;

			} else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) throws InputMismatchException {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Tray-Catch block for handling the exception
		try {
			// Taking values to be processed from the user
			System.out.println("Unesite 10 vrijednosti u prvi niz ");
			int[] prvi = new int[10];

			for (int i = 0; i < prvi.length; i++) {
				prvi[i] = input.nextInt();
			}
			System.out.println("Unesite 10 vrijednosti u drugi niz");
			int[] drugi = new int[10];
			for (int i = 0; i < drugi.length; i++) {
				drugi[i] = input.nextInt();
			}
			// invoking method, and outputting the result to the user
			System.out.println(equals(prvi, drugi));

		} catch (Exception e) {
			System.out.println(" Doslo je do greske kod unosa. ");
		}

		input.close();
	}

}
