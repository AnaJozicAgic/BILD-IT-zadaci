package zadaci_19_02_2016;

public class SumAreas {
	// method to sum objects areas
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		// Creating objects array
		GeometricObject a[] = new GeometricObject[4];
		// Adding objects to the array
		a[0] = new Rectangle(5, 5);
		a[1] = new Rectangle(7, 7);
		a[2] = new CircleComparable(5);
		a[3] = new CircleComparable(7);
		// Printing message to the user
		System.out.println("Suma povrsina objekata u nizu = " + sumArea(a));
	}

}
