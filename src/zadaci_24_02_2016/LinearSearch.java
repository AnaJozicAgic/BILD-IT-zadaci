package zadaci_24_02_2016;

public class LinearSearch {
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		// Loop to check equality
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {
				// If element equals key reurn element position
				return i;
			}
		}
		// otherwise
		return -1;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// Prompting user to enter values to be processed
			System.out.println("Unesite vrijednost koju zelite provjeriti da li je u nizu : ");
			Integer key = input.nextInt();
			// Array for checking
			Integer[] list = new Integer[10];
			// Filing the array
			for (int i = 0; i < list.length; i++) {
				list[i] = i;
			}
			// If method return match desired value print message to the user
			if (linearSearch(list, key) == -1) {
				System.out.println("Trazena vrijednost nije pronadjena.");
			} else {
				System.out.println("Trazena vrijednost je na indexu " + linearSearch(list, key));
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
		}

	}

}
