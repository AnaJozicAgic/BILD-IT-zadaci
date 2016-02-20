package zadaci_19_02_2016;

public class TestOctagon {

	public static void main(String[] args) {
		// Object for cloning and comparing
		Octagon a = new Octagon(5);
		// Larger object for comparing with
		Octagon c = new Octagon(7);
		// Smaller object for comparing with
		Octagon d = new Octagon(3);
		try {
			// clone object
			Octagon b = a.clone();
			// Printing method returns
			System.out.println("Opseg prvog objekta = " + a.perimeter() + "\nPovrsina prvog objekta = " + a.area()
					+ "\nPrvi objekat poredjen sa svojim klonom = " + a.compareTo(b));
			System.out.println("Prvi objekat poredjen sa vecim objektom = " + a.compareTo(c));
			System.out.println("Prvi objekat poredjen sa manjim objektom = " + a.compareTo(d));
		} catch (CloneNotSupportedException e) {
			System.out.println("...");
		}

	}

}
