package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class UnikatniBrojevi {

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			ArrayList<Integer> niz = new ArrayList<>();// List for entered
			// values
			System.out.println("Unesite 10 brojeva:");

			// Loop for adding values to the list
			int brojac = 0;
			while (brojac < 10) {
				int broj = input.nextInt();
				niz.add(broj);
				brojac++;
			}
			//Getting max value entered
			int max = 0;
			for (int i = 0; i < niz.size(); i++) {
				if (max < niz.get(i).intValue()) {
					max = niz.get(i).intValue();
				}
			}

			int brojac2 = 0;// Counter to store frequency

			// Loop to check all numbers 0-max value if they are in the array
			for (int i = 0; i <= max; i++) {
				brojac2 = Collections.frequency(niz, i);
				if (brojac2 == 1 || brojac2 >= 1) {
					// Output for the user
					System.out.println(" Broj " + i + " Ponovio se " + brojac2 + " puta");
				}

			}
			if (niz.isEmpty()) {
				System.out.println("Nema unesenih brojeva.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
