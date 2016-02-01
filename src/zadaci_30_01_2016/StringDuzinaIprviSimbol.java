package zadaci_30_01_2016;

public class StringDuzinaIprviSimbol {

	public static void main(java.lang.String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			// Prompting user to enter string
			System.out.println("Unesite vas String:");
			String test = input.nextLine();

			// Message for the user
			System.out.println(
					"Duzina unesenog stringa je : " + test.length() + " Prvi simbol u stringu je: " + test.charAt(0));
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

		input.close();

	}

}
