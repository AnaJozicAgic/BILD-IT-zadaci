package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class PrestupneGodine {

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		try {
			// Prompting user to enter values to be processed
			System.out.println("Unesite godinu od koje zelite da se prikazu prestupne godine\n"
					+ " i godinu kojom se taj niz zavrsava: ");

			int prva = input.nextInt();// Variable for storing first year
			int zadnja = input.nextInt();// Variable for storing last year

			// Counter of the leap year's in Array
			int brojac = 0;
			
			// A loop for counting and printing leap Year's
			for (int i = prva; i <= zadnja; i++) {
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						System.out.print(i + " ");
						brojac++;
						if (brojac % 10 == 0) {
							System.out.println();
						}
					}
				} else if (i % 4 == 0) {
					System.out.print(i + " ");
					brojac++;
					if (brojac % 10 == 0) {
						System.out.println();
					}
				}
			}
			System.out.println();

			System.out.println("Broj prestupnih godina u unesenom rasponu je: " + brojac);
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}
		input.close();
	}

}
