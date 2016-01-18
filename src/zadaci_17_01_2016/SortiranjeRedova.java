package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SortiranjeRedova {

	// Method for Row sorting
	public static double[][] sortRows(double[][] array) {
		// Loop for sorting rows
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				Arrays.sort(array[i]);
			}
		}

		double[][] array2 = array; // Copying values of sorted array to new
									// array

		// Loop for outputting sorted array to the user
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}

		return array2;
	}

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Tray-catch block for handling exceptions
		try {

			// Taking values to be processed from the user
			System.out.println(" Unesite broj redova i kolona za niz; ");
			int a = input.nextInt();
			int b = input.nextInt();

			double[][] niz = new double[a][b];

			System.out.println("Unesite vrijednosti u niz: ");

			for (int i = 0; i < niz.length; i++) {
				for (int j = 0; j < niz[i].length; j++) {
					niz[i][j] = input.nextDouble();
				}
			}

			sortRows(niz); // Invoking a method
		} catch (Exception e) {
			System.out.println(" Doslo je do greske ");
		}

		input.close();
	}

}
