package zadaci_04_02_2016;

import java.util.Arrays;

public class SortiranjeRedova {

	public static double[][] sortRows(double[][] m) {
		// method for sorting rows in the array

		for (int i = 0; i < m.length; i++) {
			Arrays.sort(m[i]);
		}

		return m;
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			double[][] m = new double[3][3];
			// Prompting user to enter values
			System.out.println("Unesite vrijednosti u matricu 3x3: ");
			// Storing values to the array
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextDouble();
				}
			}
			System.out.println();
			// Printing the array
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
			// Printing sorted array
			System.out.println();
			for (int i = 0; i < sortRows(m).length; i++) {
				for (int j = 0; j < sortRows(m)[i].length; j++) {
					System.out.print(sortRows(m)[i][j] + " ");
				}
				System.out.println();
			}
			input.close();
		} catch (Exception e) {
			System.out.println(" Doslo je do greske:");
			main(args);
		}
	}

}
