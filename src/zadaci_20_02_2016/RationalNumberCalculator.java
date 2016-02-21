package zadaci_20_02_2016;

public class RationalNumberCalculator {
	public static void main(String[] args) {
		try {
			// Prompting user to enter values to be processed
			java.util.Scanner input = new java.util.Scanner(System.in);

			System.out.println("Unesite operanta, operaciju i drugog operanta.");

			String operand1 = input.next();
			String operator = input.next();
			String operand2 = input.next();
			// Creating rational objects to perform operations
			Rational r = new Rational();
			Rational r2 = new Rational();
			// If entered values are fractions two rational objects are used
			if (operand1.length() > 1 || operand2.length() > 1) {

				r.setNumerator(Long.parseLong(operand1.split("/")[0]));
				r.setDenominator(Long.parseLong(operand1.split("/")[1]));
				r2.setNumerator(Long.parseLong(operand2.split("/")[0]));
				r2.setDenominator(Long.parseLong(operand2.split("/")[1]));

				if (operator.equalsIgnoreCase("+")) {
					System.out.println(r.doubleValue() + r2.doubleValue());
				} else if (operator.equalsIgnoreCase("-")) {
					System.out.println(r.doubleValue() - r2.doubleValue());
				} else if (operator.equalsIgnoreCase("/")) {
					System.out.println(r.doubleValue() / r2.doubleValue());
				} else if (operator.equalsIgnoreCase("*")) {
					System.out.println(r.doubleValue() * r2.doubleValue());
				}

			} else {
				// if integers are entered only one rational's numerator and
				// denominator are used to perform operations
				r.setNumerator(Long.parseLong(operand1));
				r.setDenominator(Long.parseLong(operand2));
				if (operator.equalsIgnoreCase("+")) {
					System.out.println(r.getNumerator() + r.getDenominator());
				} else if (operator.equalsIgnoreCase("-")) {
					System.out.println(r.getNumerator() - r.getDenominator());
				} else if (operator.equalsIgnoreCase("/")) {
					System.out.println(r.getNumerator() / r.getDenominator());
				} else if (operator.equalsIgnoreCase("*")) {
					System.out.println(r.getNumerator() * r.getDenominator());
				}

			}
			input.close();
		} catch (NumberFormatException e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}
}
