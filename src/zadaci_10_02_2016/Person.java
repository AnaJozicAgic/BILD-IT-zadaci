package zadaci_10_02_2016;

public class Person {
	// data fields
	private String name;
	private String adres;
	private String emailAdres;
	private String phoneNumber;

	// constructors
	public Person() {

	}

	public Person(String name, String adres, String emailAdres, String phoneNumber) {
		super();
		this.name = name;
		this.adres = adres;
		this.emailAdres = emailAdres;
		this.phoneNumber = phoneNumber;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmailAdres() {
		return emailAdres;
	}

	public void setEmailAdres(String emailAdres) {
		this.emailAdres = emailAdres;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// to string overide
	@Override
	public String toString() {
		return "Person: \nName: " + name + "\nAdres: " + adres + "\nEmailAdres: " + emailAdres + "\nPhoneNumber: "
				+ phoneNumber;
	}

}
