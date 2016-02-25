package zadaci_24_02_2016;

import java.util.Arrays;

public class BinarySearcsh {
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// Sorting list to perform binary search
		Arrays.sort(list);
		int low = 0;// declaring lowest position
		int high = list.length - 1;// declaring end position

		// loop to search for the element
		while (high >= low) {
			// declare middle
			int middle = (low + high) / 2;
			// if element is at middle position
			if (list[middle] == key) {
				return middle;
			}
			// if element at middle position is less than key
			else if (list[middle].compareTo(key) < 0) {
				low = middle + 1;
			}
			// if element at middle position is more than key
			else if (list[middle].compareTo(key) > 0) {
				high = middle - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter values to be processed
			System.out.println("Unesite vrijednost koju zelite provjeriti da li je u nizu : ");
			Integer key = input.nextInt();
			// Array for check
			Integer[] list = new Integer[11];
			for (int i = 0; i < list.length; i++) {
				list[i] = i;
			}
			// when conditions are met, print message
			if (binarySearch(list, key) == -1) {
				System.out.println("Trazena vrijednost nije pronadjena.");
			} else {
				System.out.println("Trazena vrijednost je na indexu " + binarySearch(list, key));
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske : ");
		}
	}

}
