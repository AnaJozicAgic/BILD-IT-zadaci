package zadaci_29_01_2016;

public class NxNmatrica {
	public static void printMatrix(int n) {

		// Creating new 2D array n*n size
		int[][] matrica = new int[n][n];

		// Loop to fill 0 and 1 values in array
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				int c = (int) (Math.random() * 2);
				matrica[i][j] = c;
			}
		}

		// Loop to print array
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			// Prompting user to enter value of matrix length
			System.out.println("Unesite dimenzije matrice nXn:");
			int n = input.nextInt();
			printMatrix(n);
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
		input.close();
	}

}
