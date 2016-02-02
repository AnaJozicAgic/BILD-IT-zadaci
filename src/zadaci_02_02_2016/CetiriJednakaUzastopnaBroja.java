package zadaci_02_02_2016;

public class CetiriJednakaUzastopnaBroja {

	public static boolean isConsecutiveFour(int[] values) {

		int brojac = 1;// Counter of consecutive equal numbers

		// Loop for counting
		for (int i = 1; i < values.length; i++) {
			if (values[i] - values[i - 1] == 0) {
				brojac++;
			}
		}
		// If there was 4 consecutive equal numbers method return is true
		if (brojac >= 4) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be procesesd
			System.out.println("Unesite duzinu niza :");
			int duzina = input.nextInt();

			System.out.println("Unesite vrijednsti u niz:");
			int[] niz = new int[duzina];

			// Loop to store values in a array
			for (int i = 0; i < niz.length; i++) {
				niz[i] = input.nextInt();
			}
			// If method return is true or false, message is printed to the user
			if (isConsecutiveFour(niz)) {
				System.out.println("U nizu postoje 4 uzastopna broja.");
			} else {
				System.out.println("U nizu ne postoje 4 uzastopna broja.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
