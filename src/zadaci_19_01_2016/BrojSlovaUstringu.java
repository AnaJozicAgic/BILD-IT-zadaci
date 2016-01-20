package zadaci_19_01_2016;

public class BrojSlovaUstringu {
	public static int countLetters(String s) {
		
		int brojacBrojeva = 0;// Counter for numbers in the string
		int brojacSlova = 0;// Counter for letters in the string

		// Loop for counting elements in String array
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				brojacSlova++;// When letter is found counter increases
			}
			if (Character.isDigit(s.charAt(i))) {
				brojacBrojeva++;// When number is found counter increases
			}

		}
		
		// Output for the user
		System.out.println("U unesenom stringu ima \n" + brojacSlova + " slova \n" + brojacBrojeva + " brojeva");
		return brojacSlova;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Input of a string from the user
		System.out.println("Unesite string za prebrojavanje slova ");

		// Invoking a method
		String string = input.nextLine();
		countLetters(string);
		input.close();
	}

}
