package zadaci_18_01_2016;

public class StoKarakteraStoBrojeva {

	// Method for printing elements of arguments passed to the method
	public static void print(char[] a, int[] b) {
		int charCounter = 0;// Counter for the characters in the array
		int numCounter = 0;// Counter for the numbers

		// Loop for printing characters 10 per line
		for (int i = 0; i < a.length; i++) {
			charCounter++;
			System.out.print(a[i] + " ");

			if (charCounter % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// Loop for printing numbers 10 per line
		for (int i = 0; i < b.length; i++) {
			numCounter++;
			System.out.print(b[i] + " ");

			if (numCounter % 10 == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		char[] karakteri = new char[100];// Array for storing 100 characters
		int[] brojevi = new int[100];// Array for storing 100 numbers

		// Loop for adding adding random chars to the char array
		for (int i = 0; i < karakteri.length; i++) {
			karakteri[i] = (char) ((int) 'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));
		}
		// Loop for adding numbers to int array
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = (int) (Math.random() * 100);
		}
		// Invoking the method
		print(karakteri, brojevi);
	}

}
