package Java_project_phase2;

public class ParkingOut {
	public void ParkOut(Slots s)
	{
		ParkingIn t=new ParkingIn ();
		    s.captureEndTime();
      		s.setAvailable(true);
      		TotalVehicles n=new TotalVehicles();
	}
}
