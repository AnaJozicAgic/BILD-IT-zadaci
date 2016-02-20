package zadaci_18_02_2016;

public class Square extends GeometricObject implements Colorable {
	// Data field
	public int a;

	// argument constructor
	public Square(int a) {
		this.a = a;
	}

	// Method for calculating area
	public int Area() {
		return a * a;
	}

	// Interface override method
	@Override
	public void howToColor() {
		if (isFilled()) {
			System.out.println("Color all four sides");
		} else {
			System.out.println("Not colorable");
		}
	}

	// to string method
	@Override
	public String toString() {
		return "Square [Area()=" + Area() + " ]";
	}

}
