package zadaci_17_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class ShufleList {
	public static void shuffle(ArrayList<Number> list) {
		// Shuffle list
		Collections.shuffle(list);
		// print list
		for (int i = 0; i < list.size(); i++) {
			if (i % 10==0) {
				System.out.println();
			}
			System.out.print(list.get(i).intValue() + "  ");
			
		}

	}

	public static void main(String[] args) {
		// create list
		ArrayList<Number> list = new ArrayList<>();
		// fil list
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		// invoke method
		shuffle(list);
	}

}
