package zadaci_17_02_2016;

import java.lang.Number;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void sort(ArrayList<Number> list) {
		// new array list for sorting
		ArrayList<Integer> list2 = new ArrayList<>();
		// loop to store and sort numbers
		for (int i = 0; i < 100; i++) {
			list2.add((int) list.get(i).intValue());
		}
		list.removeAll(list);
		Collections.sort(list2);
		for (int i = 0; i < 100; i++) {
			list.add(i, list2.get(i));
		}
		// printing sorted arrayList
		for (int i = 0; i < list.size(); i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(list.get(i).intValue() + " ");
		}

	}

	public static void main(String[] args) {
		// creating array list with random numbers
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 100));
		}
		// invoking method
		sort(list);
	}

}
