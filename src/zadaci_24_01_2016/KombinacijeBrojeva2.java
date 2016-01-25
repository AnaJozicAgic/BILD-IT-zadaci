package zadaci_24_01_2016;

/*This version exists because i was not sure 
 * should the combinations contain 11 22 33...combinations */
public class KombinacijeBrojeva2 {

	public static void main(String[] args) {
		int brojac = 0;// Counter for printing combinations per line

		// Loop for finding and printing combinations
		for (int i = 1; i <= 6; i++) {
			for (int j = i ; j <= 6; j++) {
				System.out.print(i + "-" + j + ", ");
				brojac++;

				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		// Output for the user
		System.out.println("u rasponu ima " + brojac + " kombinacija");

	}

}
