package zadaci_22_01_2016;

public class DjeljiviSaPetIsest {

	public static void main(String[] args) {

		int brojac = 0;//Counter variable for entering e new line
		
		//Loop so all numbers in array could  be checked
		for (int i = 100; i <= 1000; i++) { 
			//When conditions are met outputting result 
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % 10 == 0) {
					System.out.println();
				}
			}
		}

	}

}
