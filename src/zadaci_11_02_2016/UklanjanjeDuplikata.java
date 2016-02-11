package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class UklanjanjeDuplikata {
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> lista= new ArrayList<>();
		//Counter array to count individual values in the arrayList
		int brojac[] = new int[Collections.max(list) + 1];
		//Loop to count and remove duplicate values
		for (int e : list) {
			brojac[e]++;
			if (brojac[e] == 1) {
				System.out.print(e + " ");
				lista.add(e);
			}
		}

	}

	public static void main(String[] args) {
		try {
			// arrayList to store entered values
			ArrayList<Integer> lista = new ArrayList<>();
			java.util.Scanner input = new java.util.Scanner(System.in);
			// prompting user to enter values
			System.out.println("Unesite 10 vrijednosti u listu ");

			// loop to store values in the array list
			for (int i = 0; i < 10; i++) {
				int brojevi = input.nextInt();
				lista.add(brojevi);

			}
			//invoking method
			removeDuplicate(lista);
			input.close();
		} catch (Exception e) {
			System.out.println("Doalo je do greske. ");
			main(args);
		}
	}

}
