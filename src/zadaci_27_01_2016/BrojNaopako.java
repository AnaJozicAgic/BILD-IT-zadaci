package zadaci_27_01_2016;

public class BrojNaopako {
	public static void reverse(int number) {
		String revers = "";// String for storing reverse number
		int temp = 0;// temporary value to store remaining value
		// Loop for finding revers numbers
		while (number != 0) {
			temp = number % 10;
			revers += temp;
			number /= 10;

		}
		// transforming string to int
		int naopako = Integer.valueOf(revers);
		// Output to the user
		System.out.println(naopako);

	}

	public static void main(String[] args) {
		// Exception handle block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			// Prompting user to enter values to be processed
			System.out.println("Unesite jedan cijeli broj: ");

			int broj = input.nextInt();
			reverse(broj);// Invoking the method

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
