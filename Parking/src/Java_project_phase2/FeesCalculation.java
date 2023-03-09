package Java_project_phase2;

public class FeesCalculation {
	private String durationParked;
	private long startTime; 
	private long EndTime; 
	private static final double fee = 1.25;
	private static final int minimumTime = 15;
	public static double totalFee = 0;
	int timeInMinutes;
	FeesCalculation()
	{
		totalFee=0;
	}
	public void calculateTotalMinutes()
	{
		
		long durationMilliSeconds = EndTime- startTime; // total time the card was parked in the slot
		durationParked = convertTimeFormat(durationMilliSeconds);
		String [] time = durationParked.split(":");
		int hours = Integer.parseInt(time[0]);
		int minutes = Integer.parseInt(time[1]);
		int seconds = Integer.parseInt(time[2]);
		timeInMinutes = (hours * 60) + minutes + (seconds / 60);
	}
	public String convertTimeFormat(long milliSeconds) {
		// Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = milliSeconds / 1000;
	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;
	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;
	    // Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;
	    // Compute the current hour
	    long currentHour = totalHours % 24;
		
	    return currentHour + ":" + currentMinute + ":" + currentSecond;
	}
	public double getTotalFee()
	{
		if(totalFee == 0)
		{
			if (timeInMinutes < 15)
				totalFee = 1.25;
			else
				totalFee = (timeInMinutes / minimumTime) * fee;
		}
		
		return totalFee;
	
     
    }

}
