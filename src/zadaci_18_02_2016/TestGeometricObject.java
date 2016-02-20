package zadaci_18_02_2016;

public class TestGeometricObject {

	public static void main(String[] args) {
		// Triangle objects for comparing
		GeometricObject c1 = new Triangl(5, 5, 5);
		GeometricObject c2 = new Triangl(7, 7, 7);
		// Printing compare
		System.out.println("Veci od dva je " + GeometricObject.max(c1, c2));
		// Rectangle objects for comparing
		GeometricObject d1 = new Rectangle(5, 5);
		GeometricObject d2 = new Rectangle(7, 7);
		// Printing compare
		System.out.println("Veci od dva je " + GeometricObject.max(d1, d2));

	}

}
