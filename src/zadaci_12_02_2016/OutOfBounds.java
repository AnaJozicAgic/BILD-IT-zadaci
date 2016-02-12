package zadaci_12_02_2016;

public class OutOfBounds {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		// handling exception
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// creating array of 100 integers
			int niz[] = new int[100];
			// populating array with random values
			for (int i = 0; i < niz.length; i++) {
				niz[i] = (int) (Math.random() * 10);
			}
			// prompting user to enter position of the value
			System.out.println("Unesite poziciju na kojoj zelite vidjeti vrjednost u nizu: ");
			int poz = input.nextInt();
			// printing value at the position
			System.out.println("Vasa vrijednost je = " + niz[poz]);
			input.close();
		} catch (IndexOutOfBoundsException e) {
			//when exception occurs message is printed
			System.out.println("Out of Bounds.");
		}
	}

}
