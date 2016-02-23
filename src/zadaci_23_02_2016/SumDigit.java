package zadaci_23_02_2016;

public class SumDigit {
	// Variable to store sum of digits
	public static int sum = 0;

	public static int sumDigits(long n) {
		// when the n value is 0 stop spinning the method and return sum of n
		// digits
		if (n == 0) {
			return sum;
		} else {
			// otherwise increase sum for the last digit
			sum += n % 10;
			// remove last digit from n and spin
			return sumDigits(n / 10);
		}

	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter long number
			System.out.println("Unesite long broj : ");
			long n = input.nextLong();
			// Printing sum digit to the user
			System.out.println("Suma cifri unesenog broja je " + sumDigits(n));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
