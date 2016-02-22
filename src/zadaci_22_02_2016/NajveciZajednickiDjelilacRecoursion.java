package zadaci_22_02_2016;

public class NajveciZajednickiDjelilacRecoursion {
	
	public static int gCd(int a,int b){
		//Recursion method for finding greatest common divider
		if(a%b==0){
			return b;
		}else{
		return gCd(b,a%b);
		}
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner (System.in);
			//prompting user two whole numbers
			System.out.println("Unesite dva cijela broja: ");
			int a= input.nextInt();
			int b = input.nextInt();
			//printing GCD return to the user
			System.out.println("Najveci zajedniscki djelilac je "+gCd(a, b));
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske. ");
		}

	}

}
