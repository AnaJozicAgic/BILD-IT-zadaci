package MiniProjekatCraps;

public class CrapsBonus {

	public static void main(String[] args) {
		int brojacPobjeda = 0;// Win counter
		int brojacPoraza = 0;// Defeat counter

		// Loop to initialize 10000 dice tosses
		for (int j = 0; j < 10000; j++) {
			// Randomizing dice values
			int kockica1 = 1 + (int) (Math.random() * 6);
			int kockica2 = 1 + (int) (Math.random() * 6);
			int suma = kockica1 + kockica2;// Summing dice values
			int[] point = { 4, 5, 6, 8, 9, 10 };// Array of point values

			// Dice toss
			System.out.println(" You rolled " + kockica1 + " + " + kockica2 + " = " + suma);

			// When conditions are met win or defeat is printed and counted
			if (suma == 7 || suma == 11) {
				System.out.println(" You win ");
				brojacPobjeda++;
				System.out.println();
			}

			else if (suma == 2 || suma == 3 || suma == 12) {
				System.out.println(" You loose ");
				System.out.println();
				brojacPoraza++;
			} else {
				System.out.println(" point is " + suma);
				// Loop to compare second toss after point is encountered
				for (int i = 0; i < point.length; i++) {
					if (suma == point[i]) {
						int kockicaI = 1 + (int) (Math.random() * 6);
						int kockicaII = 1 + (int) (Math.random() * 6);
						int suma2 = kockicaI + kockicaII;
						System.out.println(" You rolled " + kockicaI + " + " + kockicaII + " = " + suma2);
						if (suma2 == suma) {
							System.out.println(" You win ");
							System.out.println();
							brojacPobjeda++;
						} else {
							System.out.println(" You loose ");
							System.out.println();
							brojacPoraza++;
						}

					}
				}
			}
		}
		// Output for the user
		System.out.println("Ukupno je bilo " + brojacPobjeda + " pobjeda i " + brojacPoraza + "Poraza");

	}

}
