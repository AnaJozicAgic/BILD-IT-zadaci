package zadaci_11_02_2016;

import java.util.ArrayList;

public class KombinovanaLista {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// new array list to add two lists
		ArrayList<Integer> lista3 = new ArrayList<>();
		// add first list
		lista3.addAll(list1);
		// add second list
		lista3.addAll(list2);
		// return third list
		return lista3;

	}

	public static void main(String[] args) {
		try {
			ArrayList<Integer> lista1 = new ArrayList<>();
			ArrayList<Integer> lista2 = new ArrayList<>();
			// prompting user to enter values to be processed
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite 5 vrijednosti u prvu listu: ");
			// adding values to first arrayList
			for (int i = 0; i < 5; i++) {
				lista1.add(input.nextInt());
			}
			System.out.println("Unesite 5 vrijednosti u drugu listu: ");
			// adding values to second arrayList
			for (int i = 0; i < 5; i++) {
				lista2.add(input.nextInt());
			}
			// printing method return to the user
			for (int i = 0; i < union(lista1, lista2).size(); i++) {
				System.out.print(union(lista1, lista2).get(i).intValue() + ", ");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske: ");
			main(args);
		}

	}

}
