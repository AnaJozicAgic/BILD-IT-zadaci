package zadaci_27_01_2016;

public class Emirp {
	public static boolean palindrom(int n) {
		int t = n;// Variable to store argument value
		int l = 0;// temporary reminder value
		String k = "";// String to store revers value

		// Loop to find revers number
		while (t != 0) {
			l = t % 10;
			k += l;
			t /= 10;

		}
		l = Integer.valueOf(k);// turning string to int for comparing

		// Conditions for palindrom
		if (l == n) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isPrime(int n) {

		int brojac = 0;// counter to count how many times number was divided
		// successfully

		// Loop to check if entered number is prime
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				brojac++;
			}
		}

		if (brojac == 2) {

			return true;
		} else {
			return false;
		}

	}

	public static int naopako(int broj) {
		int temp = 0;// Temporary value to store reminder
		String emirp = "";// String to store reminders
		// Loop to find revers number
		while (broj != 0) {
			temp = broj % 10;
			emirp += temp;
			broj /= 10;
		}
		// Converting string to int
		int vrati = Integer.valueOf(emirp);
		return vrati;
	}

	public static void main(String[] args) {

		int brojac = 0;// Counter for user output
		// Loop to find prime numbers
		for (int i = 0; i <= 3500; i++) {
			// When conditions are met, non palindrom emirp prime numbers are
			// printed
			if ((isPrime(i)) && (isPrime(naopako(i))) && !(palindrom(i))) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
				if (brojac == 100) {
					System.exit(1);
				}
			}

		}

	}

}
