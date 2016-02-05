package zadaci_04_02_2016;

import java.util.Date;

public class Acount {
	//Defining data fields
	private int id=0;
	private double balance=0;
	private double anualIntrestRate=0;
	private Date dateCreated=new Date();
	
	Acount(){
		
	}
	//Constructor to initialize account with id and balance
	Acount (int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	//getters and setters for data fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnualIntrestRate() {
		return anualIntrestRate;
	}
	public void setAnualIntrestRate(double anualIntrestRate) {
		this.anualIntrestRate = anualIntrestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	//Method that calculates monthly intrest rate
	public double getMonthlyInterestRate(){
		double mounthlyIntrestRate=getAnualIntrestRate()/12;
		mounthlyIntrestRate/=100;
		return mounthlyIntrestRate;
		
	}
	//Method that calculates monthly interest amount
	public double getMonthlyInterest() {
		double monthlyIntrest= getBalance()*getMonthlyInterestRate();
		return monthlyIntrest;
	}
	//Method to reduce balance by amount
	public void withdraw(double amount){
		double newBalance=getBalance()-amount;
		setBalance(newBalance);	
	}
	//Method that increase balance by amount
	public void deposit(double amounth){
		double newBalance=getBalance()+amounth;
		setBalance(newBalance);
	}
	

}
