package zadaci_23_02_2016;

public class OcuranceCount {
	// counter variable to count symbol occurrence
	public static int counter;
	// int to increase index decrease
	public static int i = 1;
	// string to store reverse string
	public static String b = "";

	public static int count(String str, char a) {
		// If reverse string length equals entered string length stop the spin
		// and return count
		if (str.length() == b.length()) {
			return counter;
		} else {
			// Otherwise add char to the reverse string and check if it is
			// desired char to count
			b += str.charAt(str.length() - i);
			if (str.charAt(str.length() - i) == a) {
				counter++;
			}
			// increase the index decrease
			i++;
			return count(str, a);
		}
	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			//Prompting user to enter elements to be processed
			System.out.println("Unesite string u kojem zelite prebrojati odredjene simbole: ");
			String str = input.nextLine();
			System.out.println("Unesite simbol koji zelite prebrojati: ");
			String t = input.next();
			char a = t.charAt(0);
			//Printing method return 
			System.out.println("Ukupno ima " + count(str, a) + " simbola " + a);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
