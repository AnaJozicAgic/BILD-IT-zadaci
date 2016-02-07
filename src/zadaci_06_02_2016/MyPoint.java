package zadaci_06_02_2016;

public class MyPoint {
	//Data fields
private double x,y;

public MyPoint() {
	this.x=0;
	this.y=0;
	
}

public MyPoint(double x, double y) {
	super();
	this.x = x;
	this.y = y;
}

public double getX() {
	return x;
}

public double getY() {
	return y;
}
//Get distance method1
public double distance(MyPoint a){
	double distance= Math.sqrt(((getX()-a.x)*(getX()-a.x))+((getY()-a.y)*(getY()-a.y)));
	return distance;	
}
//Get distance method2
public double distance(double x, double y){
	double distance= Math.sqrt(((getX()-x)*(getX()-x))+((getY()-y)*(getY()-y)));
	return distance;
}

}
