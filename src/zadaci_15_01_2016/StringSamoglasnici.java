package zadaci_15_01_2016;

public class StringSamoglasnici {

	public static void main(String[] args) {
		// Array of vowels for comparing with text input
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

		// Counter of vowels
		int counter = 0;

		// Counter of spaces
		int space = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite tekst: ");

		String txt = input.nextLine();

		// In case input contains UperCase characters
		txt.toLowerCase();

		// Loop for counting
		for (int i = 0; i < txt.length(); i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (txt.charAt(i) == vowel[j]) {
					counter++;
				}
			}
			if (txt.charAt(i) == ' ') {
				space++;
			}
		}

		// Calculating no. of Consonant characters
		int noConsonant = (txt.length() - space) - counter;

		// Output to User
		System.out.println(
				"Broj samoglasnika u unesenom tekstu je: " + counter + "\nBroj suglasnika u tekstu je: " + noConsonant);
input.close();
	}

}
