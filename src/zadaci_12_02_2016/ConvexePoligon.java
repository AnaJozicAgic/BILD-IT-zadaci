package zadaci_12_02_2016;

public class ConvexePoligon {

	public static void main(String[] args) {

		try {
			// prompting user to enter number of points
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite broj tacaka na poligonu: ");
			int tacke = input.nextInt();
			// prompting user to enter coordinates
			System.out.println("Unesite koordinate tacaka: ");
			double[] xKoordinate = new double[tacke];
			double[] yKoordinate = new double[tacke];
			// Storing coordinates to the array
			int brojac = 0;
			while (brojac < tacke) {
				xKoordinate[brojac] = input.nextDouble();
				yKoordinate[brojac] = input.nextDouble();
				brojac++;
			}
			// area position
			int j = 1;
			// variable to calculate area
			double test = 0;
			// loop to calculate area
			while (j < tacke) {
				double a = ((xKoordinate[j - 1] * yKoordinate[j]));
				double b = ((yKoordinate[j - 1] * xKoordinate[j]));
				test = test + (a - b);

				j++;
			}

			// printing area to the user
			double area = Math.abs(test / 2);
			System.out.println(area);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}
	}

}
