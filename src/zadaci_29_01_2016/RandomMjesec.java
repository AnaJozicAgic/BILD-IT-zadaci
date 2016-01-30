package zadaci_29_01_2016;

public class RandomMjesec {

	public static void main(String[] args) {
		int mjesec = 1 + (int) (Math.random() * 12);// Random position
		// String array of month names
		String[] nazivMjeseca = { "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };

		// Output of random month
		System.out.println("Mjesec je " + nazivMjeseca[mjesec - 1]);
	}

}
