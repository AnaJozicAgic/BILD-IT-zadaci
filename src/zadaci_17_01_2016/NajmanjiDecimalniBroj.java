package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class NajmanjiDecimalniBroj {

	// Method for finding the smallest decimal in an array
	public static double min(double[] array) {

		double min = 0.0;// Variable to store smallest decimal
		Arrays.sort(array);// Sorting the array
		min = array[0];// Storing the smallest value in a variable

		return min;
	}

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Try-Catch block for handling Exceptions
		try {

			// Entering values to be processed from the user
			System.out.println("Unesite deset vrijednsoti u niz: ");
			double[] niz = new double[10];

			for (int i = 0; i < niz.length; i++) {
				double vrijednost = input.nextDouble();
				niz[i] = vrijednost;
			}
			// Invoking the method and outputting the result to the user
			System.out.println("Najmanja vrijednost u unesenom nizu je " + min(niz));
		
		} catch (InputMismatchException e) {
			System.out.println(" Doslo je do greske unosa ");
		}
input.close();
	}

}
