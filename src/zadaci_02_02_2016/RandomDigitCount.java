package zadaci_02_02_2016;

public class RandomDigitCount {

	public static void main(String[] args) {
		int[] random = new int[100];// Array of 100 random values 0-9
		int[] brojac = new int[10];// Counter of numbers 0-9 in random array

		// Loop for storing random values in a array
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 10);
			random[i] = num;
		}
		// Loop for counting values
		for (int e : random) {
			brojac[e]++;
		}
		// Loop for printing counted values
		for (int j = 0; j < brojac.length; j++) {
			if (brojac[j] == 1 || brojac[j] >= 1) {

				System.out.println("Broj: " + j + " ponovio se : " + brojac[j] + " puta.");
			}
		}

	}

}
