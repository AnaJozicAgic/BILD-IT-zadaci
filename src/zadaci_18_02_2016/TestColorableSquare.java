package zadaci_18_02_2016;

import java.util.ArrayList;

public class TestColorableSquare {

	public static void main(String[] args) {
		// List to store 5 Square objects
		ArrayList<Square> lista = new ArrayList<>();
		// Loop to create 5 objects, and store them in the list
		for (int i = 5; i <= 10; i++) {
			Square a = new Square(i);
			int j = (int) (Math.random() * 2);
			if (j == 0) {
				a.setFilled(true);
			} else {
				a.setFilled(false);
			}
			lista.add(a);
		}
		// loop for printing the list, and how to color the object
		for (int i = 0; i < lista.size(); i++) {
			System.out.print("Area of the rectangle is : " + lista.get(i).Area() + " ");
			lista.get(i).howToColor();
		}
	}

}
