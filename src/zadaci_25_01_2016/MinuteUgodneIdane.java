package zadaci_25_01_2016;

public class MinuteUgodneIdane {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Exception handling block
		try {
			// Prompting user to enter value to be processed
			System.out.println("Unesite broj minuta: ");
			long minute = input.nextLong();

			// calculating hours from entered minutes
			long sati = minute / 60;
			
			// calculating days from entered minutes
			long dana = sati / 24;
			sati = sati % 24;// remaining hours after days are calculated
			
			// Calculating years
			long godina = dana / 365;
			dana = dana % 365;// remaining days after years are calculated
			
			// Output for the user
			System.out.println(minute + " minuta je " + godina + " godina i " + dana + " dana");
		
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
