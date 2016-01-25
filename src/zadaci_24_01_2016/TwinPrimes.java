package zadaci_24_01_2016;

import java.util.ArrayList;

public class TwinPrimes {

	public static void main(String[] args) {
		ArrayList<Integer> primarni = new ArrayList<>();// ArrayList for prime
														// numbers
		ArrayList<String> listaTwinPrime = new ArrayList<>();// ArrayList for
																// twin prime
		String par = "";

		int prvi = 0;
		for (int i = prvi; i <= 10000; i++) { // first Loop for listing
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

		// Loop for finding twin primes and storing them in a arrayList
		for (int k = 0; k < primarni.size(); k++) {
			for (int l = primarni.size() - 1; l >= 0; l--) {
				if (primarni.get(k).intValue() - primarni.get(l).intValue() == 2) {
					par = primarni.get(k).intValue() + "-" + primarni.get(l).intValue();
					listaTwinPrime.add(par);
				}
			}
		}

		String space = "    ";// just so its pretty

		int brojac2 = 0;
		// Loop for outputting pairs 10 per line
		for (int z = 0; z < listaTwinPrime.size(); z++) {
			brojac2++;
			if (brojac2 <= 10) {
				System.out.print(listaTwinPrime.get(z).toString() + "," + space + "\t");
			} else {
				System.out.print(listaTwinPrime.get(z).toString() + ",\t");
			}

			if (brojac2 % 10 == 0) {
				System.out.println();
			}
		}

	}
}