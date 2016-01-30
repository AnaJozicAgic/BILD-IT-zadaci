package zadaci_29_01_2016;

import java.util.ArrayList;

public class SumaCifriUbrouju {
	public static int sumDigits(long n) {
		int suma = 0;//Sum variable

		//ArrayList of digits
		ArrayList<Integer> digits = new ArrayList<>();
		int ost = 0;//object to store in the list
		//Loop to find the object and store it to the list
		while (n != 0) {
			ost = (int) n % 10;
			digits.add(ost);
			n = n / 10;
		}

		//Loop to calculate the sum
		for (int i = 0; i < digits.size(); i++) {
			suma += digits.get(i).intValue();
		}

		return suma;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			//Prompting user to enter value to be processed
			System.out.println("Unesite broj : ");
			long broj = input.nextLong();
			//Printing message and invoking a method
			System.out.println("Suma cifri unesenog broja je: " + sumDigits(broj));

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}
	}

}
