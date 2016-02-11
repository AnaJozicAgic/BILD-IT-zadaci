package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {

	public static Integer max(ArrayList<Integer> list) {
		// If list is not empty return max value otherwise return null
		if (list.size() > 0) {
			int max = Collections.max(list);
			return max;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		try {
			// new array list
			ArrayList<Integer> lista = new ArrayList<>();
			// prompting user to enter values to be processed
			System.out.println("Unesite niz brojeva, niz se zavrasava sa 0: ");
			java.util.Scanner input = new java.util.Scanner(System.in);
			// storing values to arrayList
			int brojevi = input.nextInt();
			while (brojevi != 0) {
				lista.add(brojevi);
				brojevi = input.nextInt();

			}
			// printing method return to the user
			System.out.println("Maximalna vrijednost u unesenom nizu je : " + max(lista));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
			main(args);
		}
	}

}
