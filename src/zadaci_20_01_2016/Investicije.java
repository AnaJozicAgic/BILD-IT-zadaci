package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class Investicije {

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Handling exception
		try {

			// Prompting user to enter values to be procesed
			System.out.println("Unesite iznos investicije: ");
			double investicija = input.nextDouble();// Variable for storing
													// start amount

			System.out.println("Unesite godisnju stopu");
			double godisnjaStopa = input.nextDouble();// Variable for storing
														// annual interest

			System.out.println("Unesite broj godina: ");
			double god = input.nextDouble();// Variable for storing duration in
											// year's

			double mjesecnaStopa = godisnjaStopa / 1200;// Variable for storing
														// monthly rate

			double buduca;// Variable that stores calculated amount of
							// investment
							// in the future
			buduca = investicija * (Math.pow(1 + mjesecnaStopa, god * 12));

			// Output for the user
			System.out.println("Iznos navedene investicije nakon unesenog broja godina \n"
					+ "prema unesenoj godisnjoj stopi je: " + buduca);
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}

		input.close();
	}

}
