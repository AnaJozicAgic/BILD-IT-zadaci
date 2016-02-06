package zadaci_05_02_20116;

public class IntersectingPoint {

	public static void main(String[] args) {
		try {
			//prompting user to enter values to be processed
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite vrijednosti za x1 i y1 : ");
			double x1=input.nextDouble();
			double y1=input.nextDouble();
			System.out.println("Unesite vrijednosti za x2 i y2 : ");
			double x2=input.nextDouble();
			double y2=input.nextDouble();
			System.out.println("Unesite vrijednosti za x3 i y3 : ");
			double x3=input.nextDouble();
			double y3=input.nextDouble();
			System.out.println("Unesite vrijednosti za x4 i y4 : ");
			double x4=input.nextDouble();
			double y4=input.nextDouble();
			
			//Creating equation object
			LinearEquation jednacina2  = new LinearEquation((y1 - y2), (x1 - x2), (y3 - y4), (x3 - x4),
						((y1 - y2) * x1 - (x1 - x2) * y1), ((y3 - y4) * x3 - (x3 - x4) * y3));

			//if is solvable print x and y coordinate, otherwise lines are parallel
			if(jednacina2.isSolvable()){
				System.out.println("Koordinate sjecista su : x: " + jednacina2.getX()+ "i y: " + jednacina2.getY());
			}else{
				System.out.println("Linije su paralelne.");
			}
			input.close();
		} catch (Exception e) {
		System.out.println("Doslo je do greske.");
		main(args);
		}
		
	}

}
