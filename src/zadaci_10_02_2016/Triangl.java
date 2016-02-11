package zadaci_10_02_2016;

public class Triangl extends GeometricObject {
	// data fields
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	// constructors
	public Triangl() {

	}

	public Triangl(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	// getters

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Calculating area
	public double getArea() {
		double d = (getSide1() + getSide1() + getSide3()) / 2;
		return Math.sqrt(d * (d - getSide1()) * (d - getSide2()) * (d - getSide3()));
	}

	// Calculating perimetar
	public double getPerimetar() {
		double p = getSide1() + getSide2() + getSide3();
		return p;
	}

	// To string
	@Override
	public String toString() {
		return "Triangle: strana 1 = " + side1 + " strana 2 = " + side2 + " strana 3 = " + side3
				+ "\nPovrsina trokuta je: " + getArea() + "\nOpseg trokuta je: " + getPerimetar();
	}

}
