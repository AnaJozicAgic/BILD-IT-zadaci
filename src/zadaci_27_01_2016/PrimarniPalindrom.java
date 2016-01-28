package zadaci_27_01_2016;

public class PrimarniPalindrom {
	public static boolean isPrime(int n) {
		// Method to see if argument number is prime number
		int brojac = 0;// Counter for division

		// Loop to find how many times entered number is divisible in array form
		// number to one
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				brojac++;
			}
		}
		// If division was successful only two times number is prime.
		if (brojac == 2) {

			return true;
		} else {
			return false;
		}

	}

	public static boolean palindrom(int n) {

		// Method to check if argument number is palindrom
		int t = n;// variable to store argument value
		int l = 0;// temporary value to store reminder
		String k = "";// String to store reverse number

		// Loop to find reverse number
		while (t != 0) {
			l = t % 10;
			k += l;
			t /= 10;

		}
		// converting string to int
		l = Integer.valueOf(k);

		// if argument is Equal as the reverse number argument is palindrom
		if (l == n) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int brojac = 0;//Counter for output per line
		
		//Loop to check first 100 palindrom prime numbers
		for (int i = 0; i <= 94049; i++) {
			//If conditions are met number is printed...
			if (isPrime(i) && palindrom(i)) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

}
