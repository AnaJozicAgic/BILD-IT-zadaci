package zadaci_03_02_2016;

import java.util.Arrays;

public class SortiranjeDvaDNiza {
	public static void sort(int m[][]) {
		// Sort rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				Arrays.sort(m[i]);
			}
		}
		// Print sorted rows
		System.out.println("Sortirani redovi:");
		System.out.println("_________________");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sortirane kolone nakon \nsortiranja redova :");
		System.out.println("________________________");
		// Temp array to rotate matrix
		int[][] temp = new int[4][4];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				temp[j][i] = m[i][j];

			}
		}
		// Sort columns
		for (int i = 0; i < temp.length; i++) {
			Arrays.sort(temp[i]);
		}
		// Rotate matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[j][i] = temp[i][j];
			}

		}
		//Printing sorted array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			System.out.println("Unesite vrijednosti u niz 4 X 4");
			// Array that is to be sorted
			int[][] niz = new int[4][4];
			// Loop for storing values
			for (int i = 0; i < niz.length; i++) {
				for (int j = 0; j < niz[i].length; j++) {
					niz[i][j] = input.nextInt();
				}
			}
			System.out.println();
			sort(niz);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske, pokusajte ponovo.");
			main(args);
		}

	}

}
