package zadaci_29_01_2016;

public class PapirKamenMakaze {

	public static void provjera(int covjek, int racunar) {
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		try {
			// When condition is satisfied message is printed
			if (covjek == racunar) {
				System.out.println("Nerijeseno, pokusajte ponovo");

				covjek = input2.nextInt();
				while (covjek > 2) {
					System.out.println("Unijeli ste nepostojecu vrijednost, pokusajte ponovo");
					covjek = input2.nextInt();
				}
				racunar = (int) (Math.random() * 3);
				provjera(covjek, racunar);

			} else if (covjek == 0 && racunar == 1) {
				System.out.println("Kamen zamotan u papir, racunar pobjedjuje.");
			} else if (covjek == 0 && racunar == 2) {
				System.out.println("Kamen razbija makaze, vasa pobjeda.");
			} else if (covjek == 1 && racunar == 0) {
				System.out.println("Kamen zamotan u papir,vasa pobjeda.");
			} else if (covjek == 1 && racunar == 2) {
				System.out.println("Makaze rezu papir, racunar pobjedjuje.");
			} else if (covjek == 2 && racunar == 0) {
				System.out.println("Kamen razbija makaze, racunar pobjedjuje.");
			} else if (covjek == 2 && racunar == 1) {
				System.out.println("Makaze rezu papir, vasa pobjeda.");
			}

			System.out.println("Ako zelite nastaviti igru unesite 5 ili 4 da izadjete iz igre");

			int tip = input2.nextInt();
			while (tip == 5) {
				System.out.println("Unesite :\n" + "0- kamen\n" + "1- papir\n" + "2- makaze");
				int covjek2 = input2.nextInt();
				int racunar2 = (int) (Math.random() * 3);

				provjera(covjek2, racunar2);
				System.out.println("Ako zelite nastaviti igru unesite 5 ili 4 da izadjete iz igre");
				tip = input2.nextInt();

			}
			if (tip != 5) {
				System.out.println("Hvala sto ste se igrali! ");
				System.exit(1);
			}

		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}
		input2.close();
	}

	public static void main(String[] args) {
		java.util.Scanner unos = new java.util.Scanner(System.in);

		try {
			// Prompting user to decide on action
			System.out.println("Unesite :\n" + "0- kamen\n" + "1- papir\n" + "2- makaze");
			int covjek = unos.nextInt();
			// Loop so entered value would be one of offered values
			while (covjek > 2) {
				System.out.println("Unijeli ste nepostojecu opciju, pokusajte ponovo");
				covjek = unos.nextInt();
			}
			int racunar = (int) (Math.random() * 3);// Randomizing potential
													// value

			// invoking method to check if user won or if the computer won
			provjera(covjek, racunar);
		} catch (Exception e) {
			System.out.println("Doslo je do greske.");
		}

		unos.close();

	}

}
