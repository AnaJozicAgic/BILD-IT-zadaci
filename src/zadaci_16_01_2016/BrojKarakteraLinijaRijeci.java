package zadaci_16_01_2016;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BrojKarakteraLinijaRijeci {

	// Method for counting characters in a file
	public static void prebrojiKaraktere(String nazivFilea) throws FileNotFoundException {

		// Finding a file
		java.io.File file = new java.io.File(nazivFilea);
		// Scanner for reading a file
		Scanner citaj = new Scanner(file);
		// Sum and counter; counter for counting a characters in a string, and a
		// sum to ad counters
		int suma = 0;
		int brojac = 0;

		// Try-Catch block to handle the Exceptions
		try {
			while (citaj.hasNext()) {
				String tekst = citaj.next();

				brojac = tekst.length();
				if (brojac > 0) {
					suma += brojac;

				}

			}
			// Scanner close
			citaj.close();
			// Output for the User, the number of characters in a File
			System.out.println(" Broj karaktera u Fileu je: " + suma);

		} catch (Exception e) {
			System.out.println(" File nije pronadjen ");

		}

	}

	// Method for counting Strings in a file
	public static void prebrojiStringove(String nazivFilea) throws NoSuchElementException {

		// Finding a file
		java.io.File file = new java.io.File(nazivFilea);
		int brojac = 0;

		Scanner citaj;

		try {
			citaj = new Scanner(file);

			// A loop that find's the Strings and count's them
			while (citaj.hasNextLine()) {
				String tekst = citaj.next();

				if (tekst.length() > 0) {
					brojac++;
				}

			}
			citaj.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.out.println(" Nije pronadjen takav element ");
		} finally {
			System.out.println(" Broj stringova u Fileu je: " + brojac);
		}

	}

	// A method for Line counting
	public static void brojLinija(String nazivFilea) throws FileNotFoundException {

		// Finding a file
		java.io.File file = new java.io.File(nazivFilea);

		java.io.LineNumberReader linije = new java.io.LineNumberReader(new FileReader(file));
		String linija = null;

		// A loop that increases a line number while a line has any String
		try {

			while ((linija = linije.readLine()) != null) {
				linije.getLineNumber();
			}

			// Print's the number of lines to the User;
			System.out.println(" Broj linija u Fileu je: " + linije.getLineNumber());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Prompting the User to enter the file name
		System.out.println(" Unesite ime filea: ");
		String naziv = input.nextLine();
		
		// Try-catch block for invoking methods and handling Exception if File
		// not found
		try {

			prebrojiKaraktere(naziv);
			prebrojiStringove(naziv);
			brojLinija(naziv);
		} catch (FileNotFoundException e) {
			System.out.println("Na zalost File nije pronadjen.");
		}
		input.close();
	}

}
