package zadaci_18_02_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalendar {

	public static void printCalendar(int year, int month) {
		// if month entered is not a correct value, month is a current month
		if (month < 0 || month > 11) {
			month = Calendar.MONTH - 1;
		}
		// if year entered is not a correct value,Year is a current Year
		if (year <= 0) {
			year = 2016;
		}

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

	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter year
		System.out.print("Enter full year (e.g., 2012): ");
		int year = input.nextInt();

		// Prompt the user to enter month
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt() - 1;

		// Print calendar for the month of the year
		printCalendar(year, month);
		input.close();
	}

}
