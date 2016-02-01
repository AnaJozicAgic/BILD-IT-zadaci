package zadaci_30_01_2016;

public class Piramida {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter height
			System.out.println("Uesite broj za visinu piramide");
			int x = input.nextInt();
			// Loop for height
			for (int i = 1; i <= x; i++) {
				// Loop for printing spaces
				for (int j = 1; j <= x - i; j++) {
					System.out.print("   ");
				}
				// Loop for printing the left side
				for (int k = i; k >= 1; k--) {
					if (k > x) {
						System.out.println("  ");
					} else {
						System.out.print("  " + k);
					}

				}
				// Loop for printing right side
				for (int l = 2; l <= i; l++) {
					if (l > x) {
						System.out.println("  ");
					} else {
						System.out.print("  " + l);
					}

				}
				System.out.println();

			}
			input.close();
		} catch (Exception e) {
		System.out.println("Doslo je do greske.");
		}
	}

}
