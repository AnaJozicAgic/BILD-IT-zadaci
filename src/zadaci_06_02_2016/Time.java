package zadaci_06_02_2016;

import java.util.Date;

public class Time {
	private int hour;
	private int minute;
	private int second;

	// no arg constructor for the current time
	public Time() {
		Date sad = new Date(System.currentTimeMillis());
		this.second = sad.getSeconds();
		this.minute = sad.getMinutes();
		this.hour = sad.getHours();
	}

	// constructor for elapsed time
	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}

	// constructor for desired hour, minute and second
	public Time(int hour, int minute, int second) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	// getters
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	// set time method for calculating elapsed time
	public void setTime(long elapseTime) {
		// calculate seconds from entered millis
		int seconds = (int) elapseTime / 1000;
		// set seconds
		this.second = seconds % 60;
		// calculate minutes
		int minut = seconds / 60;
		// set minutes
		this.minute = minut % 60;
		// calculate hours
		int sat = minut / 60;
		// set hours
		this.hour = sat % 24;
	}

}
