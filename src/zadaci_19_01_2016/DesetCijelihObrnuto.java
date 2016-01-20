package zadaci_19_01_2016;

import java.util.InputMismatchException;

public class DesetCijelihObrnuto {

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Handling exceptions
		try {

			// Prompting the user to enter values to be procesed
			System.out.println("Unesite 10 brojeva: ");
			double[] niz = new double[10];// Array for storing entered values

			// Loop for storing values
			for (int i = 0; i < niz.length; i++) {
				niz[i] = input.nextDouble();
			}

			System.out.println();// Just so it's pretty

			// Loop for printing values backwards
			for (int i = niz.length - 1; i >= 0; i--) {
				System.out.print(niz[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske ");
		}

		input.close();
	}

}
