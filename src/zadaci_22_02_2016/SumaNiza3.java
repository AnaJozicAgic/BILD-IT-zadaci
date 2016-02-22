package zadaci_22_02_2016;

public class SumaNiza3 {

	public static double sum;

	public static double m(double i) {
		// Method for calculating sum of series
		if (i == 1) {
			return sum + i / (i + 1);
		} else {
			sum += i / (i + 1);
			i--;
			return m(i);
		}

	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// prompting user to enter the end of the series
			System.out.println("Unesit kraj niza");
			int i = input.nextInt();
			// Printing sum of series
			System.out.println(m(i));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}

}
