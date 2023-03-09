package Java_project_phase2;

import java.util.ArrayList;

public class Slots {
	private int width;
	private int depth;
	private boolean isavailable;
	private int numOfslots;
	private String durationParked;
	private int num;
	private long startTime; 
	private long EndTime; 
	private static final double fee = 1.25;
	private static final int minimumTime = 15;
	private double totalFee = 0;
	private static double income;
	int timeInMinutes;
    int n;
    public ArrayList<Slots>slots = new ArrayList<Slots>();
	public ArrayList<Vehicle>Cars = new ArrayList<Vehicle>();
	Slots a;
    Slots slot=null;
	//Scanner input = new Scanner(System.in);
	public Slots()
	{
	}
	public Slots(int numberSlots,boolean av) {
		numOfslots = numberSlots; 
		isavailable=av;
	}
	public Slots(int numberSlots,boolean av,int n) {
		numOfslots = numberSlots; 
		isavailable=av;
		num=n;
	}
	public int getSlotnum()  
	{  
	return numOfslots;  
	}
	public int getnum()  
	{  
	return num;  
	}
	public void setnum(int n) {
		num=n;
	}
	public void setSlotnum(int slotNumber) {
		numOfslots = slotNumber;
	}
	public boolean getAvailable() {
		return isavailable;
	}

	public void setAvailable(boolean av) {
		isavailable=av;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return EndTime;
	}
	public void setEndTime(long EndTime) {
		this.EndTime = EndTime;
	}
	public void captureStartTime()
	{
		// capture end time
		startTime = System.currentTimeMillis();
	}
	public void captureEndTime()
	{
		// capture end time
		EndTime = System.currentTimeMillis();
	}
	public Slots Available()
	{
		for(int i = 0; i < slots.size(); i++)
		{
			slot = slots.get(i);
			if(slot.getAvailable() == true)
			{
				return slot;
			}
		}
		return null;
	}

	public Slots checkAvailability()
 	{
 		for(int i = 0; i < slots.size(); i++)
 		{
 			slot= slots.get(i);
 			
 			// check availability
 			if(slot.getAvailable() == true)
 			{
 				return slot;
 			}
 		}
 		return null;
 	}
}
