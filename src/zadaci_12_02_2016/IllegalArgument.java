package zadaci_12_02_2016;

public class IllegalArgument {

	public static void main(String[] args) {
		//handling illegal argument exception 
		try {
			//Prompting user to enter values to be arguments for loan clas object
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Unesite kamatnu stopu; ");
			double stopa = input.nextDouble();
			System.out.println("Unesite broj godina : ");
			int god= input.nextInt();
			System.out.println("Unesite iznos: ");
			double iznos=input.nextDouble();
			//creating new loan class object
			Loan a= new Loan(stopa, god, iznos);
			//printing new loan class object
			System.out.println(a.toString());
			input.close();
		} catch (IllegalArgumentException e) {
			//when exception occur  message is printed 
		System.out.println("Unijeli ste negativnu vrijednost, pokusajte ponovo:");
		main(args);
		}

	}

}
