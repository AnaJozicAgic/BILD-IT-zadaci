package zadaci_23_02_2016;

public class ReverseStringHigh {
	// string to store reverse string
	public static String a = "";
	public static int high = 1;
	public static void reverseDisplay(String value, int high) {
		// if reverse string length equals entered string length print reverse
		// string
		if (a.length() == value.length()) {
			System.out.println(a);
		} else {
			// otherwise add char at index
			a += value.charAt(value.length() - high);
			// Increase the index decrease value
			high++;
			// Spin method
			reverseDisplay(value, high);

		}
	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter String
			System.out.println(" Unesite text: ");
			String tekst = input.nextLine();
			// invoking method
			reverseDisplay(tekst, high);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
