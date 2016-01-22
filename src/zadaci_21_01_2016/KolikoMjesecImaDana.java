package zadaci_21_01_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

public class KolikoMjesecImaDana {

	public static void main(String[] args) throws InputMismatchException{
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Block for exception handling
		try {
			System.out.println("Umesite mjesec i godinu: ");
			int mjesec=input.nextInt();//Variable that stores the month
			int godina=input.nextInt();//Variable for storing the year
			
			//Loop that provides reentering month value if entered incorrectly
			while(mjesec>12){
				System.out.println("Unijeli ste prevelik broj za mjesec, pokusajte ponovo:");
				mjesec=input.nextInt();
			}
			

			//Array with number of days per month

			int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			// Object to get month
			Calendar cal = new GregorianCalendar(godina, mjesec, 1);

			// Following calculates if the current year is leap year
			if (godina % 100 == 0) {
				if (godina % 400 == 0) {
					calDays[1] = 29;
				}
			} else if (godina % 4 == 0) {
				calDays[1] = 29;
			}
//Output to the user
System.out.println(mjesec + " mjesec "+godina+" godine ima "+calDays[mjesec-1]);
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
			e.printStackTrace();
		}

	input.close();	


	}

}
