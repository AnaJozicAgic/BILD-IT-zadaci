package zadaci_08_02_2016;

import java.math.BigInteger;

public class LargePrimes {

	public static void main(String[] args) {
		// string that stores Long.MAX_VALUE
		String val = "" + Long.MAX_VALUE;
		// Big integer to store string value
		BigInteger b = new BigInteger(val);

		// counter
		int brojac = 0;
		// loop for printing 5 primes biger than Long.MAX_VALUE
		while (brojac < 5) {
			// Increase long.MAX_VALUE by one
			b = b.add(BigInteger.ONE);
			// printing probable primes
			if (b.isProbablePrime(b.intValue())) {
				System.out.println(b.nextProbablePrime());
				brojac++;
			}

		}

	}

}
