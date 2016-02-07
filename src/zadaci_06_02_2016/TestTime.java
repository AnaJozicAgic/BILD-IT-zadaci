package zadaci_06_02_2016;

public class TestTime {

	public static void main(String[] args) {
	
		
		
		// first object
		Time curent = new Time();
		// Second object
		Time elapsed = new Time(555550000);
		// Message for the user
		System.out.println(
				"Trenutno vrijeme je " + curent.getHour() + " : " + curent.getMinute() + " : " + curent.getSecond());
		System.out.println("Proslo vrijeme za 555550000 milisecundi od \nponoci 1.01.1970. je:" + elapsed.getHour()
				+ " : " + elapsed.getMinute() + " : " + elapsed.getSecond());

	}

}
