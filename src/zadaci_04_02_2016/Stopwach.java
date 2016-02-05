package zadaci_04_02_2016;

public class Stopwach {
	// Data fields
	private long startTime;
	private long endTime;

	// Constructor to initialize start time
	public Stopwach() {
		startTime = System.currentTimeMillis();
	}

	// getters and setters
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	// Method to start counting time
	public long start() {
		long start = getStartTime();
		return start;

	}

	// Method to stop counting time
	public long stop() {
		long stop = System.currentTimeMillis();
		setEndTime(stop);
		return stop;

	}

	// Method to return elapsed time
	public long getElapsedTime() {
		long elapsedTime = stop() - start();
		return elapsedTime;
	}

}
