package zadaci_25_01_2016;

import java.util.ArrayList;

public class PrimarniBrojevi {

	public static void main(String[] args) {
		ArrayList<Integer> primarni = new ArrayList<>();// ArrayList for prime
		// numbers
		int prvi = 2;
		for (int i = prvi; i <= 1000; i++) { // first Loop for listing
			// numbers in array between
			// first and second
			int brojac = 0;// counter to count how many times number was divided
			// successfully

			// in this Loop first value takes value of the i every time i is
			// increased, so it could be compared with all values in a array if
			// it was divisible with them and no 1
			for (prvi = i; prvi >= 1; prvi--) {
				if (i % prvi == 0) {
					brojac++;
				}
			}
			if (brojac == 2) {
				primarni.add(i); // So if number was divided twice number is
				// prime

			}

		}

		int brojac2 = 0;//Counter for printing values 8 per line
		
		//Loop for printing prime numbers
		for (int i = 0; i < primarni.size(); i++) {
			System.out.print(primarni.get(i).intValue() + " ");
			brojac2++;
			if (brojac2 % 8 == 0) {
				System.out.println();
			}
		}

	}

}
