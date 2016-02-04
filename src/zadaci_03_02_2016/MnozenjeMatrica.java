package zadaci_03_02_2016;

import java.text.DecimalFormat;

public class MnozenjeMatrica {
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		//Method for multiplying
		
		//2D array to store multiplication results
		double[][] c = new double[a.length][3];
		//Loop for multiplying values and storing result to the array
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] =(a[i][0]* b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]);
			}
		}
		return c;
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			//Array for storing values that are to be multiplied
			double a[][] = new double[3][3];
			double b[][] = new double[3][3];
			
			//Prompting user to enter values to the first array
			System.out.println("Unesite vrijednosti u prvu matricu: ");
			//Loop for storing values
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = input.nextDouble();
				}
			}
			
			//Prompting user to enter values to the second array
			System.out.println("Unesite vrijednosti u drugu matricu: ");
			
			//Loop for storing values
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					b[i][j] = input.nextDouble();
				}
			}
			//Object for formating output
			DecimalFormat df= new DecimalFormat("#.#");
			
			// Loop for printing multiplying operation
			for (int i = 0; i < multiplyMatrix(a, b).length; i++) {

				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				if (i == 1) {
					System.out.print("   X    ");
				} else {
					System.out.print("        ");
				}
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + " ");
				}
				if (i == 1) {
					System.out.print("   =    ");
				} else {
					System.out.print("        ");
				}
				for (int j = 0; j < multiplyMatrix(a, b)[i].length; j++) {
					System.out.print(df.format(multiplyMatrix(a, b)[i][j]) + "  ");
				}
				System.out.println();
				
			}
			input.close();
		} catch (Exception e) {
			
			System.out.println("Doslo je do greske, pokusajte ponovo.");
			main(args);
		}
	}

}
