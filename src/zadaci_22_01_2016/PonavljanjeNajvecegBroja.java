package zadaci_22_01_2016;

import java.util.ArrayList;

public class PonavljanjeNajvecegBroja {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			// Prompting user to enter values to be processed
			System.out.println("Unesite niz cijelih brojeva, niz se zavrsava nulom");
			ArrayList<Integer> lista = new ArrayList<>();// ArrayList to store
															// values
			int broj = input.nextInt();

			// Loop so values could be entered and added to the list while input
			// value is not equal to zero
			while (broj != 0) {
				lista.add(broj);
				broj = input.nextInt();
			}

			int max = 0;// Variable to store max value

			// Loop for finding max value
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).intValue() > max) {
					max = lista.get(i).intValue();
				}
			}

			int brojac = 0;// Variable for counting max values in array
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).intValue() == max) {
					brojac++;
				}
			}
			// Output for the user
			if (lista.isEmpty()) {
				System.out.println("Lista je prazna");
			} else {
				System.out
						.println("Najveca vrijednost u unesenom nizu je " + max + "\nPonavlja se " + brojac + " puta");
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

		input.close();
	}

}
