package zadaci_15_01_2016;

import java.util.ArrayList;

public class PonavljanjeNajvecegBroja {

	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<Integer> myList = new ArrayList<>();

		// Asking User to input values i a list
		System.out.println("Unesite vrijednosti u niz\n(Unosenje vrijednosti zavrsava se sa 0): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		int no = input.nextInt();

		// A loop to fill in the values
		while (no != 0) {
			myList.add(no);
			no = input.nextInt();
		}

		int counter = 0;
		int max = 0;

		// A loop for finding the max value
		for (int i = 0; i < myList.size(); i++) {

			if (myList.get(i).intValue() > max) {
				max = myList.get(i).intValue();
			}
		}

		// A loop for counting how many times the max value repeat it self
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).intValue() == max) {
				counter++;
			}
		}

		// Out print to the User
		System.out.println(" Najveca vrijednost u nizu je " + max + " i ponavlja se " + counter + " puta.");
		input.close();
	}

}
