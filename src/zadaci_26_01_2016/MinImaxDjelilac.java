package zadaci_26_01_2016;

public class MinImaxDjelilac {

	public static void main(String[] args) {

		java.util.Scanner input;
		try {
			input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite dva cijela broja veca od 0: ");

			int prvi = input.nextInt();
			int drugi = input.nextInt();
			int temp = 0;
			
			//Loop so zero would not be entered
			while (prvi == 0 || drugi == 0) {
				System.out.println("Unijeli ste nulu, unesite drugu vrijednost.");
				if (prvi == 0) {
					prvi = input.nextInt();
				} else if (drugi == 0) {
					drugi = input.nextInt();
				}
			}

			// Switching places if first number is larger than second
			if (prvi > drugi) {
				temp = prvi;
				prvi = drugi;
				drugi = temp;
			}

			int min = 1;// Variable for storing min divisor
			int max = 1;// Variable for storing max divisor

			// Loop for finding max divisor
			for (int i = 1; i <= drugi; i++) {
				if (prvi % i == 0 && drugi % i == 0) {
					max = i;
				}

			}

			// Loop for finding min divisor
			for (int i = drugi; i >= 2; i--) {
				if (drugi % i == 0 && prvi % i == 0) {
					min = i;
				}
			}

			// Output for the user
			System.out.println("Najveci zajednicki djelilac je:" + max + "\nNajmanji zajednicki djelilac je: " + min);

			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
