package MiniProjekatCraps;

public class Craps {

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			
			//Prompting user to start the game 
			System.out.println("Unesite 5 da pokrenete igru ili boilo koji \ndrugi broj da ustanete od stola.");

			int provjera = input.nextInt();//check value
			int brojacPobjeda = 0;//Win counter
			int brojacPoraza = 0;//Defeat Counter
			
			// Loop so game could be continued
			while (provjera == 5) {
				int kockica1 = 1 + (int) (Math.random() * 6);
				int kockica2 = 1 + (int) (Math.random() * 6);
				int suma = kockica1 + kockica2;
				int[] point = { 4, 5, 6, 8, 9, 10 };

				// Dice toss
				System.out.println(" You rolled " + kockica1 + " + " + kockica2 + " = " + suma);

				// Check conditions 
				if (suma == 7 || suma == 11) {
					System.out.println(" You win ");
					brojacPobjeda++;
					System.out.println();

					System.out.println("Unesite 5 za novo bacanje ili bilo koji \ndrugi broj da ustanete od stola ");
					provjera = input.nextInt();
					System.out.println();

				}

				else if (suma == 2 || suma == 3 || suma == 12) {
					System.out.println(" You loose ");
					System.out.println();
					brojacPoraza++;

					System.out.println("Unesite 5 za novo bacanje ili bilo koji \ndrugi broj da ustanete od stola ");
					provjera = input.nextInt();
					System.out.println();
				} else {
					System.out.println(" point is " + suma);
				}
				//Loop for second toss if sum of first toss is a point
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

							System.out.println("Unesite 5 za novo bacanje ili bilo koji \ndrugi broj da ustanete od stola ");
							provjera = input.nextInt();
							System.out.println();
						} else {
							System.out.println(" You loose ");
							System.out.println();
							brojacPoraza++;

							System.out.println("Unesite 5 za novo bacanje ili bilo koji \ndrugi broj da ustanete od stola ");
							provjera = input.nextInt();
							System.out.println();
						}

					}
				}
			}
			//When user wants to end the game he gets the win vs defeat message
			if (provjera != 5) {

				System.out.println("Ukupno je bilo " + brojacPobjeda + " pobjeda i " + brojacPoraza + "Poraza");
			System.exit(1);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
