package zadaci_19_02_2016;

public class TestCircleComparable {

	public static void main(String[] args) {
		// objects to check if they radii are the same
		CircleComparable a = new CircleComparable(5);
		CircleComparable b = new CircleComparable(5);

		// Printing the return
		System.out.println(a.equals(b));

		// objects to check if they radii are the same
		CircleComparable c = new CircleComparable(5);
		CircleComparable d = new CircleComparable(3);

		// Printing the return
		System.out.println(c.equals(d));
	}

}
