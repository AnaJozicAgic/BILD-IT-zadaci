package zadaci_05_02_20116;

public class TestLinearEquation {

	public static void main(String[] args) {
		try {

			// prompting user to enter values for the equation
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite vrijednosti za a,b,c,d,e,f : ");
			// creating new equation object with desired values
			LinearEquation jednacina = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(),
					input.nextDouble(), input.nextDouble(), input.nextDouble());
			// if is solvable print result to the user otherwise print message
			// that equation is not solvable
			if (jednacina.isSolvable()) {
				System.out.println("X = " + jednacina.getX() + " i Y =" + jednacina.getY());
			} else {
				System.out.println("Jednacina nije rjesiva.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}

}
