package zadaci_30_01_2016;

/*DDD-DD-DDDD*/
public class SSN {
	public static boolean isSSn(String ssn) {
		// Method to check format of entered value
		if (Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2))
				&& Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5))
				&& Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8))
				&& Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10)) && ssn.charAt(3) == '-'
				&& ssn.charAt(6) == '-'&& ssn.length()==11) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter SSN
			System.out.println("Unesite vas SSN u formatu DDD-DD-DDDD:");
			String ssn = input.nextLine();
			// Loop to enable number entering while entered format is incorrect
			while (!isSSn(ssn)) {
				System.out.println("Niste unijeli ispravan broj, pokusajte ponovo.");
				ssn = input.nextLine();
				input.close();
			}
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
