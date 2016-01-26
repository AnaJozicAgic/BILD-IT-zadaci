package zadaci_26_01_2016;

import java.util.Arrays;

public class RastuciRedoslijed {

	public static int[] rastuci(int a, int b, int c) {

		int niz[] = new int[3];// Array To store values
		niz[0] = a;
		niz[1] = b;
		niz[2] = c;
		Arrays.sort(niz);// Sorting the array
		return niz;

	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite tri cijela broja: ");
			int jedan = input.nextInt();
			int dva = input.nextInt();
			int tri = input.nextInt();

			// Loop for printing array
			for (int e : rastuci(jedan, dva, tri)) {
				System.out.print(e + ",");
			}

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
