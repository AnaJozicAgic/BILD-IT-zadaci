package zadaci_30_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatumITacnoVrijeme {

	public static Date tacnoVrijeme(long millis) {
		// Method to create Date for time argument
		Date date = new Date(millis);
		return date;
	}

	public static void main(String[] args) {

		long millis = System.currentTimeMillis();// Current time

		// Date format for output
		DateFormat dateFormat = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		// Message for the user
		System.out.println("Danas je: " + dateFormat.format(tacnoVrijeme(millis)));
	}

}
