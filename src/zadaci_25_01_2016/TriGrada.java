package zadaci_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;

public class TriGrada {

	public static void main(String[] args) {
		// Exception handling block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter three cities
			System.out.println("Unesite tri grada: ");
			ArrayList<String> gradovi = new ArrayList<>();// ArrayList for
															// storing cittie
															// names

			int brojac = 0;// Counter so only three cities could be entered

			// Loop for entering cities and storing them in a ArrayList when
			// conditions are met
			while (brojac < 3) {
				String grad = input.nextLine();// Inputing city name
				
				//Loop to insure that variable grad has entered value
				while (grad.length() == 0) {
					System.out.println("Unesite naziv grada");
					grad = input.nextLine();
				}
				// Loop to check if Entered value is consisted with Letters and
				// if first letter is a upper case
				for (int i = 0; i < grad.length(); i++) {
					
					if (!(Character.isLetter(grad.charAt(i)))) {
						System.out.println(
								"Nazivi gradova pocinju velikim Slovom i sadrzi samo slova, pokusajte ponovo:");
						grad = input.nextLine();
					}

					if (Character.isLowerCase(grad.charAt(0))) {
						System.out.println("Nazivi gradova pocinju velikim slovom, pokusajte ponovo:");
						grad = input.nextLine();
					}
					
				}
				brojac++;
				gradovi.add(grad);
			}

			Collections.sort(gradovi);// Sorting ArrayList

			// Output for the user
			System.out.println(gradovi.toString());
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
