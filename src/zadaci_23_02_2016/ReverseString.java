package zadaci_23_02_2016;

public class ReverseString {
	// String to store reverse string
	public static String a = "";
	// value to increase index decrease
	public static int i = 1;

	public static void reverseDisplay(String value) {
		// if reverse string length equals entered string value stop the spin
		// and print reverse string
		if (a.length() == value.length()) {
			System.out.println(a);
		} else {
			// otherwise add char at decreased index to the reverse string and
			// spin

			a += value.charAt(value.length() - i);
			i++;
			reverseDisplay(value);

		}

	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter the text
			System.out.println(" Unesite text: ");
			String tekst = input.nextLine();
			// Invoking the method
			reverseDisplay(tekst);
			input.close();
		} catch (Exception e) {
			System.out.println("Dodlo je do greske.");
		}

	}

}
