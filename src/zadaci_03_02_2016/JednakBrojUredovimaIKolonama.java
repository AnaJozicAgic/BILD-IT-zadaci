package zadaci_03_02_2016;

public class JednakBrojUredovimaIKolonama {
	public static int jediniceUredu(int matrix[][], int poz) {
		// Method to count ones in a row
		int brojacJedinica = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[poz][i] == 1) {
				brojacJedinica++;
			}
		}

		return brojacJedinica;
	}

	public static int jediniceUkoloni(int matrix[][], int poz) {
		// Method to count ones in a column
		int brojacJedinica = 0;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][poz] == 1) {
				brojacJedinica++;
			}
		}

		return brojacJedinica;
	}

	public static boolean jednako(int[][] a) {
		// Method to compare all rows and columns if they have even number of
		// ones
		int brojacRedovi[] = new int[6];// Array to store count of ones by row
		int brojacKolone[] = new int[6];// Array to store count of ones by
										// column
		// Loop to store count of ones in rows and columns
		for (int i = 0; i < a.length; i++) {
			brojacRedovi[i] = jediniceUredu(a, i);
			brojacKolone[i] = jediniceUkoloni(a, i);

		}
		int brojac = 0;// Counter of even number in the arrays
		// Loop for counting
		for (int i = 0; i < a.length; i++) {
			if (brojacKolone[i] == brojacRedovi[i]) {
				brojac++;
			}

		}
		// Method return when conditions are met
		if (brojac == 6) {
			return true;
		} else {
			return false;

		}

	}

	public static void main(String[] args) {
		// Creating the array 6X6
		int[][] niz = new int[6][6];
		// Loop for filling the array with 0 and 1
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = (int) (Math.random() * 2);

			}
		}
		// Loop for printing the array
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}
		// When conditions are met message is printed
		if (jednako(niz)) {
			System.out.println("Svi redovi i kolone imaju jednak broj jedinica");
		} else {
			System.out.println("Svi redovi i kolone nemaju jednak broj jedinica");
		}

	}

}
