package zadaci_19_01_2016;

public class NajveciZajednickiPrefix {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Prompting user to enter two string values to be compared
		System.out.println("Unesite dva stringa: ");
		String prvi = input.nextLine().toLowerCase();
		String drugi = input.nextLine().toLowerCase();
		String temp = "";// temporary value for switching places of strings
		

		// If condition is satisfied switching places of the strings
		if (prvi.length() > drugi.length()) {
			temp = prvi;
			prvi = drugi;
			drugi = temp;

		}

		// Comparing strings if they contain equal prefix and counting positions
		// of equal chars in strings
		int krajnjaPozicija = 0;
		for (int i = 0; i < prvi.length(); i++) {
			if (prvi.substring(0, i).equals(drugi.substring(0, i))) {
				krajnjaPozicija = i;
			}
		}
		//When conditions are met, outputting message to the user
		if (krajnjaPozicija > 0) {
			System.out.print("Zajednicki prefiks unesenih stringova je " + prvi.substring(0, krajnjaPozicija));
		} else {
			System.out.println("Uneseni stringovi ne sadrze zajednicki prefix ");
		}

		input.close();
	}

}
