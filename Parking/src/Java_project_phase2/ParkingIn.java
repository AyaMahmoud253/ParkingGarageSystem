package Java_project_phase2;

import java.util.ArrayList;

public class ParkingIn {
	boolean parked;
	public ArrayList<Vehicle>Cars = new ArrayList<Vehicle>();
	Slots slot=null;
	public void parkIn(int num,Slots s) {
	       
	  	  s = s.checkAvailability(); // check for available slots
			
			if (s != null)
			{
	  		if(s.getnum()==num&& num<s.getSlotnum()-1)
	  		{
	  			//SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
	      		//Date date = new Date(System.currentTimeMillis());
	      		//System.out.println(formatter.format(date));
	  			s.setAvailable(false);
	  		}
			}
			//s.captureStartTime();
			}
}

