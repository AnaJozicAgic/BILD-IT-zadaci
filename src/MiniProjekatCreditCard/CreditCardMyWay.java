package MiniProjekatCreditCard;

/* I did this code before reading the entire assignment and it works
 * just fine so I chose not to discard it. */
import java.util.ArrayList;

public class CreditCardMyWay {
	public static boolean prefixMatched(long number, int k) {
		// Method for matching prefix
		long dio = 0;// Variable for storing remain
		ArrayList<Long> listaCifri = new ArrayList<>();// ArrayList to store
														// digits

		// Loop to separate digits and add them to the list
		while (number != 0) {
			dio = number % 10;
			listaCifri.add(dio);
			number = number / 10;

		}
		// When conditions are met method returns true, otherwise method returns
		// false
		if (listaCifri.get(listaCifri.size() - 1).longValue() == 4
				|| listaCifri.get(listaCifri.size() - 1).longValue() == 5
				|| listaCifri.get(listaCifri.size() - 1).longValue() == 6) {
			return true;
		} else if (listaCifri.get(listaCifri.size() - 1).longValue() == 3
				&& listaCifri.get(listaCifri.size() - 2).longValue() == 7) {

			return true;
		} else

			return false;

	}

	public static boolean isValid(long number) {
		// Method to check if card is valid
		long dio = 0;// Variable to store single digits
		// ArrayList to store digits
		ArrayList<Long> listaCifri = new ArrayList<>();

		long number1 = number;// New variable so the argument would not be a
								// zero

		// Loop to separate single digits
		while (number1 != 0) {
			dio = number1 % 10;
			listaCifri.add(dio);
			number1 = number1 / 10;

		}

		long multi = 0;// Variable to store multiplication value
		// ArrayList so store multiplication values for summing
		ArrayList<Long> listaUmnozaka = new ArrayList<>();

		long suma = 0;// Variable to store sum

		// Loop to calculate multiplication, add values to the list and summ
		// them
		for (int i = 0; i < listaCifri.size(); i++) {
			if (i % 2 != 0) {
				multi = listaCifri.get(i).longValue() * 2;
				if (multi > 9) {
					multi = (multi % 10) + (multi / 10);
				}
				listaUmnozaka.add(multi);
			}

			if (i % 2 == 0) {
				suma += listaCifri.get(i).longValue();
			}
		}

		long suma2 = 0;// Variable to store summ of multiplied values
		// Loop to sumarize multiplied values
		for (int k = 0; k < listaUmnozaka.size(); k++) {
			suma2 += listaUmnozaka.get(k).longValue();
		}

		long sumRezult = suma + suma2;

		if (sumRezult % 10 == 0 && listaCifri.size() >= 13 && listaCifri.size() <= 16
				&& prefixMatched(number, 1) == true) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			// Prompting user to enter values to be processed
			System.out.println("Unesite broj vase kartice: ");
			long card = input.nextLong();

			// When conditions are met message is printed for the user
			if (isValid(card)) {
				System.out.println("Kartica je validna.");
			} else {
				System.out.println("Kartica nije validna.");
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
