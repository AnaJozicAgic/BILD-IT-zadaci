package zadaci_01_02_2016;

public class Unicode {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			// Prompting user to enter a Symbol ,or a symbol Array
			System.out.println("Unesite simbol za koji zelite vidjeti unicode:");
			String uni = input.nextLine();

			//Message for the user
			System.out.println("Unicode vrijednost za vas simbol je:");
			char ch[] = new char[uni.length()];
			for (int i = 0; i < uni.length(); i++) {
				ch[i] = uni.charAt(i);
				System.out.println((int) ch[i]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

	}

}
