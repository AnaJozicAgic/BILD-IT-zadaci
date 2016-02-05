package zadaci_04_02_2016;

public class Location {
	// public data fields
	public int row = 0;
	public int column = 0;
	public double maxValue = 0;

	Location() {

	}

	// Constructor that initialize data fields
	public Location(int row, int column, double maxValue) {
		super();
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	// Method that finds the largest value in the array and its position
	public static Location locateLargest(double[][] a) {
		double max = 0;
		// finding max value
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		// finding position of the max value
		int red = 0;
		int kolona = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == max) {
					red = i;
					kolona = j;

				}
			}
		}

		// reseting data fields with new location
		Location t = new Location();
		t.row = red;
		t.column = kolona;
		t.maxValue = max;
		return t;

	}

}
