package zadaci_19_02_2016;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	// data fields
	int side;

	// arg constructor
	public Octagon(int side) {
		this.side = side;

	}

	// get area method
	public double area() {
		double area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}

	// get perimeter method
	public double perimeter() {
		return 8 * side;
	}

	// Override clone
	@Override
	protected Octagon clone() throws CloneNotSupportedException {
		try {
			return (Octagon) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("...");
			throw new RuntimeException();
		}
	}

	// Override compereTo
	@Override
	public int compareTo(Octagon o) {
		if (o.area() == area()) {
			return 0;
		} else if (o.area() > area()) {
			return 1;
		} else {
			return -1;
		}

	}

}
