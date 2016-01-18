package zadaci_17_01_2016;

import java.util.InputMismatchException;

public class LokacijaNajvecegElementa {

	// Method for finding largest element in 2D array and its position
	public static int[] locateLargest(double[][] a) {
		// variable to store largest element
		double max = 0;

		// loop for finding largest element
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];

				}
			}
		}

		int pozicija[] = new int[2]; // array for storing a row and column index
										// of largest element

		// Loop for finding position of largest element
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max == a[i][j]) {

					pozicija[0] = i;
					pozicija[1] = j;

				}
			}
		}
		// Print for the user
		System.out.println("Najveca vrijednost u 2D nizu je " + max + " i nalazi se na poziciji: ");
		for (int i = 0; i < pozicija.length; i++) {

			System.out.print(pozicija[i] + " ");
		}

		return pozicija;
	}

	public static void main(String[] args) throws InputMismatchException {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Taking values to be processed from the user
		try {
			System.out.println(" Unesite vrijednosti u matricu dimenzija 4 x 4");

			double[][] matrica = new double[4][4];

			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[i].length; j++) {
					matrica[i][j] = input.nextDouble();
				}
			}

			// Invoking the method
			locateLargest(matrica);
		} catch (Exception e) {
			System.out.println(" Doslo je do greske. ");
		} // Handling possible Exception

		input.close();

	}

}
