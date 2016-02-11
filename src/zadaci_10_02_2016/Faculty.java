package zadaci_10_02_2016;

public class Faculty extends Employee {
	// data fields
	double officeHours;
	String rank;

	// constructors
	public Faculty() {

	}

	public Faculty(double officeHours, String rank) {
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// to string
	@Override
	public String toString() {
		return "Faculty : " + super.toString() + "\nOfficeHours: " + officeHours + "\nRank: " + rank;
	}

}
