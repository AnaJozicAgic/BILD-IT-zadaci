package zadaci_24_02_2016;

public class Emax {
	public static <E extends Comparable<E>> E max(E[] list) {
		E maxi = list[0];// declaring start max value
		// Loop to find max value in the array
		for (int i = 0; i < list.length; i++) {
			if ((int) list[i].compareTo(maxi) > 0) {
				maxi = list[i];
			}
		}
		return maxi;
	}

	public static void main(String[] args) {
		//Creating new array
		Integer[] c = new Integer[20];
		//Filling the array
		for (int i = 0; i < c.length; i++) {
			c[i] = (int)(Math.random()*20);
			System.out.println(c[i]+" ");
		}
		//Printing max value to the user
		System.out.println("Najveca vrijednost u nizu je : " + max(c));
	}

}
