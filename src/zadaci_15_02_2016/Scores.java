package zadaci_15_02_2016;

import java.io.FileNotFoundException;

public class Scores {

	public static void readRezults(String naziv) {
		// finding file
		java.io.File file = new java.io.File(naziv);
		// handling potential exceptions
		try {
			// file scanner
			java.util.Scanner read = new java.util.Scanner(file);
			// variable to store sum
			int sum = 0;
			// variable to count scores
			int brojac = 0;
			// loop to read, count and sum scores
			while (read.hasNextInt()) {
				int score = read.nextInt();
				System.out.print(score + " ");
				brojac++;
				sum += score;
			}
			// calculate average
			int prosjek = sum / brojac;
			// message for the user
			System.out.println();
			System.out.println("Suma rezultata = " + sum + "\nUkupan broj rezultata = " + brojac
					+ "\nProsjek rezultata = " + prosjek);
			// scanner close
			read.close();

		} catch (FileNotFoundException e) {
			System.out.println("Doslo je do greske.");
		}

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// prompting user to enter file name
		System.out.println("Unesite naziv filea i kojem se nalaze rezultati ( npr : retzltati.txt) :");
		String naziv = input.next();
		// invoking method for file reading
		readRezults(naziv);
		input.close();
	}

}
