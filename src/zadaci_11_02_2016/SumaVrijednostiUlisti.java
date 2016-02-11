package zadaci_11_02_2016;

import java.util.ArrayList;

public class SumaVrijednostiUlisti {
	public static double sum(ArrayList<Double> list) {
		//Method to sum values in the list
		double suma = 0;
		//loop to sum values
		for (int i = 0; i < list.size(); i++) {
			suma += list.get(i).intValue();
		}
		return suma;
	}

	public static void main(String[] args) {
		try {
			//arrayList to store entered values
			ArrayList<Double> lista = new ArrayList<>();
			java.util.Scanner input = new java.util.Scanner(System.in);
			//prompting user to enter values 
			System.out.println("Unesite vrijednosti u listu, unos se zavrsava sa 0: ");
			double brojevi = input.nextDouble();
			//loop to store values in the aray list
			while (brojevi != 0) {
				lista.add(brojevi);
				brojevi = input.nextDouble();
			}
			//printing sum to the user
			System.out.println("Suma unesenih vrijednosti je : " + sum(lista));
			input.close();
		} catch (Exception e) {
		System.out.println("Doslo je do greske. ");
		main(args);
		}
	}

}
