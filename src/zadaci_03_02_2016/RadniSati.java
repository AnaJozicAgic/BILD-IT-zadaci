package zadaci_03_02_2016;

import java.util.Arrays;

public class RadniSati {
	public static int sumaRedova(int[][] a, int row) {
		// Method for summing values in a single row
		int suma = 0;
		for (int i = 0; i < a[row].length; i++) {
			suma += a[row][i];
		}

		return suma;

	}

	public static void main(String[] args) {

		// Array to store work hours by day
		int[][] radniSati = new int[8][7];
		// Loop to store random values to the array
		for (int i = 0; i < radniSati.length; i++) {
			for (int j = 0; j < radniSati[i].length; j++) {
				radniSati[i][j] = 1 + (int) (Math.random() * 9);
			}
		}
		// Printing array of work hours per day
		System.out.println("              Pon Uto Sri Cet Pet Sub Ned ");
		System.out.println("             _____________________________");

		for (int i = 0; i < radniSati.length; i++) {
			System.out.print("Uposlenik " + i + " : ");
			for (int j = 0; j < radniSati[i].length; j++) {
				System.out.print(radniSati[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("             -----------------------------");
		System.out.println();

		// Weekly sum of work hours per employee
		int[][] suma = new int[8][2];
		// Loop for string weekly sum of work hours per employee
		for (int i = 0; i < radniSati.length; i++) {
			suma[i][0] = i;
			suma[i][1] = sumaRedova(radniSati, i);

		}
		// Printing weekly sum of work hours per employee
		System.out.println("Suma radnih sati: ");
		System.out.println("---------------------");

		for (int i = 0; i < suma.length; i++) {
			System.out.print("Uposlenik ");

			System.out.print(suma[i][0] + " : " + suma[i][1]);

			System.out.println();
		}
		System.out.println("----------------------");
		
		// Comparing and sorting weekly sum of work hours per employee
		Arrays.sort(suma, new java.util.Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(b[1], a[1]);
			}
		});
		// Printing weekly sum of work hours per employee in a decreasing order
		System.out.println("Rang lista : ");
		System.out.println("---------------------");

		for (int row = 0; row < suma.length; row++)
			System.out.println("Uposlenik " + suma[row][0] + " : " + suma[row][1]);
	}

}
