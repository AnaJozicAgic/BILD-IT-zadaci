package zadaci_15_02_2016;

public class NumberFormat {
	public static double bin2Dec(String binaryString) {
		// converting string to double
		double ret = 0;
		ret = Double.parseDouble(binaryString);
		return ret;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// handling exception
		try {
			// prompting user to enter value
			System.out.println("Unesite decimalni broj: ");
			String in = input.next();
			System.out.println(bin2Dec(in));
		} catch (NumberFormatException e) {
			// message if exception occurred
			System.out.println("Pogresan format unosa.");
		} finally {
			// closing the scanner
			input.close();

		}

	}

}
