package zadaci_02_02_2016;

public class SumaElemenataKolonaPoKolona {
	public static double sumColumn(double[][] m, int columnIndex) {
		double suma = 0;// return sum
		// Loop for summing values in a single column
		for (int i = 0; i < m.length; i++) {
			suma += m[i][columnIndex];
		}
		return suma;
	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values in the array
			System.out.println("Unesite vrijed nosti u niz 3 X 4 red po red:");
			// Array for storing values
			double[][] niz = new double[3][4];

			// Loop for adding values to the array
			for (int row = 0; row < niz.length; row++) {
				for (int col = 0; col < niz[row].length; col++) {
					niz[row][col] = input.nextDouble();
				}
			}
			// Loop for summing values in all individual columns
			for (int i = 0; i < 4; i++) {
				System.out.println("Sume elemenata u coloni " + i + " je " + sumColumn(niz, i));
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
