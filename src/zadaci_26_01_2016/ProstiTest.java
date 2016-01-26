package zadaci_26_01_2016;

import java.util.ArrayList;

public class ProstiTest {
	public static int isPrime(int n) {
		int prime = 0;

		int brojac = 0;// counter to count how many times number was divided
		// successfully

		// Loop for checking if argument is prime number
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				brojac++;
			}
		}
		// So if number is divided twice successfully number is prime
		if (brojac == 2) {
			prime = n;

		}
		return prime;
	}

	public static void main(String[] args) {
		ArrayList<Integer> primarni = new ArrayList<>();// ArrayList for prime
		// numbers

		int prime = 0;
		for (int i = 0; i <= 100000; i++) { // first Loop for listing
			prime = isPrime(i);
			if (prime > 0) {
				primarni.add(prime);
			}
		}

		int brojac2 = 0;// Counter for printing values 8 per line

		// Loop for printing prime numbers
		for (int i = 0; i < primarni.size(); i++) {
			System.out.print(primarni.get(i).intValue() + "\t");
			brojac2++;
			if (brojac2 % 5 == 0) {
				System.out.println();
			}
		}

	}

}
