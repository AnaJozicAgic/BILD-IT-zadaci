package zadaci_17_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class ProstiBrojevi {
	// Method for finding and displaying prime numbers
	public static void prostiBrojevi(int first, int second, int linije) {
		
		// Switching places if first value is larger than second value
		int temp = 0;
		if (first > second) {
			temp = first;
			first = second;
			second = temp;
		}
		// ArrayList for collecting prime numbers
		ArrayList<Integer> primarni = new ArrayList<>();

		// Double loop for finding prime numbers
		for (int i = first; i <= second; i++) { // first Loop for listing
												// numbers in array between
												// first and second
			int brojac = 0;// counter to count how many times number was divided
							// successfully

			// in this Loop first value takes value of the i every time i is
			// increased, so it could be compared with all values in a array if
			// it was divisible with them and no 1
			for (first = i; first >= 1; first--) {
				if (i % first == 0) {
					brojac++;
				}
			}
			if (brojac == 2) {
				primarni.add(i); // So if number was divided twice number is
									// prime

			}

		}

		int brojac2 = 0;// counter of elements in a line

		// Loop for the output to the user
		for (int i = 0; i < primarni.size(); i++) {
			System.out.print(primarni.get(i).intValue() + " ");
			brojac2++;
			if (brojac2 % linije == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) throws InputMismatchException {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// try-catch block for handling Exceptions
		try {

			// Taking values to be processed from the user
			System.out.println("Unesite pocetak i kraj raspona\n u kojem zelite da vam se ispisu prosti brojevi.");

			int pocetak = input.nextInt();
			int kraj = input.nextInt();

			System.out.println(" Unesite broj, koliko brojeva po liniji zelite da bude ispisano.");
			int brLinija = input.nextInt();

			// Invoking the method
			prostiBrojevi(pocetak, kraj, brLinija);

		} catch (InputMismatchException e) {
			System.out.println(" Zao mi je trbali ste unijeti brojcane vrijednosti");

		}
		input.close();
	}

}
