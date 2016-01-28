package zadaci_27_01_2016;

public class Napojnica {

	public static void main(String[] args) {
		// Exception handling block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite iznos racuna: ");
			double iznos = input.nextDouble();
			System.out.println("Unesite postotak napojnice:");
			double postotak = input.nextDouble();

			double napojnica = (iznos * postotak) / 100;// Calculating tip value
			double ukupanIznos = iznos + napojnica;// Calculating total amount
			// Output for the user
			System.out.println("Iznos naponice je : " + napojnica + "\nUkupan iznos racuna je: " + ukupanIznos);

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
