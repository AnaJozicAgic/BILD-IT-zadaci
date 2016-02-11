package zadaci_11_02_2016;

import java.util.ArrayList;

public class LargestRowsAndColumns {

	public static int jediniceUredu(int[] matrix) {
		//method to count ones in the array

		int count = 0;
		for (int e : matrix) {
			if (e == 1) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		try {
			// Enter array dimension
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite n dimenziju matrice : ");
			int dimenzije = input.nextInt();
			// new array
			int matrix[][] = new int[dimenzije][dimenzije];
			// loop to fill array randomly with 0 nad 1
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = (int) (Math.random() * 2);
				}
			}
			// loop to print matrix
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}

			// ArrayList to store row index of rows with most ones
			ArrayList<Integer> red = new ArrayList<>();
			// array to store number of number of ones per row
			int[] brojac = new int[matrix.length];
			// loop to find and store ones per row
			for (int i = 0; i < matrix.length; i++) {
				brojac[i] = jediniceUredu(matrix[i]);

			}
			// temp value to find max ones per row
			int max = 0;
			for (int i = 0; i < matrix.length; i++) {
				while (brojac[i] > max) {
					max = brojac[i];
				}

			}
			// loop to add index with max ones to the ArrayList
			for (int i = 0; i < brojac.length; i++) {
				if (brojac[i] == max) {
					red.add(i);
				}

			}
			// ArrayList to store column index of columns with most ones
			ArrayList<Integer> kolona = new ArrayList<>();
			// Loop to rotate matrix
			int[][] matrix2 = new int[dimenzije][dimenzije];
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix2[j][i] = matrix[i][j];
				}

			}
			// counter array to store number of ones per column
			int[] brojac2 = new int[matrix.length];
			for (int i = 0; i < matrix.length; i++) {
				brojac2[i] = jediniceUredu(matrix2[i]);
			}
			// temp value to find max ones per column
			int max2 = 0;
			// loop to find max ones per column
			for (int i = 0; i < matrix.length; i++) {
				while (brojac2[i] > max2) {
					max2 = brojac2[i];
				}
			}
			// loop to add index of column with max ones to arrayList
			for (int i = 0; i < brojac.length; i++) {
				if (brojac2[i] == max2) {
					kolona.add(i);

				}

			}
			// printing row index to the user
			System.out.print("Red/ovi sa najvise jedinica je: ");
			for (int i = 0; i < red.size(); i++) {
				System.out.print(red.get(i).intValue() + ", ");

			}
			System.out.println();
			// Printing column index to the user
			System.out.print("Kolona/e sa najvise jedinica je: ");
			for (int i = 0; i < kolona.size(); i++) {
				System.out.print(kolona.get(i).intValue() + ",");
			}
			input.close();
			
		} catch (Exception e) {
		System.out.println("Doslo je do greske: ");
		main(args);
		}

	}

}
