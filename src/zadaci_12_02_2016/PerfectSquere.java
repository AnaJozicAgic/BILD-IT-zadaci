package zadaci_12_02_2016;

import java.util.ArrayList;

import java.util.Collections;
import java.util.InputMismatchException;

public class PerfectSquere {

	public static ArrayList<Integer> najmanjiFaktori(int broj) {

		ArrayList<Integer> faktori = new ArrayList<>();// ArrayList for storing
		int min = 0;// Variable for finding smallest factor // smallest fsctors
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
			ArrayList<Integer> lista = new ArrayList<>();
			// Prompting the user to enter value to be processed
			System.out.println("Unesite Integer : ");
			int broj = input.nextInt();

			// counter array to check how many times number was shown in the
			// list
			int[] brojac = new int[Collections.max(najmanjiFaktori(broj)) + 1];
			// for each loop for invoking the method and outputting its return
			// to the user
			for (int i : najmanjiFaktori(broj)) {
				brojac[i]++;

			}
			// loop to ad numbers that showed odd number of times, to the list
			for (int i = 0; i < brojac.length; i++) {
				if (brojac[i] % 2 != 0) {
					lista.add(i);
				}
			}
			System.out.println();
			int brojm = 1;
			// loop to calculate perfect square
			for (int i = 0; i < lista.size(); i++) {

				brojm = brojm * lista.get(i).intValue();
			}
			// printing result to the user
			System.out.println("Najmanji broj koji cini savrsen kvadrat je : " + brojm
					+ "\nKvadrata unesenog broja i njegovih faktorijela je : " + brojm * broj);
			input.close();

		} catch (Exception e) {
			System.out.println("Doslo je do greske ");
			main(args);
		}

		input.close();
	}

}
