package zadaci_08_02_2016;

import java.math.BigDecimal;


public class KvadratniBrojevi {

	public static void main(String[] args) {
		// Counter
		int brojac = 0;

		// start for comparing
		BigDecimal b = new BigDecimal(Long.MAX_VALUE);
		// Square root of start for comparing
		long start = (long) Math.sqrt(Long.MAX_VALUE);
		// new big decimal to store square root
		BigDecimal c = new BigDecimal(start);

		// Loop for printing first ten square numbers
		while (brojac < 10) {

			// square number is root number multiply by it self
			BigDecimal a = c.multiply(c);
			// if square number compared to a start for comparing is bigger The
			// number is printed and counted
			if (a.compareTo(b) > 0) {

				System.out.println(brojac + " : " + c + "^2 = " + a);
				brojac++;
			}
			//increase c value by one
			c = c.add(BigDecimal.ONE);

		}

	}

}
