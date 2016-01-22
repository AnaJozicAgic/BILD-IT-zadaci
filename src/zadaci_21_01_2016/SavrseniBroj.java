package zadaci_21_01_2016;

public class SavrseniBroj {

	public static void main(String[] args) {

		int min = 0;
		System.out.println("Savrseni brojevi od 1 - 10000 su: ");

		// Loop for checking all numbers from 1 to 10000
		for (int broj = 1; broj <= 10000; broj++) {

			// Loop for calculating perfect number
			for (int j = 1; j < broj; j++) {
				if (broj % j == 0) {

					min += j;
				}
			}
			// When sum of numbers fractals plus one is equal to the number,
			// number is perfect
			if (min == broj) {
				System.out.println(broj);
			}
			min = 0;

		}

	}

}
