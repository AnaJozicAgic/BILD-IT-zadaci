package zadaci_05_02_20116;

public class TestRegularPoligon {

	public static void main(String[] args) {
		//Creating three objects of RgularPoligon class
		RegularPoligon prvi = new RegularPoligon();
		RegularPoligon drugi = new RegularPoligon(6, 4);
		RegularPoligon treci = new RegularPoligon(10, 4, 5.6, 7.8);
		//Printing perimeter and area for each object
		System.out.println("Obim prvog poligona je : "+ prvi.getPerimetar()+ "\nPovrsina  prvog poligona je : "+ prvi.getArea());
System.out.println();
System.out.println("Obim drugog poligona je : "+ drugi.getPerimetar()+ "\nPovrsina  drugog poligona je : "+ drugi.getArea());
System.out.println();
System.out.println("Obim treceg poligona je : "+ treci.getPerimetar()+ "\nPovrsina  treceg poligona je : "+ treci.getArea());
System.out.println();
	}

}
