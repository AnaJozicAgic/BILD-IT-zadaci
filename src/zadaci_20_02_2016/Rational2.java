package zadaci_20_02_2016;

import java.math.BigInteger;

public class Rational2 extends Number implements Comparable<Rational2>{

	// Data fields for numerator and denominator
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator =new BigInteger("1");
	private long[] r = new long[2];
	/** Construct a rational with default properties */

	public Rational2() {
		this(new BigInteger("0"),new BigInteger("1"));
	}


	public long[] getR() {
		this.r[0]= this.numerator.longValue();
		this.r[1]=this.denominator.longValue();
		return r;
	}

	public void setR(long[] r) {
		this.r = r;
	}


	public void setNumerator(BigInteger numerator) {
		this.numerator = numerator;
	}


	public void setDenominator(BigInteger denominator) {
		this.denominator = denominator;
	}


	/** Construct a rational with specified numerator and denominator */
	public Rational2(BigInteger numerator, BigInteger denominator) {
		long gcd = gcd(numerator.longValue(), denominator.longValue());
		String  y=""+(((denominator.longValue() > 0) ? 1 : -1) * numerator.longValue() / gcd);
		String z=""+(Math.abs(denominator.longValue()) / gcd);
		this.numerator = new BigInteger(y);
		this.denominator = new BigInteger(z);
	}

	/** Find GCD of two numbers */
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;

	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public Rational2 add(Rational2 secondRational) {
		long n = numerator.longValue() * secondRational.getDenominator().longValue() + denominator.longValue() * secondRational.getNumerator().longValue();
		String s =""+n;
		BigInteger a = new BigInteger(s);
		long d = denominator.longValue() * secondRational.getDenominator().longValue();
		String z=""+d;
		BigInteger t = new BigInteger(z);
		return new Rational2(a, t);
	}

	/** Subtract a rational number from this rational */
	public Rational2 subtract(Rational2 secondRational) {
		long n = numerator.longValue() * secondRational.getDenominator().longValue() - denominator.longValue() * secondRational.getNumerator().longValue();
		String s =""+n;
		BigInteger a = new BigInteger(s);
		
		long d = denominator.longValue() * secondRational.getDenominator().longValue();
		String z=""+d;
		BigInteger t = new BigInteger(z);
		return new Rational2(a, t);
	}

	/** Multiply a rational number by this rational */
	public Rational2 multiply(Rational2 secondRational) {
		long n = numerator.longValue() * secondRational.getNumerator().longValue();
		String s =""+n;
		BigInteger a = new BigInteger(s);
		long d = denominator.longValue() * secondRational.getDenominator().longValue();
		String z=""+d;
		BigInteger t = new BigInteger(z);
		return new Rational2(a, t);
	}

	/** Divide a rational number by this rational */
	public Rational2 divide(Rational2 secondRational) {
		long n = numerator.longValue() * secondRational.getDenominator().longValue();
		String s =""+n;
		BigInteger a = new BigInteger(s);
		long d = denominator.longValue() * secondRational.numerator.longValue();
		String z=""+d;
		BigInteger t = new BigInteger(z);
		return new Rational2(a, t);
	}

	@Override
	public String toString() {
		if (denominator.longValue() == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((Rational2) (other))).getNumerator() == null)
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return numerator.longValue() * 1.0 / denominator.longValue();
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo(Rational2 o) {
		if (this.subtract(o).getNumerator().longValue() > 0)
			return 1;
		else if (this.subtract(o).getNumerator().longValue() < 0)
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		//Checking big integer in rational2
		BigInteger a = new BigInteger("5");
		BigInteger b= new BigInteger("2");
		Rational2 c = new Rational2(a,b);
		System.out.println(c.doubleValue());
	}
}
