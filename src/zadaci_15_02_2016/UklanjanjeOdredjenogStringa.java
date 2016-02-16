package zadaci_15_02_2016;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UklanjanjeOdredjenogStringa {

	public static void brisanjeOdredjenogStringa(String filename, String ukloni) {
		// method for deleting string from file

		// finding file
		java.io.File file = new File(filename);
		try {
			// variable to store file content
			String procitano = null;
			// variable to store file content after deleting desired string
			String s = null;
			// scanner for reading the file
			Scanner read = new Scanner(file);
			// Loop for reading file
			while (read.hasNext()) {
				procitano = read.nextLine();
			}
			// removing desired string
			s = procitano.replace(ukloni, "");
			// printing new content to the user
			System.out.println(s);
			// closing reading scanner
			read.close();
			// new print writer for writing in the file
			java.io.PrintWriter pisanje = new java.io.PrintWriter(file);
			// writing in the file
			pisanje.print(s);
			// closing print writer
			pisanje.close();
		} catch (FileNotFoundException e) {
			System.out.println("Trazeni file nije pronadjen.");
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		// creating new file
		java.io.File file = new File("Strpljenje.txt");
		// Prompting user to enter file content
		System.out.println("Unesite vas text: ");
		String tekst = input.nextLine();
		// printing content to the file
		java.io.PrintWriter pisanje = new java.io.PrintWriter(file);
		// handling potential input exceptions
		try {
			pisanje.println(tekst);
		} catch (Exception e) {
			System.out.println("pisanje nije uspjelo.");
		} finally {
			// closing print writer
			pisanje.close();
		}
		// prompting user to enter content, user wants to be removed from the
		// file
		System.out.println("Unesite rijec koju zelite ukloniti :");
		String rijec = input.next();
		// invoking method for deleting desired string
		brisanjeOdredjenogStringa("Strpljenje.txt", rijec);

		input.close();
	}

}
