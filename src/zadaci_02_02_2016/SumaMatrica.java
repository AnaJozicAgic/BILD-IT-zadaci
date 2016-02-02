package zadaci_02_02_2016;

public class SumaMatrica {
	public static double[][] addMatrix(double[][] a, double[][] b) {

		// Array of sum of elements at same positions in the array a and b
		double[][] c = new double[3][3];
		// Loop for summing values at same positions
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			// Prompting user to enter values in the 2D array
			System.out.println("Unesite vrijednosti u matricu a 3X3");
			// Array for storing values

			double[][] a = new double[3][3];
			// Loop for storing values to the first array
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = input.nextDouble();
				}
			}
			System.out.println("Unesite vrijednosti u matricu b 3X3");
			// Array 2 for storing values
			double[][] b = new double[3][3];
			// Loop for storing values to the first array
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					b[i][j] = input.nextDouble();
				}
			}

			// Loop for printing Summing operation and method return
			for (int i = 0; i < addMatrix(a, b).length; i++) {

				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				if (i == 1) {
					System.out.print("   +    ");
				} else {
					System.out.print("        ");
				}
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + " ");
				}
				if (i == 1) {
					System.out.print("   =    ");
				} else {
					System.out.print("        ");
				}
				for (int j = 0; j < addMatrix(a, b)[i].length; j++) {
					System.out.print(addMatrix(a, b)[i][j] + " ");
				}
				System.out.println();
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske, pokusajte ponovo: ");
			main(args);
		}
	}

}
