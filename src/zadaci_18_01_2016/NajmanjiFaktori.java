package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class NajmanjiFaktori {
	// Method for finding and listing smallest factors
	public static ArrayList<Integer> najmanjiFaktori(int broj) {

		int min = 0;// Variable for finding smallest factor

		ArrayList<Integer> faktori = new ArrayList<>();// ArrayList for storing
														// smallest fsctors
		// Loop for finding and storing smallest factors
		for (int i = 2; i <= broj; i++) {
			while (broj % i == 0) {
				min = i;
				faktori.add(min);
				broj /= i;
			}
		}
		return faktori;
	}

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Block for handling the exceptions
		try {
			
			// Prompting the user to enter value to be processed
			System.out.println("Unesite broj za faktorisanje: ");
			int broj = input.nextInt();

			// for each loop for invoking the method and outputting its return
			// to the user
			for (int i : najmanjiFaktori(broj)) {
				System.out.print(i + ",");
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske ");
		}

		input.close();
	}

}
