package zadaci_27_01_2016;

public class NajpovoljnijaCijena {

	public static void main(String[] args) {
		//Exception handling block
		try {
			
			//Prompting user to enter values to  be processed 
			java.util.Scanner input = new java.util.Scanner(System.in);

			System.out.println("Unesite kilazu prvog proizvoda: ");
			double k1 = input.nextDouble();
			System.out.println("Unesite cijenu prvog proizvoda: ");
			double c1 = input.nextDouble();

			System.out.println("Unesite kilazu drugog proizvoda: ");
			double k2 = input.nextDouble();
			System.out.println("Unesite cijenu drugog proizvoda: ");
			double c2 = input.nextDouble();
			
			//when price per weight is calculated, less price is more affordable
			if(c1/k1>c2/k2){
				System.out.println("Povoljniji je drugi proizvod.");
			}else{
				System.out.println("Povoljniji je prvi proizvod.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
		
		
		
		
	}

}
