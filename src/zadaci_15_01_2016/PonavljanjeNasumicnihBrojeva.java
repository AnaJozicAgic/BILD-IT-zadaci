package zadaci_15_01_2016;

public class PonavljanjeNasumicnihBrojeva {

	public static void main(String[] args) {
		// Creating Array of 100 number's 0-9 randomly
		int[] niz = new int[100];
		for (int i = 0; i < 100; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		// Creating counter Array for counting how many times certain number
		// appeared
		int[] brojac = new int[10];
		for (int e : niz) {
			brojac[e]++;
		}
		// Loop for printing result of counting
		for (int k = 0; k < brojac.length; k++) {
			if (brojac[k] != 0) {
				System.out.println(" broj" + k + " se ponavlja " + brojac[k] + " puta ");
			}
		}
		// Printing the Array
		int brojac2 = 0;
		for (int j = 0; j < niz.length; j++) {

			System.out.print(" " + niz[j]);
			brojac2++;

			if (brojac2 % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

}
