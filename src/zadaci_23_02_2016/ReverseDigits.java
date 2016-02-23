package zadaci_23_02_2016;

public class ReverseDigits {
	// String to store reverse number
	public static String a = "";

	public static void reverseDisplay(int value) {
		// when value is 0 stop the spin and print reverse number
		if (value == 0) {
			System.out.println(a);
		} else {
			// Otherwise ad last digit to the string
			a += value % 10;
			// spin with last digit removed
			reverseDisplay(value / 10);
		}

	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter value to be processed
			System.out.println("Unesite integer: ");
			int reverse = input.nextInt();
			// Invoking the method
			reverseDisplay(reverse);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
