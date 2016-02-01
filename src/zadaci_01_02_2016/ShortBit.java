package zadaci_01_02_2016;

public class ShortBit {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter Short value
			System.out.println("Unesite broj da bi ste vidjeli njegovu vrijednost u bitima: ");
			Short x = input.nextShort();
			// Message for the user, binary value of entered short
			System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(x))));
			input.close();
		} catch (NumberFormatException e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
