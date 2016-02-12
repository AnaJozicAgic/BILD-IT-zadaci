package zadaci_12_02_2016;

import java.util.InputMismatchException;

public class Mismach {

	public static void main(String[] args) throws InputMismatchException {
		// handling Exception
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// prompting user to enter values to be processed
			System.out.println("Unesite dva cijela broja : ");
			int prvi = input.nextInt();
			int drugi = input.nextInt();
			// calculating and printing sum
			System.out.println("Suma dva unesena broja  = " + prvi + drugi);
			input.close();
		} catch (InputMismatchException e) {
			// re enabling user to enter corest values
			System.out.println("Nacinili ste pogresan unos, pokusajte ponovo: ");
			main(args);
		}

	}

}
