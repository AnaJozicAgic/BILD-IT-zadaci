package zadaci_30_01_2016;

public class Palindrom {

	public static boolean isPalindrom(int n) {
		
		//Method to check if entered number is palidrom
		int d = n;
		int s = 0;
	String test="";
		while (d != 0) {
			s = d % 10;
			test=test+""+ s;
			d /= d;

		}
		if (n == Integer.valueOf(test)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(StringDuzinaIprviSimbol[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			//Prompting user to enter value to be processed
			System.out.println("Unesite vrijednost :");

			int broj = input.nextInt();
			//If method return is true , entered value is palidrom
			if (isPalindrom(broj)) {

				System.out.println("Broj je palindrom.");
			} else {
				System.out.println("Broj nije palidrom.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
