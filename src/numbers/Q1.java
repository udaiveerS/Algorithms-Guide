package numbers;

//Given a time, calculate the angle between the hour and minute hands

public class Q1 {
	public static final int DEGREES_IN_CIRCLE = 360; 
	public static final int HOURS_ON_CLOCK = 12; 
	public static final int MINS_ON_CLOCK = 60; 

	public static int getAngle(int hour, int min ) {
		//calculate delta degree per hour 
		int stepHours = DEGREES_IN_CIRCLE/HOURS_ON_CLOCK; 
		//calculate delta degree per min 
		int stepMins = DEGREES_IN_CIRCLE/MINS_ON_CLOCK; 
		
		return Math.abs(stepHours*hour - stepMins*min); 
	}
	
	public static void main(String[] args) {
		int hour = 6;
		int min = 35;		
		System.out.println(getAngle(hour, min));
	}
}
