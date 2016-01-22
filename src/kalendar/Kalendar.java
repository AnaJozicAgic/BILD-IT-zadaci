package kalendar;

import java.util.Scanner;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalendar {
	// Method for writing reminders
	public static void reminderWriter(String fileName) throws Exception {

		java.io.File file = new java.io.File(fileName);// File object for
														// reeding and writing
		Scanner input = new Scanner(System.in);
		String novi = "";// Declaring new String variable to store reminder
							// already written
		// Exception handling block for reeding the file
		try {
			Scanner reed = new Scanner(file);// Scanner object for reeding the
												// file

			// If conditions are met, invoking the method for reading file
			// content and storing file content in the new string
			if (reed.hasNextLine()) {
				System.out.println("Na uneseni dan vec imate reminder ");
				reminderReader(fileName);

				System.out.println("Za dodavanje novog  ");
				while (reed.hasNextLine()) {
					novi = reed.nextLine();
				}
				reed.close();
			}
		} catch (Exception x) {
			System.out.println("_");
		}

		// Exception handling block for writing reminders to the file
		try {
			System.out.println("Unesite vas reminder: ");
			String reminder = input.nextLine();// String for storing new
												// reminder from the user

			// PrintWriter object for writing reminder to the file
			java.io.PrintWriter unos = new java.io.PrintWriter(file);

			unos.println(novi + "; -" + reminder);// Writing to the file

			unos.close();

		} catch (Exception e) {
			System.out.println("Greska3");
		}
		// input.close();
	}

	// Method for reeding the file
	public static void reminderReader(String fileName) throws IOException {

		java.io.File file = new java.io.File(fileName);

		// Exception handling block
		try {
			Scanner input = new Scanner(file);// Scanner object for reeding the
												// file
			// Loop for reeding the file
			while (input.hasNextLine()) {
				String reminder = input.nextLine();

				System.out.println(reminder + "\n");// Outputting the reminder
													// to
													// the user

			}

			input.close();
		} catch (Exception e) {
			System.out.println("Za trazeni datum nemate reminder");
		}

	}

	// Method for printing the calendar
	public static void printCalendar(int year, int month) {

		// Declare variables
		int dayOfWeek = 1;
		String space = "     ";

		// Creating array with number of days per month
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// object to get month
		Calendar cal = new GregorianCalendar(year, month, 1);

		// Following calculates if the current year is leap year
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				calDays[1] = 29;
			}
		} else if (year % 4 == 0) {
			calDays[1] = 29;
		}

		// Print out top of calendar
		System.out.println("\t" + monthName[month] + " " + year);
		System.out.println("----------------------------------------");
		System.out.println("Son   Mon   Tos   Wen   Thu   Fri   Sat\n");
		System.out.println("----------------------------------------");

		// Following loop will find out where to print the first day of the
		// month
		// dayCounter represents current day of the month and dayOfWeek
		// represents the day of the
		// week where 1 is Sunday
		for (int dayCounter = 1; dayCounter <= calDays[month]; dayCounter++) {
			if (dayCounter > 9) {

				// This controls the printing of the spaces between the days so
				// it's pretty
				space = "    ";
			}

			// This if will find out print out spaces until the day the first of
			// the
			// month falls on
			if (dayCounter == 1) {
				while (dayOfWeek != cal.get(Calendar.DAY_OF_WEEK)) {
					System.out.print(space + " ");
					dayOfWeek++;
				}

				// Now we have found the right place to print the first day of
				// the month
				System.out.print(dayCounter + space);
				dayOfWeek++;
			} else {

				// This checks to see if we are at the end of the row.
				if (dayOfWeek == 8) {

					// Print a newline and start on the next row and set the day
					// to 2
					// since we just printed the first position
					System.out.print("\n" + dayCounter + space);
					dayOfWeek = 2;
				} else {

					// this prints out the current day number and increments j
					System.out.print(dayCounter + space);
					dayOfWeek++;
				}
			}
		}

	}

	// Method for checking what user wants to do
	public static void provjera(int provjera, int year, int month) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Exception handling block
		try {

			// Array of days in the month
			int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			// object to get month
			Calendar cal = new GregorianCalendar(year, month, 1);

			// Following calculates if the current year is leap year
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					calDays[1] = 29;
				}
			} else if (year % 4 == 0) {
				calDays[1] = 29;
			}

			// String for creating, and reading files
			String fileName = ".txt";
			fileName = month + "" + year + fileName;

			// If first condition is met, this provides reading the file
			if (provjera == 1) {
				System.out.println("Unesite dan za koji zelite vidjeti reminder: ");
				int dan = input.nextInt();// This variable stores day of the
											// month user wants to enter
											// reminder for

				while (dan > calDays[month]) {
					System.out.println("unijeli ste prevelik broj ");
					dan = input.nextInt();
				} // Loop to provide opportunity to the user, if entered number
					// is larger of the number of days in the month, to re enter
					// the desired day

				String fileName1 = dan + fileName;// Creating new string for
													// file name to see if there
													// are reminders set for
													// this day

				// Invoking the method for reading the file
				reminderReader(fileName1);

				// Providing the user the opportunity to continue managing the
				// calendar
				System.out.println();
				System.out.println("1 unesite da bi ste vidjeli reminder na odredjeni datum.");
				System.out.println("2 unesite da bi unijeli reminder na odredjeni dan.");
				System.out.println("3 unesite za pregled kalendara za neki drugi mjesec.");
				System.out.println("4 unesite da bi ste izasli iz programa.");
				provjera = input.nextInt();
				provjera(provjera, year, month);// invoking method to return to
												// the choices

			} else if (provjera == 2) {

				// Prompting the user to enter the day to enter reminder for
				System.out.println("Unesite dan za koji zelite unijeti reminder: ");
				int dan2 = input.nextInt();// Variable to store the date value

				// Loop to provide opportunity to the user, if entered number
				// is larger of the number of days in the month, to re enter
				// the desired day
				while (dan2 > calDays[month]) {
					System.out.println("unijeli ste prevelik broj ");
					dan2 = input.nextInt();
				}

				System.out.println();
				String fileName2 = dan2 + fileName;// Creating new string for
				// file name to write reminders for this day

				reminderWriter(fileName2);// Invoking the method for writing

				// Providing the user the opportunity to continue managing the
				// calendar
				System.out.println();
				System.out.println("1 unesite da bi ste vidjeli reminder na odredjeni datum.");
				System.out.println("2 unesite da bi unijeli reminder na odredjeni dan.");
				System.out.println("3 unesite za pregled kalendara za neki drugi mjesec.");
				System.out.println("4 unesite da bi ste izasli iz programa.");
				provjera = input.nextInt();
				provjera(provjera, year, month);// invoking method to return to
												// the choices

			} else if (provjera == 3) {

				// In this check user can enter new parameters for year and the
				// month
				System.out.println("Unesite mjesec i godinu za koju zelite vidjeti kalendar");

				month = input.nextInt() - 1;// Variable for entering the new
											// month for calendar display

				// Loop for providing opportunity for the user to reenter month
				// value if user made error
				while (month > 12) {
					System.out.println("Unijeli ste prevelik broj, mjeseci ima samo 12,\n pokusajte ponovo");
					month = input.nextInt() - 1;
				}

				year = input.nextInt();
				printCalendar(year, month);// Invoking method for printing
											// calendar

				// Providing the user the opportunity to continue managing the
				// calendar
				System.out.println("1 unesite da bi ste vidjeli reminder na odredjeni datum.");
				System.out.println("2 unesite da bi unijeli reminder na odredjeni dan.");
				System.out.println("3 unesite za pregled kalendara za neki drugi mjesec.");
				System.out.println("4 unesite da bi ste izasli iz programa.");
				provjera = input.nextInt();
				provjera(provjera, year, month);

			} else if (provjera == 4) {
				System.exit(1);// When conditions are met this terminates the
								// program
			}
		} catch (Exception e) {
			System.out.println("Greska5");
		}
		input.close();
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println(" Unesite godinu i mjesec u godini");

		// Assign starting values
		int year = input.nextInt();
		int month = input.nextInt() - 1;
		while (month > 12) {
			System.out.println("Unijeli ste prevelik broj, mjeseci ima samo 12,\n pokusajte ponovo");
			month = input.nextInt() - 1;
		}
		// Call method to print the month for the values
		printCalendar(year, month);
		System.out.println();
		System.out.println();

		// Providing the user the opportunity to continue managing the calendar
		System.out.println("1 unesite da bi ste vidjeli reminder na odredjeni datum.");
		System.out.println("2 unesite da bi unijeli reminder na odredjeni dan.");
		System.out.println("3 unesite za pregled kalendara za neki drugi mjesec.");
		System.out.println("4 unesite da bi ste izasli iz programa.");
		int provjera = input.nextInt();

		provjera(provjera, year, month);// Invoking the method to continue
										// calendar manipulation

		// This puts some space after the calendar is printed.
		System.out.println("\n");
		input.close();
	}
}
