package zadaci_21_01_2016;

public class TestSabiranja {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Variables of random integers
		int prvi = (int) (Math.random() * 10);
		int drugi = (int) (Math.random() * 10);
		int treci = (int) (Math.random() * 10);

		// Prompting user to enter correct sum
		System.out.println("Koliko je " + prvi + " + " + drugi + " + " + treci + " =");
		int sum = prvi + drugi + treci;// Sum of numbers for check
		int rezultat = input.nextInt();// User inputs the sum

		// Loop for asking question while answer is corect
		while (sum != rezultat) {
			System.out.println("Pogresan odgovor pokusajte ponovo: ");
			System.out.println("Koliko je " + prvi + " + " + drugi + " + " + treci + " =");

			rezultat = input.nextInt();
		}
		
		// when condition is met output mesage to the user
		if (sum == rezultat) {
			System.out.println("Tacno ste odgovorili.");
		}
		input.close();
	}

}
