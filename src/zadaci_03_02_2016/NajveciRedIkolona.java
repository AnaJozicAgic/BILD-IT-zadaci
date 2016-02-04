package zadaci_03_02_2016;

public class NajveciRedIkolona {
	public static int jediniceUredu(int matrix[][], int poz) {
		// Method for counting ones in a row
		int brojacJedinica = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[poz][i] == 1) {
				brojacJedinica++;
			}
		}

		return brojacJedinica;
	}

	public static int jediniceUkoloni(int matrix[][], int poz) {
		// Method for counting ones in a column
		int brojacJedinica = 0;

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][poz] == 1) {
				brojacJedinica++;
			}
		}

		return brojacJedinica;
	}

	public static void main(String[] args) {

		// Matrix that stores zeros and ones
		int matrix[][] = new int[4][4];
		// Loop for storing values to the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		//Loop for printing matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		
		int brojacRedovi[] = new int[4];//Array to store count of ones by row
		int brojacKolone[] = new int[4];//Array to store count of ones by column
		
		//Loop to store ones by row and column to counter arrays
		for (int i = 0; i < matrix.length; i++) {
			brojacRedovi[i] = jediniceUredu(matrix, i);
			brojacKolone[i] = jediniceUkoloni(matrix, i);

		}
		int maxRed = 0;//Value to find row with max count of ones
		int maxCol = 0;//Value to find column with max count of ones
		
		//Loop to identify max values
		for (int i = 0; i < matrix.length; i++) {
			while (brojacRedovi[i] > maxRed) {
				maxRed = brojacRedovi[i];
			}
			while (brojacKolone[i] > maxCol) {
				maxCol = brojacKolone[i];
			}

		}
		
		//Loop for printing first column with max count of ones
		for (int i = 0; i < matrix.length; i++) {
			if (brojacKolone[i] == maxCol) {
				System.out.println("Indeks kolone sa najvise jedinica je :" + i);
				break;
			}

		}
		//Loop for printing first row with max count of ones
		for (int i = 0; i < matrix.length; i++) {
			if (brojacRedovi[i] == maxRed) {
				System.out.println("Indeks reda sa najvise jedinica je :" + i);
				break;

			}

		}

	}

}
