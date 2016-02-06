package zadaci_05_02_20116;

public class QuadraticEquation {
//data fields
	private double a;
	private double b;
	private double c;
	//constructor to initialize data fields
	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
//getters for data fields
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	//method to calculate discriminant
	public double getDiscriminant(){
		double discriminant=(getB()*getB())-(4*(getA()*getC()));
		return discriminant;
	}
	//method to calculate root1
	public double getRoot1(){
		double r1=(-getB()+Math.sqrt(getDiscriminant()))/2*getA();
		if(getDiscriminant()<0){
			r1=0;
		}
		return r1;
	}
	//method to calculate root2
	public double getRoot2(){
		double r2=(-getB()-Math.sqrt(getDiscriminant()))/2*getA();
		if(getDiscriminant()<0){
			r2=0;
		}
		return r2;
	}
	
}
