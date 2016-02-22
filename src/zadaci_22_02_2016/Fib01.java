package zadaci_22_02_2016;

public class Fib01 {

	public static void main(String[] args) {
		try {
			
			java.util.Scanner input = new java.util.Scanner (System.in);
			//declaring variables
			long f0 = 0;
			long f1 = 1;
			long currentFib = 0;
			
			//prompting user to enter end position
			System.out.println("Unesite poziciju na kojoj zelite da vidite fibonaci broj: ");
			long n = input.nextInt();
			
			//calculating fib at position
			if (n==0){
				currentFib=0;
			}else if (n==1){
				currentFib=1;
			}else{	
			
			for (long i = 2; i <= n; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			}
			//printing rezult for the user
			System.out.println("Na indexu " + n + " nalazi se "+currentFib);
			input.close();
		} catch (Exception e) {
		System.out.println("Doslo je do greske.");
		main(args);
		}
	}

}
