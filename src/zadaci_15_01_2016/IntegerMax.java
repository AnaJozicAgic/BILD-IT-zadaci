package zadaci_15_01_2016;

import java.util.ArrayList;

public class IntegerMax {

	// Method for determining the max value in ArrayList
	public static Integer max(ArrayList<Integer> list) {
		int maxValue = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).intValue() > maxValue) {
				maxValue = list.get(i).intValue();
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<Integer> myList = new ArrayList<>();

		// Prompting User to enter Values in ArrayList
		System.out.println("Unesite vrijednosti u ArrayList\n(Unos vrijednsoti prekidate sa x): ");
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Loop for adding objects to ArrayLIst
		while (input.hasNextInt()) {
			int val = input.nextInt();
			myList.add(val);
		}

		// Call upon a method to determine the max Value in the list
		System.out.println(max(myList));
		input.close();
	}
}
