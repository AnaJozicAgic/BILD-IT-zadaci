package zadaci_15_01_2016;

public class NajveciDjelilac {
	// Method that return's the largest divider of entered values
	public static int maxDjelilac(int a, int b) {

		int max = 0;
		int temp = 0;
		// Check that replaces the positions of the values if necessary
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		// The loop that find's the largest divider
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && a % i == 0) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		// Taking values form the user
		// The values will bee used as arguments for the method
		System.out.println("Unesite dva broja: ");
		java.util.Scanner input = new java.util.Scanner(System.in);

		int no1 = input.nextInt();
		int no2 = input.nextInt();

		// Invoking the method and displaying the result to the User
		System.out.println("Najveci zajednicki djelilac je: " + maxDjelilac(no1, no2));
		input.close();
	}
}
