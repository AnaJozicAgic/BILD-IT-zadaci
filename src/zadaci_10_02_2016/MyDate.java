package zadaci_10_02_2016;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
	int day;
	int month;
	int year;

	//constructor for curent date
	public MyDate() {

		Date today = new Date(System.currentTimeMillis());
		this.day = today.getDate();
		this.month = today.getMonth();
		this.year=today.getYear();

	}
	//constructor for specific elapsed time
	public MyDate(long specificMillis) {
		super();
		Date today = new Date(specificMillis);
		this.day = today.getDate();
		this.month = today.getMonth();
		this.year=today.getYear();
	}

	//constructor for specific date,month,year
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//getters

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	//method to set date
	
	public Date setDate(long elapsedMillis){
		Date today = new Date(elapsedMillis);
		this.day = today.getDate();
		this.month = today.getMonth();
		this.year=today.getYear();
		return today;
	}
	//toString method
	@Override
	public String toString() {
	Date today= new Date(year, month, day);
	DateFormat s = new SimpleDateFormat("dd. MMM, yyyy");
		return s.format(today);
	}

}
