package zadaci_29_01_2016;

public class SabiranjeRazlomaka {

	public static void main(String[] args) {

		int j = 2;//Start value for  denominator
		double suma = 0.0;
		//Loop for adding fractions, i= numerator
		for (int i = 1; i < 99; i++) {
			j++;
			if (i % 2 != 0 && j % 2 != 0) {
				System.out.print(i + "/" + j + " +");
				suma += ((double)i/(double)j);
				
			}

		}
		System.out.println();
System.out.println(" = " +suma+" ");
	}

}
