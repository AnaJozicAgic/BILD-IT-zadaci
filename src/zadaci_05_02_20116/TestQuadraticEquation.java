package zadaci_05_02_20116;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		try {
			// prompting user to enter values for calculating the equations
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite vrijednosti za a, b i c");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			// creating QuadraticEquation class object for calculating
			QuadraticEquation test = new QuadraticEquation(a, b, c);

			// when conditions are met the masage is printed
			if (test.getDiscriminant() > 0) {
				System.out.println("Root 1= " + test.getRoot1() + "\nRoot 2= " + test.getRoot2());
			} else if (test.getDiscriminant() == 0) {
				System.out.println("Root 1= " + test.getRoot1());
			} else {
				System.out.println("The equation has no roots.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}

}
