package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Capteri {

	public static void main(String[] args) throws FileNotFoundException {

		//potential exception handling
		try {
			//Asking user to enter Statement
			Scanner input = new Scanner(System.in);
			System.out.println("Unesite izjavu: ");
			String izjava = input.nextLine();

			//Creating new files and writing in them
			for (int i = 0; i < 10; i++) {
				File file = new File("chapter" + i + ".txt");
				PrintWriter upisi = new PrintWriter(file);
				upisi.println("content");
				upisi.close();
			}

			//reading files and writing statement at first line
			String procitano = null;
			String zaPisanje = null;
			for (int i = 0; i < 10; i++) {
				File file = new File("chapter" + i + ".txt");
				Scanner citaj = new Scanner(file);
				while (citaj.hasNextLine()) {
					procitano = citaj.nextLine();

				}
				zaPisanje = izjava + "\n" + procitano;

				citaj.close();

				PrintWriter upisi = new PrintWriter(file);
				upisi.println(zaPisanje);
				upisi.close();
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
