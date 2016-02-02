package zadaci_02_02_2016;

public class RandomNumberChoose {
	public static int getRandom(int[] numbers) {

		// Method that returns random number 0-54 by excluding numbers in the
		// argument
		int num = (int) (Math.random() * 55);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				num = (int) (Math.random() * 55);
			}
		}
		return num;
	}

	public static void main(String[] args) {

		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite koliko brojeva zelite zaobici u rasponu od 0 do 54:");
			int duzina = input.nextInt();

			int[] niz = new int[duzina];// Array for storing entered values
			System.out.println("Unesite brojeve izmedju 0 i 54 koje \n" + "ne zelite da da se ispisu:");

			// Loop for storing entered values
			for (int i = 0; i < niz.length; i++) {
				niz[i] = input.nextInt();
			}
			// Message for the user
			System.out.println("Nasumican broj: " + getRandom(niz));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
