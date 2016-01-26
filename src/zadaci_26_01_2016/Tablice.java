package zadaci_26_01_2016;

public class Tablice {

	public static void main(String[] args) {

		// String of simbol's
		String simboliTablica = "ABCDEFGHIJKLMNOPRUSTVWXYZ";
		int brojac = 0;// Counter for creating 3 capital letters string
		String tabliceS = "";// Variable for storing capital letters string

		// Loop for adding letters to capital letters string
		while (brojac < 3) {
			int poz = (int) (Math.random() * simboliTablica.length());
			brojac++;
			tabliceS += simboliTablica.charAt(poz);
		}

		String tabliceN = "";// Variable for storing digits
		// Loop for adding 4 random digits to the string
		while (tabliceN.length() < 4) {
			int brojTablica = (int) (Math.random() * 10);
			tabliceN += brojTablica;
		}
	
		// Output for the user
		System.out.println("Tablice : " + tabliceS + "-" + tabliceN);
	}

}
