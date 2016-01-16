package zadaci_16_01_2016;

public class Matrica {

	// Method that creates and print's the Matrix
	public static void printMatrix(int n) {

		// Creating Matrix
		int[][] matrica = new int[n][n];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				int br = (int) (Math.random() * 2);
				matrica[i][j] = br;
			}
		}
		// Printing Matrix
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Prompting the User to Enter a Matrix length
		System.out.println("Unesite broj za duzinu  matrice : ");
		int n = input.nextInt();

		// Invoking the method that creates and print's the Matrix
		printMatrix(n);
		input.close();
	}

}
