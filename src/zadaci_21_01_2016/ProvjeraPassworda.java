package zadaci_21_01_2016;

public class ProvjeraPassworda {

	//Method for password check
	public static void paswordCheck(String pass) {
		int brojacBrojeva = 0;//Digit counter
		int brojacKaraktera = 0;//Caracter counter

		
		//Loop for counting digits and Letter
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLetter(pass.charAt(i))) {
				brojacKaraktera++;
			}
			if (Character.isDigit(pass.charAt(i))) {
				brojacBrojeva++;
			}
		}
		// When conditions are met password is valid, otherwise password is not valid
		if (pass.length() >= 8 && (pass.length() == brojacBrojeva + brojacKaraktera) && brojacBrojeva >= 2) {
			System.out.println("Pasword je validan");

		} else {
			System.out.println("Password nije validan");
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
 
		//Prompting user to enter password
		System.out.println("Unesite password");
		String pas = input.nextLine();
		paswordCheck(pas);//Invoking method for checking  entered password
		input.close();
	}

}
