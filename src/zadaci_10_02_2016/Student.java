package zadaci_10_02_2016;

public class Student extends Person {
	//data fields
	private final static String[] CLASS_STATUS={"Freshman","Sophmore","Junior","Senior"};
	public static int poz=0;
	Student(int onThisYear){
		Student.poz=onThisYear-1;
	}
	//method to get class status
	public static String getClassStatus() {
		String status=CLASS_STATUS[poz];
		return status;
	}
	//to string
	@Override
	public String toString() {
		return "Student: \nName;" + getName() + "\nAdres: " + getAdres() + "\nEmailAdres: " + getEmailAdres()
				+ "\nPhoneNumber:" + getPhoneNumber() + "\nClass status: "+getClassStatus();
	}


	
	
}
