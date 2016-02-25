package zadaci_24_02_2016;

import java.util.ArrayList;

public class DistintctElementsInAList {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// counter array to count elements occurrence
		int[] brojac = new int[list.size()];
		// new arrayList to store
		ArrayList<E> nova = new ArrayList<>();
		// Loop to count occurrence of the element
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					brojac[j]++;
					// Counting elements
				}
			}
			// If element occurred ones add element to the list
			if (brojac[i] == 1) {
				nova.add(list.get(i));
			}
		}

		return nova;
	}

	public static void main(String[] args) {
		// arrayList of random integers
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add((int) (Math.random() * 10));
		}
		// Print list
		System.out.println(list);
		// Print method return
		System.out.println(removeDuplicates(list));

	}

}
