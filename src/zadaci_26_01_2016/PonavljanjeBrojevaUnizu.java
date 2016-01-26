package zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;

public class PonavljanjeBrojevaUnizu {

	public static void main(String[] args) {
		// Exception handling block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			ArrayList<Integer> niz = new ArrayList<>();// List for entered
														// values
			System.out.println("Unesite niz brojeva od 1 do 100, nula prekida unos brojeva;");

			int broj = input.nextInt();
			if(broj>100){
				System.out.println("Unijeli ste prevelik broj.");
				broj=input.nextInt();
			}
			// Loop for adding values to the list
			while (broj != 0) {
			
				niz.add(broj);
				broj = input.nextInt();
				if(broj>100){
				System.out.println("Unijeli ste prevelik broj.");
				broj=input.nextInt();
			}
			}

			int brojac = 0;// Counter to store frequency

			//Loop to check all numbers 1-100 if they are in the array
			for (int i = 0; i < 100; i++) {
				brojac = Collections.frequency(niz, i);
				if (brojac > 0) {
					// Output for the user
					System.out.println(" Broj " + i + " Ponjavio se " + brojac + " puta");
				}

			}
			if(niz.isEmpty()){
				System.out.println("Nema unesenih brojeva.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
