package zadaci_05_02_20116;

public class LinearEquation {
	// creating data fields
	private double a, b, c, d, e, f;

	// initializing data fields
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// getters for the data fields
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// method to check if equation is solvable
	public boolean isSolvable() {
		double g = (getA() * getD()) - (getB() * getC());
		if (g != 0) {
			return true;
		} else {
			return false;
		}
	}

	// method to calculate x
	public double getX() {
		double x = (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
		return x;
	}

	// method to calculate y
	public double getY() {
		double y = (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
		return y;
	}
}
