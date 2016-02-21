package zadaci_20_02_2016;

import java.math.BigInteger;

public class DecimalToFraction {
	// Method that return's the largest divider of entered values
	public static int maxDjelilac(int a, int b) {

		int max = 0;
		int temp = 0;
		// Check that replaces the positions of the values if necessary
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		// The loop that find's the largest divider
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && a % i == 0) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		try {

			// Prompting user to enter value t obe processed
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite decimalni broj:");
			String decimal = input.next();
			// Spiting entered value to whole number and remain
			int cijeli = Integer.parseInt(decimal.split("\\.")[0]);
			int remain = Integer.parseInt(decimal.split("\\.")[1]);
			// Creating new rational object
			Rational2 r = new Rational2();

			int denominator = 0;
			// So if remain us under two digits
			if (!(remain >= 10)) {
				// finding numerator and denominator
				denominator = 10 / remain;
				remain = remain / maxDjelilac(remain, 10);
				// if whole number is bigger than zero multiply with denominator
				// and ad to numerator
				if (cijeli > 0) {
					cijeli = cijeli * denominator;
					remain = cijeli + remain;
				}
				//set rational for printing
				r.setNumerator(new BigInteger("" + remain));
				r.setDenominator(new BigInteger("" + denominator));
				
				//if remain is three digit value
			} else if (!(remain >= 100)) {
				// finding numerator and denominator
				denominator = 100 / maxDjelilac(remain, 100);
				remain = remain / maxDjelilac(remain, 100);
				// if whole number is bigger than zero multiply with denominator
				// and ad to numerator
				if (cijeli > 0) {
					cijeli = cijeli * denominator;
					remain = cijeli + remain;
				}
				//set rational for printing
				r.setNumerator(new BigInteger("" + remain));
				r.setDenominator(new BigInteger("" + denominator));
				//if remain is four digit value
			} else if (!(remain >= 1000)) {
				// finding numerator and denominator
				denominator = 1000 / maxDjelilac(remain, 1000);
				remain = remain / maxDjelilac(remain, 1000);
				// if whole number is bigger than zero multiply with denominator
				// and ad to numerator
				if (cijeli > 0) {
					cijeli = cijeli * denominator;
					remain = cijeli + remain;
				}
				//set rational for printing
				r.setNumerator(new BigInteger("" + remain));
				r.setDenominator(new BigInteger("" + denominator));
				//if remain is five digit value
			} else if (!(remain >= 10000)) {
				// finding numerator and denominator
				denominator = 10000 / maxDjelilac(remain, 10000);
				remain = remain / maxDjelilac(remain, 10000);
				// if whole number is bigger than zero multiply with denominator
				// and ad to numerator
				if (cijeli > 0) {
					cijeli = cijeli * denominator;
					remain = cijeli + remain;
				}
				//set rational for printing
				r.setNumerator(new BigInteger("" + remain));
				r.setDenominator(new BigInteger("" + denominator));
			}
			//Printing fraction
			System.out.println(r.toString());
		} catch (NumberFormatException e) {
			System.out.println("Doslo je do greske. ");
		}

	}

}
