package zadaci_23_02_2016;

public class LargestNumberArray {
	// Variable to store max value
	public static int max;
	// variable for index
	public static int i = 0;

	public static int najveciUnizu(int[] niz) {
		// if all array elements are check return max value
		if (i == niz.length) {
			return max;
		} else {
			// check if value at index is larger than max, if true that is new
			// max
			if (niz[i] > max) {
				max = niz[i];
			}
			// increase index
			i++;
			// spin method
			return najveciUnizu(niz);
		}
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite 8 integera u niz : ");
			// creating new array of 8 integers
			int niz[] = new int[8];
			// Storing values to the array
			for (int i = 0; i < 8; i++) {
				int num = input.nextInt();
				niz[i] = num;
			}
			// Printing max value to the user
			System.out.println("Najveci u nizu je " + najveciUnizu(niz));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
			main(args);
		}

	}

}
