package zadaci_04_02_2016;

public class TestStopwach {

	public static void main(String[] args) {
		// filling array with 100000 random numbers
		int[] niz = new int[100000];
		for (int i = 0; i < 100000; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		// initializing new object
		Stopwach stoperica = new Stopwach();
		// starting stopwach
		stoperica.start();
		// selection sort of the array
		int min = 1;
		for (int i = 0; i < niz.length; i++) {
			min = i;
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[min] > niz[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = niz[min];
				niz[min] = niz[i];
				niz[i] = temp;
			}
		}
		// stoping stopwach
		stoperica.stop();

		// printing elapsed time to the user
		System.out.println("Vrijeme porebno za sortiranje niza 100000 vrijednosti je: " + stoperica.getElapsedTime()
				+ " milisekundi");

	}

}
