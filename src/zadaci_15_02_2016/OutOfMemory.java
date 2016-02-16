package zadaci_15_02_2016;

import java.util.ArrayList;

public class OutOfMemory {

	public static void main(String[] args) {
		// handling out of memory error
		try {
			// provoking error
			ArrayList<Integer> list = new ArrayList<>();
			int rna = (int) (Math.random() * 100);
			while (rna < 100) {

				list.add(rna);
			}
		} catch (OutOfMemoryError e) {
			// message for the user when error occurred
			System.err.println("Nestalo je memorije.");
		}

	}

}
