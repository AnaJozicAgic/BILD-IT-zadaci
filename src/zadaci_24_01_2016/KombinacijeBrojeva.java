package zadaci_24_01_2016;

public class KombinacijeBrojeva {

	public static void main(String[] args) {

		int brojac = 0;// Counter for printing combinations per line

		// Loop for finding and printing combinations
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				System.out.print(i + "-" + j + ", ");
				brojac++;

				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
		}
		// Output for the user
		System.out.println("u rasponu ima " + brojac + " kombinacija");

	}

}
