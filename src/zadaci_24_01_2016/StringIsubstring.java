package zadaci_24_01_2016;

public class StringIsubstring {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Block for exception handling
		try {
			// Prompting user to enter values to be procesed
			System.out.println("Unesite prvi string:");
			String prvi = input.nextLine();
			System.out.println("Unesite drugi string:");
			String drugi = input.nextLine();

			// So if first string contains second string, second is substring
			// first
			if (prvi.contains(drugi)) {
				System.out.println(drugi + " je substring " + prvi);
			} else {
				System.out.println(drugi + " nije substring " + prvi);
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
		}
		input.close();

	}

}
