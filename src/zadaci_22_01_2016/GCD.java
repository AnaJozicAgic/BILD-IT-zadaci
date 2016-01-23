package zadaci_22_01_2016;

public class GCD {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// Exception handling
		try {

			// Entering positions longitude and latitude by user
			System.out.println("unesite sirinu 1. tacke u stepenima : ");

			// converting entered value to radiant by invoking MathToRadians
			// method
			double x1 = Math.toRadians(input.nextDouble());
			System.out.println("unesite duzinu 1. tacke u stepenima: ");
			double y1 = Math.toRadians(input.nextDouble());
			System.out.println("unesite sirinu 2. tacke u stepenima : ");
			double x2 = Math.toRadians(input.nextDouble());
			System.out.println("unesite duzinu 2. tacke u stepenima: ");
			double y2 = Math.toRadians(input.nextDouble());

			// Calculating GCD by applying formula
			double d = 6.37101f
					* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
			d *= 1000;// Multiplying by 1000 so the length would be in
						// kilometers

			System.out.println(d);// Displaying length to the user
		} catch (java.util.InputMismatchException e) {
			System.out.println("Pogresan unos ");

		}
		input.close();
	}

}
