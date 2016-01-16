package zadaci_16_01_2016;

public class BacanjeNovcica {

	// Method for coin toss
	public static void bacanje(int n) {

		// Counters for head and tail's
		int glava = 0;
		int pismo = 0;

		// A loop for tossing a coin n times
		for (int i = 0; i < n; i++) {
			int novcic = (int) (Math.random() * 2);
			if (novcic == 0) {
				glava++;
			}
			if (novcic == 1) {
				pismo++;
			}
		}
		System.out.println("Novcic je " + glava + " puta pao na glavu i " + pismo + " puta na pismo.");
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Prompting the User to enter a number of coin tose's
		System.out.println("Unesite koliko puta treba da se baci novcic: ");
		int bacanje = input.nextInt();

		// Invoking a method for coin toss
		bacanje(bacanje);
		input.close();
	}

}
