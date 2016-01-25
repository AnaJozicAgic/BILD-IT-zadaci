package zadaci_25_01_2016;

import java.util.ArrayList;

public class SumaProsjekPrebrojavanje {

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			// Prompting user to enter values to be processed
			System.out.println("Unesite vrijednosti u niz, unos vrijednosti se zavrsava sa 0:");

			int brojevi = input.nextInt();

			// ArrayList for storing entered values
			ArrayList<Integer> lista = new ArrayList<>();

			// Loop to add entered values to the arrayList while entered value
			// is not a zero
			while (brojevi != 0) {
				lista.add(brojevi);
				brojevi = input.nextInt();

			}

			int brojacPoz = 0;// Counter for positive values
			int brojacNeg = 0;// Counter for negative values
			double suma = 0;// Variable for calculating and storing sum
			double prosjek = 0;// Variable for calculating and storing average

			// Loop for counting positive and negative values and summing all
			// values in the array
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).intValue() > 0) {
					brojacPoz++;
				}
				if (lista.get(i).intValue() < 0) {
					brojacNeg++;
				}
				suma += lista.get(i).intValue();

			}
			prosjek = suma / lista.size();

			// Output for the user
			System.out.println("U unesenom nizu ima ukupno" + "\nNegativnih vrijednosti: " + brojacNeg
					+ "\nPozitivnih vrijednosti: " + brojacPoz + "\nSuma unesenih vrijednosti je: " + suma
					+ "\nProsjek unesenih vrijednosti je: " + prosjek);

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}

	}

}
