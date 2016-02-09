package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class MersenePrime {

	public static void main(String[] args) {
		// ArrayList to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();
		// Loop to find prime numbers, an store tham to an array
		for (int i = 1; i < 100; i++) {
			int brojac = 0;
			for (int j = i; j >= 1; j--) {

				if (i % j == 0) {
					brojac++;
				}
			}
			if (brojac == 2) {
				primes.add(i);
			}

		}

		System.out.println("p" + "\t2^p-1");
		System.out.println("____________________");
		// Loop for calculating and printing mersene prime numbers
		for (int i = 0; i < primes.size(); i++) {
			String s = "" + new BigDecimal(Math.pow(2, primes.get(i).intValue()) - 1);

			BigInteger t = new BigInteger(s);
			System.out.println(primes.get(i).intValue() + "\t " + t);

		}
	}

}
