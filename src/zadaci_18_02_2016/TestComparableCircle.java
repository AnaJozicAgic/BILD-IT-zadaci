package zadaci_18_02_2016;

public class TestComparableCircle {

	public static void main(String[] args) {
		//Circle objects for comparing
		Circle a = new ComparableCircle();
		a.radius = 5;
		Circle b = new ComparableCircle();
		b.radius = 7;
		//comparing objects
		ComparableCircle.max((ComparableCircle) a, (ComparableCircle) b);
		//Printing return
		System.out.println("Veci krug je : " + ComparableCircle.max((ComparableCircle) a, (ComparableCircle) b));
	}

}
