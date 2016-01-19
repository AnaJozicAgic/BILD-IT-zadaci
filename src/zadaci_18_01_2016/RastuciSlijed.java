package zadaci_18_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class RastuciSlijed {

	// Method for sorting and printing sorted values to the user
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double niz[] = new double[3];// Array for storing entered values to be
										// sorted

		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;

		Arrays.sort(niz);// Sorting the array

		// Loop for printing the sorted array
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Block for handling exceptions
		try {

			// prompting the user to enter values to be processed
			System.out.println(" Unesite tri broja: ");

			double broj1 = input.nextInt();
			double broj2 = input.nextInt();
			double broj3 = input.nextInt();

			// Invoking the method for sorting the values
			displaySortedNumbers(broj1, broj2, broj3);
		} catch (Exception e) {
			System.out.println("Doslo je do greske ");
		}

		input.close();
	}

}
