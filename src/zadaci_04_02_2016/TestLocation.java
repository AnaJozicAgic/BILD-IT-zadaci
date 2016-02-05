package zadaci_04_02_2016;

public class TestLocation {

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// user enters array dimensions
			System.out.println("Unesite broj redova i kolona u nizu ");
			double[][] niz = new double[input.nextInt()][input.nextInt()];
			// user enters values to the array
			System.out.println("Unesite vrijednosti u niz " + niz.length + "x" + niz[0].length + " : ");
			// loop to store values
			for (int i = 0; i < niz.length; i++) {
				for (int j = 0; j < niz[i].length; j++) {
					niz[i][j] = input.nextDouble();
				}
			}
			// initializing new object
			Location s = new Location();
			// getting static method return
			s = Location.locateLargest(niz);
			// printing values to the user
			System.out.println(
					"Lokacija najvece vrijednosti " + s.maxValue + " je " + "( " + s.row + ", " + s.column + " )");
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske: ");
			main(args);
		}
	}

}
