package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class SortiranjeListe {
	
	public static void sort(ArrayList<Integer> list){
		//Sorting list
		Collections.sort(list);
		//printing sorted arrayList
		System.out.println("Sortiran niz : ");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).intValue()+", ");
		}
		
	}


	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			//arrayList to store values
			ArrayList<Integer>lista = new ArrayList<>();
			//prompting user to enter 5 values
			System.out.println("Unesite 5 vrijednosti u niz : ");
			//loop to store entered values to the arrayList
			for ( int i= 1; i<=5; i++){
				lista.add(input.nextInt());
			}
			//invoking method for sorting list
			sort(lista);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
			main(args);
		}

	}

}
