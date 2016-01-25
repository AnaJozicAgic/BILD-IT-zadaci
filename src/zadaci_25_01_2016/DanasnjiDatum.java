package zadaci_25_01_2016;

import java.util.Date;

public class DanasnjiDatum {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// getting current time in milliseconds
		long trenutnoVrijeme = System.currentTimeMillis();

		// Creating new Date class object
		Date danas = new Date(trenutnoVrijeme);

		// String array to store month name
		String[] monthName = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		// Getting date of the month
		int datum = danas.getDate();
		// Getting month
		int mjesec = danas.getMonth();
		// Getting year
		int godina = danas.getYear();
		godina += 1900;
		// Getting hour's
		int sati = danas.getHours();
		// Getting minutes
		int minuta = danas.getMinutes();
		// Getting seconds
		int sekunda = danas.getSeconds();
		// Output for the user
		System.out.println(datum + "." + monthName[mjesec] + "," + godina + " " + sati + ":" + minuta + ":" + sekunda);
	}

}
