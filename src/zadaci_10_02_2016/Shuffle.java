package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	public static void shuffle(ArrayList<Integer> list) {
		// Shuffling values
		Collections.shuffle(list);
		System.out.println("Prerasporedjene vrijednosti : " + list.toString());

	}

	public static void main(String[] args) {
		try {
			// new arrayList
			ArrayList<Integer> list = new ArrayList<>();
			java.util.Scanner input = new java.util.Scanner(System.in);
			// prompting user to enter values to be processed
			System.out.println("Unesite vrijednosti u listu, unos se prekida sa 0  : ");

			int brojevi = input.nextInt();
			// storing values to the arrayList
			while (brojevi != 0) {
				list.add(brojevi);
				brojevi = input.nextInt();
			}
			// invoking a method
			shuffle(list);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
			main(args);
		}
	}

}
