package zadaci_24_01_2016;

//Method for counting chars in a string
public class PrebrojavanjeKarakteraUStringu {

	public static int count(String str, char a) {
		int brojac = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				brojac++;
			}

		}

		return brojac;

	}

	public static void main(String[] args) {

		// Exception handling block
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite string :");
			String s = input.nextLine();
			System.out.println("Unesite karakter koji zelite prebrojati u navedenom stringu");
			String c = input.next();

			// reentering c value while is not correctly entered
			while (c.length() > 1) {
				System.out.println("Unijeli ste previse karaktera");
				c = input.next();
			}
			// Converting string to char
			char a = c.charAt(0);
			// Invoke method and output to the user
			System.out.println("U unesenom stringu ima " + count(s, a) + " karaktera " + a);

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
