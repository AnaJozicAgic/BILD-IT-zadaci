package zadaci_06_02_2016;

public class MyInteger {
	// data field
	private int value;

	// initializing constructor
	public MyInteger(int value) {
		this.value = value;

	}

	// gett method
	public int getValue() {
		return value;
	}

	// checking if value is even
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking if value is odd
	public boolean isOdd() {
		if (this.value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking if value is prime
	public boolean isPrime() {
		int brojac = 0;
		for (int i = this.value; i >= 1; i--) {
			if (this.value % i == 0) {
				brojac++;
			}
		}
		if (brojac == 2) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object passed value is even
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	// checking if passed value is odd
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object passed value is prime number
	public static boolean isPrime(int value) {
		int brojac = 0;
		for (int i = value; i >= 1; i--) {
			if (value % i == 0) {
				brojac++;
			}
		}
		if (brojac == 2) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object is even value
	public static boolean isEven(MyInteger a) {
		if (a.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object has a odd value
	public static boolean isOdd(MyInteger a) {
		if (a.value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object is a prime value
	public static boolean isPrime(MyInteger a) {
		int brojac = 0;
		for (int i = a.value; i >= 1; i--) {
			if (i % a.value == 0) {
				brojac++;
			}
		}
		if (brojac == 2) {
			return true;
		} else {
			return false;
		}
	}

	// checking if object value equals to certain value
	public boolean equals(int value) {
		if (value == this.value) {
			return true;
		} else {
			return false;
		}

	}

	// checking if object value equals to certain object value
	public boolean equals(MyInteger a) {
		if (a.value == this.value) {
			return true;
		} else {
			return false;
		}

	}

	// getting int value of char
	public static int parseInt(char[] c) {
		return Integer.parseInt(new String(c));

	}

	// getting int value of string
	public static int parseInt(String s) {
		return Integer.parseInt(s);

	}
}
