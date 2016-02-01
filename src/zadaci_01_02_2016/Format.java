package zadaci_01_02_2016;

public class Format {
	public static String format(int number, int width) {

		// Method to create formated String patern
		String form = String.format("%0" + width + "d", number);

		return form;
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite broj: ");
			int br = input.nextInt();
			System.out.println("Unesite sirinu ispisa:");
			int sirina = input.nextInt();

			// Outputting method return to the user
			System.out.println(format(br, sirina));

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
