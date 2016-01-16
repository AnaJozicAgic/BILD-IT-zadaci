package zadaci_16_01_2016;

public class PrestupneGodine {

	public static void main(String[] args) {

		// Counter of the leap year's in Array from Year 101 to Year 2100
		int brojac = 0;
		// A loop for counting and printing leap Year's
		for (int i = 101; i <=2100; i++) {
			if (i % 100 == 0) {
				if (i % 400 == 0) {
					System.out.print(i + " ");
					brojac++;
					if (brojac % 10 == 0) {
						System.out.println();
					}
				}
			} else if (i % 4 == 0) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();

		System.out.println("Broj prestupnih godina u rasponu od 101 - 2100 je: " + brojac);

	}

}
