package zadaci_20_01_2016;

public class NeparnePozicijeKaraktera {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Prompting user to enter string
		System.out.println("Unesite neki string: ");

		String unos = input.nextLine();// Variable for storing String

		// Loop for finding chars at odd positions
		for (int i = 0; i < unos.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(unos.charAt(i));
			}
		}
		input.close();

	}

}
