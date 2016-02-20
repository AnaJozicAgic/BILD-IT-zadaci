package zadaci_19_02_2016;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	// data fields
	private double side1 = 1;
	private double side2 = 1;

	// constructors
	public Rectangle() {

	}

	public Rectangle(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;

	}
	// getters

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	// Calculating area
	public double getArea() {

		return side1 * side2;
	}

	// Calculating perimetar
	public double getPerimetar() {
		double p = 2 * getSide1() + 2 * getSide2();
		return p;
	}

	@Override
	public int compareTo(Rectangle o) {
		// TODO Auto-generated method stub
		return 0;
	}

	// To string
	@Override
	public String toString() {
		return "Rectangle: strana 1 = " + side1 + " strana 2 = " + side2 + "\nPovrsina pravougaonika je: " + getArea()
				+ "\nOpseg pravougaonika je: " + getPerimetar();
	}
	@Override
	public boolean equals(Object obj) {
		//return if object areas are equal
		if (obj.equals(getArea())) {
			return super.equals(obj);
		} else {
			return !super.equals(obj);
		}
	}

}
