package Java_project_phase2;

public class TotalVehicles {
	public int v=0;
	Vehicle n=new Vehicle();
	public void getNumVehicles(Slots w)
	{
		if(w.getAvailable()==false)
		{
			v+=1;
		}
	}
}
