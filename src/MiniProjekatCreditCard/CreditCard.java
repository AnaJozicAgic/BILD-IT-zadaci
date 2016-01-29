package MiniProjekatCreditCard;

import java.util.ArrayList;

public class CreditCard {
	public static boolean isValid(long number) {
		// Method for checking card validation

		// Sum of odd places digits multiplied and Even places digits
		int ukupno = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		// When conditions are met card is valid, else card is invalid
		if ((ukupno % 10 == 0) && (prefixMatched(number, 1) == true)
				&& ((getSize(number) >= 13) && (getSize(number) <= 16))) {
			return true;
		} else
			return false;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		// Method for summing digits at even places

		int suma = 0;// Variable to calculate sum
		long temp = 0;// Temporary value to declare digit at certain position

		// Loop to sum digits
		while (number > 0) {
			temp = number % 100;
			suma += (getDigit((int) (temp / 10) * 2));
			number = number / 100;

		}

		return suma;

	}

	public static int getDigit(int number) {
		// Method to calculate digit if value is over 9

		if (number <= 9) {
			return number;
		} else {
			int no1 = number % 10;
			int no2 = number / 10;
			number = no1 + no2;
			return number;
		}

	}

	public static int sumOfOddPlace(long number) {
		// Method to get sum of odd places digits
		int suma = 0;
		while (number > 0) {
			suma += number % 10;
			number = number / 100;
		}
		return suma;

	}

	public static boolean prefixMatched(long number, int k) {
		// Method to check prefix value of card number

		// When conditions are met returns true, or false otherwise
		if (getPrefix(number, k) == 4) {
			return true;
		} else if (getPrefix(number, k) == 5) {
			return true;
		} else if (getPrefix(number, k) == 3) {
			return true;
		} else {
			return false;
		}

	}

	public static int getSize(long d) {
		// Method to determine size of the entered number
		int size = 0;// Variable to return size
		long dio = 0;// Temporary value to store remain

		// ArrayList to store individual values
		ArrayList<Long> listaCifri = new ArrayList<>();

		// Loop to find remain, and add it to the list
		while (d != 0) {
			dio = d % 10;
			listaCifri.add(dio);
			d = d / 10;

		}

		size = listaCifri.size();
		return size;
	}

	public static long getPrefix(long number, int k) {
		// Method to get prefix number
		// If prefix number is a single digit, returns number, or if number is
		// double digit returns sum of numbers digits
		if (getSize(number) < k) {
			return number;
		} else {
			int size = getSize(number);
			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}
			return number;
		}

	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			// Prompting user to enter card number for check
			System.out.println("Unesite broj vase kartice: ");
			long card = input.nextLong();

			// When conditions are met, message is printed for the user
			if (isValid(card)) {
				System.out.println("Kartica je validna.");
			} else {
				System.out.println("Kartica nije validna.");
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}

	}

}
