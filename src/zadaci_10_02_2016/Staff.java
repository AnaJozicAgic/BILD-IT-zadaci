package zadaci_10_02_2016;

public class Staff extends Employee{
	//data field
	String title;
	//constructors
	public Staff() {
		
	}
	public Staff(String title) {
		super();
		this.title = title;
	}
	//to string
	@Override
	public String toString() {
		return "Staff : \nTitle: " + title  ;
	}
	

}
