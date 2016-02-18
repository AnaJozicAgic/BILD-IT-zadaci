package zadaci_17_02_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class WebLargeDataset {

	public static void main(String[] args) throws IOException {
		// List to store Assistant salary's
		ArrayList<Double> listaAssistent = new ArrayList<>();
		// List to store Associate salary's
		ArrayList<Double> listaAssociate = new ArrayList<>();
		// List to store Full professor salary's
		ArrayList<Double> listaFull = new ArrayList<>();
		try {
			// Strings to store individual references

			String zarada = null;
			String name = null;
			String lastName = null;
			String rank = null;
			// Url object for fille location
			URL a = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			// scanner for reading the file
			Scanner scan = new Scanner(a.openStream());
			// Loop for reading the file
			while (scan.hasNext()) {
				name = scan.next();
				lastName = scan.next();
				rank = scan.next();
				zarada = scan.next();
				// When the conditions are met lists are filled
				if (rank.equals("assistant")) {
					double asistent = Double.parseDouble(zarada);
					listaAssistent.add(asistent);
				} else if (rank.equals("associate")) {
					double asociate = Double.parseDouble(zarada);
					listaAssociate.add(asociate);
				} else if (rank.equals("full")) {
					double full = Double.parseDouble(zarada);
					listaFull.add(full);
				}

			}
			// Loops for summing incomes for every rank
			double sumaAssistent = 0;
			for (int i = 0; i < listaAssistent.size(); i++) {
				sumaAssistent += listaAssistent.get(i).doubleValue();
			}
			double sumaAssociate = 0;
			for (int i = 0; i < listaAssociate.size(); i++) {
				sumaAssociate += listaAssociate.get(i).doubleValue();
			}
			double sumaFull = 0;
			for (int i = 0; i < listaFull.size(); i++) {
				sumaFull += listaFull.get(i).doubleValue();
			}

			// just for appearance
			DecimalFormat z = new DecimalFormat("#.##");

			// printing calculations for the user
			System.out.println("Ukupna zarada svih asistenata = " + z.format(sumaAssistent)
					+ "\nProsjecna zarada asistenta = " + z.format(sumaAssistent / listaAssistent.size()));
			System.out.println();
			System.out.println("Ukupna zarada svih saradnika = " + z.format(sumaAssociate)
					+ "\nProsjecna zarada saradnika = " + z.format(sumaAssociate / listaAssociate.size()));
			System.out.println();
			System.out.println("Ukupna zarada svih profesora = " + z.format(sumaFull)
					+ "\nProsjecna zarada profesora = " + z.format(sumaFull / listaFull.size()));
			System.out.println();
			double ukupnaZarada = (sumaAssistent + sumaAssociate + sumaFull);
			double ukupnoZaposlenika = (listaAssistent.size() + listaAssociate.size() + listaFull.size());
			double prosjek = ukupnaZarada / ukupnoZaposlenika;

			System.out.println("Ukupna zarada svih zaposlenika = " + z.format(ukupnaZarada)
					+ "\nProsjecna zarada svih zaposlenika = " + prosjek);
			scan.close();
		} catch (MalformedURLException e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
