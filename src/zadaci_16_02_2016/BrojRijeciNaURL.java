package zadaci_16_02_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class BrojRijeciNaURL {

	public static void main(String[] args) throws IOException {
		// Prompting user to enter URL
		System.out.println("Unesite URL za iscitavanje\n(npr :  https://wordpress.org/plugins/about/readme.txt) ");
		Scanner unos = new Scanner(System.in);
		String adresa = unos.nextLine();
		// exception handling block
		try {
			// creating new URL object
			URL url = new URL(adresa);

			// reading content at URL and counting words
			Scanner in = new Scanner(url.openStream());
			String t = null;
			int brojac = 0;
			while (in.hasNext()) {
				t = in.next();
				brojac++;
				System.out.println(t);
			}

			// message for the user
			System.out.println("U textu ima " + brojac + " rijeci.");
			in.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}

		unos.close();
	}

}
