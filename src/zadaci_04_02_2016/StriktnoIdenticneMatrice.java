package zadaci_04_02_2016;

public class StriktnoIdenticneMatrice {
	public static boolean equals(int[][] m1, int[][] m2) {
		// checking equal
		int brojac = 0;

		// loop for counting strictly identical elements at position
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] == m2[i][j]) {
					brojac++;
				}
			}
		}
		// so if all elements at positions are equal matrix are identical
		if (brojac == 9) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		try {
			// Prompting user to enter values in two arrays
			java.util.Scanner input = new java.util.Scanner(System.in);
			int[][] m1 = new int[3][3];
			int[][] m2 = new int[3][3];
			System.out.println("Unesite vrijednosti u prvu matricu 3x3:");
			// filling first array
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					m1[i][j] = input.nextInt();
				}
			}
			System.out.println("Unesite vrijednosti u drugu matricu 3x3:");
			// filling second array
			for (int i = 0; i < m2.length; i++) {
				for (int j = 0; j < m2[i].length; j++) {
					m2[i][j] = input.nextInt();
				}
			}
			// when conditions are met the message is printed
			if (equals(m1, m2)) {
				System.out.println("Matrice su striktno identicne");
			} else {
				System.out.println("Matrice nisu striktno identicne");
			}

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}

}
