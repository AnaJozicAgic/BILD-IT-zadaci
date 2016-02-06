package zadaci_05_02_20116;

public class Fan {
	// data fields
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String collor = "blue";

	// no args
	public Fan() {

	}

	// getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	// Method for printing
	@Override
	public String toString() {
		if (on) {
			String ispis = getSpeed() + " " + getCollor() + " " + getRadius();
			return ispis;
		} else {
			return getSpeed() + " " + getCollor() + " " + getRadius() + " Fan is off";
		}
	}
}
