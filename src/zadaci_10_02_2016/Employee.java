package zadaci_10_02_2016;

public class Employee extends Person {
	// data fields
	boolean ofice;
	String sallery;
	MyDate dateHyred;

	// constructors
	public Employee() {
		super();
	}

	public Employee(boolean ofice, String sallery, MyDate dateHyred) {
		super();
		this.ofice = ofice;
		this.sallery = sallery;
		this.dateHyred = dateHyred;
	}

	// getters and setters
	public boolean isOfice() {
		return ofice;
	}

	public void setOfice(boolean ofice) {
		this.ofice = ofice;
	}

	public String getSallery() {
		return sallery;
	}

	public void setSallery(String sallery) {
		this.sallery = sallery;
	}

	public MyDate getDateHyred() {
		MyDate date = new MyDate();
		date = dateHyred;
		return date;
	}

	public void setDateHyred(MyDate dateHyred) {
		this.dateHyred = dateHyred;
	}

	// to string
	@Override
	public String toString() {
		return "\nEmployee : \nName: " + getName() + "\nAdres: " + getAdres() + "\nEmailAdres: " + getEmailAdres()
				+ "\nPhoneNumber: " + getPhoneNumber() + "\nOfice: " + ofice + "\nSallery: " + sallery
				+ "\nDate Hyred: " + dateHyred;
	}

}
