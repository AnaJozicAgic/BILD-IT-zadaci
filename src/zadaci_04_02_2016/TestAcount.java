package zadaci_04_02_2016;

public class TestAcount {

	public static void main(String[] args) {

		// initializing account object
		Acount racun1 = new Acount(1122, 20000);
		// setting annual interest rate
		racun1.setAnualIntrestRate(4.5);
		// reducing balance
		racun1.withdraw(2500);
		// Increasing balance
		racun1.deposit(3000);

		// printing current balance, interest amount and date account is created
		System.out.println("Stanje racuna je: " + racun1.getBalance() + " \nMjesecna stopa je : "
				+ racun1.getMonthlyInterest() + " \nDatum kreiranja racuna je: " + racun1.getDateCreated());

	}

}
