package zadaci_19_01_2016;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Stednja {

	public static void main(String[] args) throws InputMismatchException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Block for Exception handling
		try {
			// Taking values to be processed from the user
			System.out.println("Unesite iznos stednje: ");
			double iznos = input.nextInt();
			System.out.println("Unesite broj mjeseci nakon kojeg zelite vidjeti stanje vaseg racuna: ");
			int mjeseci = input.nextInt();

			// Calculating interest rate
			double stopa = (iznos * 5) / 100;
			stopa = stopa / 100;
			stopa = (stopa / 12) + 1;

			// ArrayList for storing amounts of saving after being incremented
			ArrayList<Double> mjesecnaStednja = new ArrayList<>();
			
			// calculation for the first month
			double prviMjesec = iznos * stopa;

			// Format for rounding decimal number
			DecimalFormat df = new DecimalFormat("#.###");

			mjesecnaStednja.add(prviMjesec);// adding amount after first month
											// of saving
			
			// Loop for calculating and saving amounts after entered number of
			// months
			for (int i = 0; i < mjeseci; i++) {
				double svakiSlijedeciMjesec = (iznos + mjesecnaStednja.get(i).doubleValue()) * stopa;

				mjesecnaStednja.add(svakiSlijedeciMjesec);
			}
			
			// Output for the user
			System.out.println(df.format(mjesecnaStednja.get(mjeseci - 1).doubleValue()) + " ");
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}

		input.close();
	}

}
