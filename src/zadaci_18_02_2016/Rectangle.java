package zadaci_18_02_2016;

public class Rectangle extends GeometricObject{
	
		// data fields
		private double side1 = 1;
		private double side2 = 1;
	
		

		// constructors
		public Rectangle() {

		}

		public Rectangle(double side1, double side2) {
			super();
			this.side1 = side1;
			this.side2 = side2;
			
		}
		// getters

		public double getSide1() {
			return side1;
		}

		public double getSide2() {
			return side2;
		}

	

		// Calculating area
		public double getArea() {
			
			return side1 * side2;
		}

		// Calculating perimetar
		public double getPerimetar() {
			double p = 2*getSide1() + 2*getSide2() ;
			return p;
		}

		// To string
		@Override
		public String toString() {
			return "Rectangle: strana 1 = " + side1 + " strana 2 = " + side2 
					+ "\nPovrsina pravougaonika je: " + getArea() + "\nOpseg pravougaonika je: " + getPerimetar();
		}

	}
