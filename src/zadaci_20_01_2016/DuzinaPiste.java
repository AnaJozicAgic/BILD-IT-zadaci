package zadaci_20_01_2016;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class DuzinaPiste {

	public static void main(String[] args) throws InputMismatchException{
		
		java.util.Scanner input= new java.util.Scanner(System.in);
		//Handling exceptions
		try {
			//Prompting user to enter values to be processed
			System.out.println("Unesite brzinu aviona u m/s");
			double brzinaAviona=input.nextDouble();//Variable to store speed
			
			System.out.println("Unesite ubrzanje i m/s2");
			double ubrzanje= input.nextDouble();//Variable to store acceleration
			
			double duzinaPiste=(brzinaAviona*brzinaAviona)/(2*ubrzanje);//Calculation for minimum road length  
			
			DecimalFormat df = new DecimalFormat("#.###");//Object for three decimal output
			
			//Output to the user
			System.out.println("Minimalna duzina piste koja je potrebna \n"
					+ "da avion poleti je: " + df.format(duzinaPiste)+" m");
		} catch (Exception e) {
		System.out.println("Doslo je do greske");
		}
		
		
		
input.close();
	}

}
