package zadaci_24_02_2016;

public class MaxIn2D {
	public static <E extends Comparable<E>> E max(E[][] list) {
		E maxi = list[0][0];// Declaring start max value

		// Loop to find max value in 2D array
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i][j].compareTo(maxi) > 0) {
					maxi = list[i][j];
				}
			}
		}
		return maxi;
	}

	public static void main(String[] args) {

		// creating new 2D array
		Integer[][] p = new Integer[5][5];
		// Loop to fill array with random values
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				p[i][j] = (int) (Math.random() * 20);
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}
		// Printing max value to the user
		System.out.println("Najveca vrijednost u nizu je : " + max(p));
	}
}
