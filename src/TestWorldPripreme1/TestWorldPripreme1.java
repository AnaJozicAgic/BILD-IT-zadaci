package TestWorldPripreme1;

import java.sql.*;

public class TestWorldPripreme1 {
	// Method for inputing String line
	public static String nextLine() {
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		String argument = input2.nextLine();
		input2.close();
		return argument;
	}

	public static void provjera(int check, String query) throws SQLException {
		// Creating connection path
		Connection konekcija = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		// creating statement to execute query
		Statement izjava = konekcija.createStatement();
		if (check == 1) {
			// search thru city table
			System.out.println(
					"Unesite naziv grada koji vas interesuje ili kod drzave \nili Oblast u kojoj se grad nalazi ili broj stanovnika.");
			String grad = nextLine();

			query = "SELECT * FROM CITY WHERE Name = '" + grad + "' OR CountryCode = '" + grad + "' OR District = '"
					+ grad + "' OR Population = '" + grad + "';";

			//Executing query
			ResultSet povrat = izjava.executeQuery(query);

			while (povrat.next()) {

				System.out.println(String.format("%-26s ", "Kod :") + povrat.getString("CountryCode"));
				System.out.println(String.format("%-26s", "Naziv :") + povrat.getString("Name"));
				System.out.println(String.format("%-26s", "Oblast : ") + povrat.getString("District"));
				System.out
						.println(String.format("%-26s", "Ukupan  broj stanovnika : ") + povrat.getString("Population"));

				System.out.println();

			}

		} else if (check == 2) {
			// search thru Country table
			System.out.println(
					"Unesite naziv drzave koja vas interesuje\nili kod drzave ili naziv kontinenta na kojem se drzava nalazi\nili  ime predsjednika.");
			String drzava = nextLine();

			query = "SELECT * FROM Country WHERE Name ='" + drzava + "' OR Code='" + drzava + "' OR Continent ='"
					+ drzava + "'  OR HeadOfState='" + drzava + "';";
			//Executing query
			ResultSet povrat = izjava.executeQuery(query);

			while (povrat.next()) {

				System.out.println(String.format("%-26s", "Naziv Drzave : ") + povrat.getString("Name"));
				System.out.println(String.format("%-26s", "Kod : ") + povrat.getString("Code"));
				System.out.println(String.format("%-26s", "Kontinent : ") + povrat.getString("Continent"));
				System.out.println(String.format("%-26s", "Region : ") + povrat.getString("Region"));
				System.out.println(String.format("%-26s", "Povrsina : ") + povrat.getString("SurfaceArea"));
				System.out.println(String.format("%-26s", "Nezavisni od godine : ") + povrat.getString("IndepYear"));
				System.out.println(String.format("%-26s", "Broj stanovnika : ") + povrat.getString("Population"));
				System.out.println(
						String.format("%-26s", "Prosjecan Zivotni vijek : ") + povrat.getString("LifeExpectancy"));
				System.out.println(String.format("%-26s", "Predsjednik : ") + povrat.getString("HeadOfState"));
				System.out.println();

			}

		} else if (check == 3) {
			// search thru Language table
			System.out.println("Unesite eng. naziv jezika koja vas interesuje, \nili  kod drzave .");
			String jezik = nextLine();

			query = "SELECT * FROM countrylanguage WHERE Language = '" + jezik + "' OR CountryCode= '" + jezik + "' ;";
			//Executing query
			ResultSet povrat = izjava.executeQuery(query);

			while (povrat.next()) {

				System.out.println(String.format("%-26s", "Kod Drzave : ") + povrat.getString("CountryCode"));
				System.out.println(String.format("%-26s", "Jezik : ") + povrat.getString("Language"));
				System.out.println(String.format("%-26s", "Zvanican je : ") + povrat.getString("IsOfficial"));
				System.out
						.println(String.format("%-26s", "Pstotak zastupljenosti : ") + povrat.getString("Percentage"));
				System.out.println();

			}

		} else if (check == 4) {
			// exiting search
			System.exit(1);

		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String query = "";

		// exception handling
		try {

			// prompting user to start search
			System.out.println(
					"1 Unesite da bi pretrazili informacije o odredjenom gradu.\n2 Unesite da bi ste vidjeli informacije o odredjenoj drzavi.\n3 Unesite za informacije o odredjenom jeziku.\n4 Unesite za izlaz iz pretrazivanja. ");
			int check = input.nextInt();
			if (check < 1) {
				// Prompting user to enter proper value
				System.out.println("Unijeli ste pre malu vrijednost, pokusajte sa unosom vecim od 0.");
				check = input.nextInt();
			}
			// invoking check
			provjera(check, query);

		} catch (SQLException e) {
			System.out.println("Exception ocured.");

			main(args);
		} catch (Exception x) {
			main(args);
		} finally {
			input.close();

		}

	}

}
