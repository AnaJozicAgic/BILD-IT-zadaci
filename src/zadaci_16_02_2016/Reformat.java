package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Reformat {
	public static String formatiranje(ArrayList<String> linije) throws FileNotFoundException {
		// Go thru ArrayList to find brackets
		for (int i = 0; i < linije.size(); i++) {
			String a = linije.get(i);
			char[] characters = a.toCharArray();
			int brojac = 0;
			for (int j = 0; j < characters.length; j++) {
				if (characters[j] == ' ' || characters[j] == '{') {
					brojac++;
				}
			}
			// Once there is a line with brackets, we add it to the previous
			// line , and remove this line
			if (brojac == characters.length) {
				linije.set((i - 1), (linije.get(i - 1) + " {"));
				linije.remove(i);
			}
		}
		// Print Array list to the new file
		String name = "Reformat2.txt";
		File file2 = new File(name);
		try (PrintWriter upisi = new PrintWriter(file2)) {
			for (int i = 0; i < linije.size(); i++) {
				upisi.println(linije.get(i));
			}
		}
		return name;
	}

	public static void main(String[] args) throws FileNotFoundException {

		// ArrayList to store lines
		ArrayList<String> linije = new ArrayList<>();
		// Reed file and add lines to the ArrayList
		File file = new File("Reformat.txt");
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			linije.add(input.nextLine());
		}
		input.close();

		// Reed new file and print it for the user
		File file3 = new File(formatiranje(linije));
		Scanner input2 = new Scanner(file3);
		while (input2.hasNextLine()) {
			System.out.println(input2.nextLine());
		}
		input2.close();

	}
}
