package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrebrojavanjeOdredjenihKarakteraUFajlu {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			// prompting user to enter file name
			System.out.println("Unesite naziv fajla (npr : Abraham.txt ) : ");
			Scanner input = new Scanner(System.in);
			String naslov = input.next();

			// searching for file
			File file = new File(naslov);
			// Scanner for reading the file
			Scanner scan = new Scanner(file);
			String read = null;
			String add = null;
			// Loop for reading the file and adding its text to a single string
			while (scan.hasNext()) {
				read = scan.next();
				add += read;
			}

			add.toLowerCase();
			// char array for counting characters a-z
			char[] charcount = new char[add.length() + 1];
			// loop to count characters
			for (char z : add.toCharArray()) {
				charcount[z]++;

			}
			// Loop for printing counter array
			for (char i = 'a'; i <= 'z'; i++) {
				System.out.println(i + " = " + (int) (charcount[i]));
			}
			// closing resources
			scan.close();
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
