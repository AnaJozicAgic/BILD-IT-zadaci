package zadaci_16_02_2016;

import java.net.URL;

public class ScoresFromTheWeb {
	public static void readRezults(URL naziv) {

		// handling potential exceptions
		try {
			// file scanner
			java.util.Scanner read = new java.util.Scanner(naziv.openStream());
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

		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

	public static void main(String[] args) {
		// Exception handling
		try {
			// declaring new Url
			URL naziv = new URL(" http://cs.armstrong.edu/liang/data/Scores.txt ");
			// invoke method
			readRezults(naziv);
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
