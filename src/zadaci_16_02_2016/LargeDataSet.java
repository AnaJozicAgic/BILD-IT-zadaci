package zadaci_16_02_2016;

import java.io.FileNotFoundException;

public class LargeDataSet {

	public static void main(String[] args) {
		// creating new file to store large data set
		java.io.File file = new java.io.File("LargeDataSet.txt");
		// String array to store rank positions
		String[] rank = { "Assistant", "Associate", "Full" };
		double salleery = 0;
		// potential exception handling
		try {
			// print writer for writing in the file
			java.io.PrintWriter input = new java.io.PrintWriter(file);
			// loop for writing
			for (int i = 1; i <= 1000; i++) {
				int poz = (int) (Math.random() * 3);
				if (poz == 0) {
					salleery = Math.round(50000 + (Math.random() * 30000));
				} else if (poz == 1) {
					salleery = Math.round(60000 + (Math.random() * 50000));
				} else if (poz == 2) {
					salleery = Math.round(75000 + (Math.random() * 55000));
				}

				input.println("Name" + i + " Lastname" + i + " " + rank[poz] + " " + salleery);
			}

			input.close();

		} catch (FileNotFoundException e) {

			System.out.println("File nije pronadjen.");
		}

	}

}
