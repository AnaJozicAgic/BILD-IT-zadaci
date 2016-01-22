package zadaci_21_01_2016;

import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;

public class MjesecVelikimSlovom {

	// Method for calculating number of days for entered month of entered year
	public static void metoda() {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Exception handling block
		try {

			// Prompting user to enter values
			System.out.println("Umesite prva tri slova naziva mjeseca,\nprvo slovo mora biti veliko, i godinu: ");
			String mjesec = input.nextLine();
			int godina = input.nextInt();
			InputMismatchException greska = new InputMismatchException(mjesec);

			// String array for comparing month name entered
			String[] monthName = { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "August", "Septembar",
					"Oktobar", "Novembar", "Decembar" };

			// Loop for Throwing exception if parameters are met

			while (Character.isLowerCase(mjesec.charAt(0)) || Character.isUpperCase(mjesec.charAt(1))
					|| Character.isUpperCase(mjesec.charAt(2)) || mjesec.length() > 3 || godina <= 0) {

				throw greska;
			}

			// Loop for finding month position in a monthName array
			int month = 13;
			for (int i = 0; i < monthName.length; i++) {
				if (mjesec.substring(0, 2).equals(monthName[i].substring(0, 2))) {
					month = i;
				}
			}

			// Array for storing the days in the month
			int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			// Object to get month
			Calendar cal = new GregorianCalendar(godina, month, 1);

			// Following calculates if the current year is leap year
			if (godina % 100 == 0) {
				if (godina % 400 == 0) {
					calDays[1] = 29;
				}
			} else if (godina % 4 == 0) {
				calDays[1] = 29;
			}
			System.out.println(monthName[month] + " " + godina + ". godine ima " + calDays[month] + " dana");
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
			metoda();
		}

	}

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Exception handling block
		try {

			metoda();
		} catch (Exception e) {
			System.out.println("Doslo je do greske unosa,\n godina mora biti broj");
			metoda();
		} finally {
			System.out.println("Hvala sto koristite kalendar.");// When all
																// parameters
																// are met and
																// program ends
		}
		input.close();
	}

}
