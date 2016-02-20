package zadaci_19_02_2016;

public class CircleComparable extends GeometricObject implements Comparable<CircleComparable>{

	double radius;

	// default radius
	CircleComparable() {
		radius = 1;

	}

	CircleComparable(double newRadius) {
		radius = newRadius;
	}
@Override
	// calculates area
	double getArea() {
		return radius * radius * Math.PI;
	}

	// getters and setters for radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (radius >= 0) {
			radius = newRadius;
		}
	}

	@Override
	public String toString() {
		return "CircleComparable [radius=" + radius + ", getArea()=" + getArea() + "]";
	}

	@Override
	public int compareTo(CircleComparable o) {
		
		
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		//Check if objects radii are equal
		if(obj.equals(radius)){
		return super.equals(obj);
		}else {
			return !super.equals(obj);
		}
	}

	

}
