package zadaci_18_01_2016;

import java.util.InputMismatchException;

public class IznadIspodProsjeka {

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//  List for storing Values
		double lista[] = new double[100];
		// Handling the exceptions
		try {
			// Prompting the User to enter values to be processed
			System.out.println(" Unesite n broj brojeva, unos zavrsavate sa 0: ");

			// Loop for adding the values in the List while input value is
			// not a zero

			for (int i = 0; i < lista.length; i++) {
				double broj = input.nextDouble();

				lista[i] = broj;

				if (broj == 0.0) {
					break;
				}

			}

			double sum = 0;// variable to store the sum of entered values
			int brojacElemenata = 0;// Element counter to count how many values
									// wore entered, added this because
									// ArrayList size is limited to 100
			
			// Loop for counting values larger than zero and summing entered values
			for (int i = 0; i < lista.length; i++) {

				if (lista[i] > 0) {
					brojacElemenata++;
				}
				sum += lista[i];
			}

			double prosjek = sum / brojacElemenata;//Calculating the average of entered values

			int brojacVecih = 0;//counter for storing values larger and equal to the average
			int brojacManjih = 0;//counter for storing values smaller than the average

			// Loop for counting values larger and equal or smaller 
			for (int i = 0; i < lista.length; i++) {
				if (lista[i] >= prosjek) {
					brojacVecih++;
				}
				if (lista[i] < prosjek && lista[i] != 0) {
					brojacManjih++;
				}
			}
			
			// Output to the user
			System.out.println(
					"Prosjek vrijednosti unesenih u niz je " + prosjek + "\nBrojeva jednakih ili iznad prosjeka je "
							+ brojacVecih + "\nBroj brojeva ispod prosjeka je " + brojacManjih);
		} catch (Exception e) {
			System.out.println(" Doslo je do greske ");
		}
		input.close();
	}

}
