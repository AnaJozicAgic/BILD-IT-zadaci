package zadaci_06_02_2016;

public class TestMyPint {

	public static void main(String[] args) {
		//Creating objects
		MyPoint m1=new MyPoint();
		MyPoint m2=new MyPoint(10, 30.5);
		//printing distance
		System.out.println("Udaljenost izmedju m1 i m2 = "+ m2.distance(m1));
		System.out.println("Udaljenost izmedju m1 i m2 = "+ m1.distance(10,30.5));

	}

}
