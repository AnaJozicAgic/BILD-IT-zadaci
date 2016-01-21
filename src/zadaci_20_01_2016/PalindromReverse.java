package zadaci_20_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class PalindromReverse {

	// Method for reversing the entered number

	public static int reverse(int number) {

		int returnNum = 0;// Variable for storing reversed number

		// Loop for reversing the number
		while (number > 0) {
			returnNum = returnNum * 10;
			returnNum = returnNum + number % 10;
			number = number / 10;
		}
		System.out.println();
		System.out.println(returnNum);// Output of the reversed number to the
										// user

		// Outputting return of the method to check if number is palindrome or
		// not
		System.out.println("Broj je palindrom: " + isPalindrome(returnNum));

		return returnNum;
	}

	// Method for checking if entered number is palindrome
	public static boolean isPalindrome(int number) {
		ArrayList<Integer> brojevi = new ArrayList<>();// ArrayList for storing
														// individual digits
		int ostatak = 0;
		// Loop for separating digits and adding team to the ArrayList
		while (number != 0) {
			ostatak = number % 10;
			brojevi.add(ostatak);
			number = number / 10;

		}

		// Condition to chack if entered number is palindrome true or false
		if (brojevi.get(0).intValue() == brojevi.get(brojevi.size() - 1).intValue()) {
			return true;
		} else if ((brojevi.get(0).intValue() == brojevi.get(brojevi.size() - 1).intValue())
				&& (brojevi.get(1).intValue() == brojevi.get(brojevi.size() - 2).intValue())) {
			return true;
		} else if ((brojevi.get(0).intValue() == brojevi.get(brojevi.size() - 1).intValue())
				&& (brojevi.get(1).intValue() == brojevi.get(brojevi.size() - 2).intValue())
				&& (brojevi.get(2).intValue() == brojevi.get(brojevi.size() - 3).intValue())) {
			return true;
		}

		else

		{
			return false;
		}

	}

	public static void main(String[] args) throws InputMismatchException {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Handling exception
		try {
			// Prompting user to enter value to be processed
			System.out.println("Unesite broj : ");

			int broj = input.nextInt();// Variable for storing number

			reverse(broj);// Invoking the method
		} catch (Exception e) {
			System.out.println("Doslo je do greske unosa.");
		}
		input.close();
	}

}
