package zadaci_16_01_2016;

public class NasumicnaPitanja {
	// Method for the questions
	public static void pitanja(int brPitanja) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Counters for true and false answers and temp value to switch places
		// of the values a and b, so the result would not be a negative number
		int counterTacno = 0;
		int counterNeTacno = 0;
		int temp = 0;

		for (int i = 0; i < brPitanja; i++) {
			int a = 1 + (int) (Math.random() * 10);
			int b = 1 + (int) (Math.random() * 10);
			if (a < b) {
				temp = a;
				a = b;
				b = temp;
			}

			// Asking a question and prompting a User to enter a result
			System.out.println(" KOliko je : " + a + " - " + b);
			int odgovor = input.nextInt();
			int sum = a - b;
			// Counting true and false answers
			if (sum == odgovor) {
				counterTacno++;
			}
			if (sum != odgovor) {
				counterNeTacno++;
			}
			input.close();
		}

		System.out.println(" Broj tacnih odgovora je: " + counterTacno);
		System.out.println(" Broj netacnih odgovora je: " + counterNeTacno);
	}

	public static void main(String[] args) {

		// Prompting the user to enter how many Questions he/she want's to be
		// asked
		System.out.println("Unesite broj pitanja koja ce vam biti postavljena: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int broj = input.nextInt();

		// Invoking the method for asking Questions and counting answers
		pitanja(broj);
		input.close();
	}

}
