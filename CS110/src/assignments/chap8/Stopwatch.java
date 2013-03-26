package assignments.chap8;

import java.util.Date;

public class Stopwatch {
	
	private double startTime;
	
	private double endTime;
	
	public double start() {
		Date date = new Date();
		startTime = date.getTime();
		return startTime;
		
	}
	
	public double end() {
		Date date = new Date();
		endTime = date.getTime();
		return endTime;
	}
	
	public double getElapsedTime() {
		double elapsedTime = endTime - startTime;
		return elapsedTime;
	}

}
