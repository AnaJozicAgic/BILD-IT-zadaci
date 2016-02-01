package zadaci_01_02_2016;

public class ASCII {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			//Array of Ascii code returns
			String ascii[] = { "NUL", "SOH", "STX", "ETX", "EOT", "ENQ", "ACK", "BEL", "BS", "HT", "LF", "VT", "FF", "CR",
					"SO", "SI", "DLE", "DC1", "DC2", "DC3", "DC4", "NAK", "SYN", "ETB", "CAN", "EM", "SUB", "ESC", "FS",
					"GS", "RS", "US", "(space)", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/",
					"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "D",
					"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
					"Z", "[", "\\", "]", "^", "_", " `", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
					"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "{", "|", "}", "~", "DEL" };
			
			//Prompting user to enter Ascii code
			System.out.println("Uesite ASCII code: ");
			int code = input.nextInt();
			//Loop so user enters value under 127
			while (code > 127) {
				System.out.println("Unijeli ste preveliku vrijednost. Pokusajte ponovo:");
				code = input.nextInt();
			}

			//Message for the user, symbol at code value
			System.out.println(ascii[code]);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}
	}

}
