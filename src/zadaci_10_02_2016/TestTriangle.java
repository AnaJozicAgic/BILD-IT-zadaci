package zadaci_10_02_2016;

public class TestTriangle {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// prompting user to enter object properties
			System.out.println("Unesite tri strane trougla: ");
			// new triangle object with sides defined
			Triangl trokut = new Triangl(input.nextDouble(), input.nextDouble(), input.nextDouble());
			System.out.println("Unesite boju trougla: ");
			String boja = input.next();
			System.out.println("Unesite true ako je trougao popnunjen ili false ako nije: ");
			String popunjeno = input.next();
			// SEting filed and color properties
			trokut.setColor(boja);
			if (popunjeno.equals("true")) {

				trokut.setFilled(true);
			} else {
				trokut.setFilled(false);
			}
			input.close();
			// Printing object properties to the user
			System.out.println(trokut.toString() + "\nBoja je: " + trokut.getColor() + "\nTrokut je popunjen: "
					+ trokut.isFilled());
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
			main(args);
		}
	}

}
