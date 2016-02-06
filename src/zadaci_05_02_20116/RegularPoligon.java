package zadaci_05_02_20116;

public class RegularPoligon {
	//data fields
private int n=3;
private double side=1;
private double x=0;
private double y=0;
//no arg  constructor
public RegularPoligon() {
	
}
//constructor that initialize n of sides, side length, at position 0,0
public RegularPoligon(int n, double side) {
	super();
	this.n = n;
	this.side = side;
	this.x = 0;
	this.y = 0;
}
//constructor that initialize n of sides, side length, at specific position x,y
public RegularPoligon(int n, double side, double x, double y) {
	super();
	this.n = n;
	this.side = side;
	this.x = x;
	this.y = y;
}
//getters and setters
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public double getSide() {
	return side;
}
public void setSide(double side) {
	this.side = side;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}


public double getPerimetar(){
	//get perimeter method to calculate perimeter
	double perimetar=getN()*getSide();
	return perimetar;
}
public double getArea(){
	//method to calculate area
	double area=(getN()*(getSide()*getSide()))/(4*Math.tan(Math.PI/getN()));
	return area;
	
}

}
