package zadaci_24_01_2016;

public class BrojDanaUgodini {
	// Method to check if year is leap year
	public static int numberOfDayInAYear(int year) {
		int dana = 365;// If year is not a leap year it contains 365 days

		// When conditions for leap year are met year contains 366 days
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				dana = 366;
			}

		} else if (year % 4 == 0) {
			dana = 366;
		}

		return dana;
	}

	public static void main(String[] args) {
		// Exception handling block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite pocetnu godinu: ");
			int pocetna = input.nextInt();// Start value

			System.out.println("Unesite zavrsnu godinu: ");
			int zavrsna = input.nextInt();// end value

			//Switching places if second value is bigger
			int temp = 0;
			if (pocetna > zavrsna) {
				temp = pocetna;
				pocetna = zavrsna;
				zavrsna = temp;
			}

			// The loop for outputting all year's in a range with number of days
			// per year
			for (int i = pocetna; i <= zavrsna; i++) {
				System.out.println("Broj dana u godini " + i + " je " + numberOfDayInAYear(i));
				input.close();
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
