package zadaci_17_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DjecijaImena {

	public static void main(String[] args) {
		// prompting user to enter a year,
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite godinu 2005-2014");

		int yob = input.nextInt();
		// ...gender
		System.out.println("Unesite spol: ");
		String spol1 = input.next();
		// ...name
		System.out.println("Unesite ime: ");
		String ime1 = input.next();

		// creating txt file name, to ad to the directory path
		String name = "yob" + yob + ".txt";
		// example
		// "D:/Arhive/Ana_Java/names/"
		// enter path
		System.out.println("Unesite odrediste vasih fileova : ");
		String adresa = input.next();
		adresa = adresa + name;
		// File object to find the file
		File file = new File(adresa);
		String t = null;// variable to read
		String scanTxt = null;// variable to store to the array list
		ArrayList<String> niz = new ArrayList<>();
		// handle potential exceptions
		try {
			// file scanner
			Scanner scan = new Scanner(file);
			// loop for reading The file, replacing commas with white space and
			// adding lines to the arrayList
			while (scan.hasNextLine()) {
				scanTxt = scan.nextLine();
				t = scanTxt.replace(',', ' ');
				niz.add(t);

			}
			// closing file scanner
			scan.close();
			// Loop for checking Array list if desired name is contained
			// and printing replay if it is..
			for (int i = 0; i < niz.size(); i++) {
				if (niz.get(i).contains(ime1) && niz.get(i).contains(spol1)) {
					String rank = niz.get(i).toString().substring(ime1.length() + spol1.length() + 2,
							niz.get(i).length());
					System.out.print(rank + " djece nosilo je to ime ");
					break;

				}

			}

			System.out.println();
			input.close();

		} catch (FileNotFoundException e) {

			System.out.println("Uneseni argumenti nisu pronadjeni .");
			main(args);
		}

	}

}
