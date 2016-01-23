package zadaci_22_01_2016;

public class DanUbuducnosti {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// Prompting user to enter values to be processed
		System.out.println("Unesite cijeli broj za danasnnji dan u sedmici\n(0 za ponedjeljak,....,6 za nedjelju)");
		int danas = input.nextInt();

		System.out.println("Unesite broj dana nakon kojeg zelite vidjeti koji je dan");
		int danUbuducnosti = input.nextInt();

		// When conditions are met result is printed to the user
		if ((danas + danUbuducnosti + 1) % 7 == 0) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Nedjelja");
		} else if ((danas + danUbuducnosti + 1) % 7 == 6) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Subota");
		} else if ((danas + danUbuducnosti + 1) % 7 == 5) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Petak");
		} else if ((danas + danUbuducnosti + 1) % 7 == 4) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Cetvrtak");
		} else if ((danas + danUbuducnosti + 1) % 7 == 3) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Srijeda");
		} else if ((danas + danUbuducnosti + 1) % 7 == 2) {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Utorak");
		} else {
			System.out.println("Za " + (danUbuducnosti) + " dana biti ce Ponedjeljak");
		}

		input.close();

	}

}
