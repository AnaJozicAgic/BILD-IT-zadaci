package zadaci_22_01_2016;

public class MiliSekunde {

	public static String convertMillis(long millis) {

		long sec = millis / 1000;// turning milliseconds to seconds
		long min = sec / 60;// turning seconds to minutes
		sec = sec % 60;// calculating remaining seconds
		long sat = min / 60;// Turning minutes to ours
		min = min % 60;// Calculating remaining minutes

		String vrijeme = sat + ":" + min + ":" + sec;// adding values to string
		return vrijeme;// Returning string
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Exception handling
		try {

			// Prompting user to enter value to be procesesd
			System.out.println("Unesite broj milisekundi: ");
			long milis = input.nextLong();

			System.out.println(convertMillis(milis));// Output for the user by
														// invoking a method
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
		input.close();
	}
}
