package Java_project_phase2;

import java.util.ArrayList;

public interface Configuration {

	public ArrayList<Vehicle>Cars = new ArrayList<Vehicle>();
	ArrayList<Slots>slots = new ArrayList<Slots>() ;
	Slots slot=null;
	Show r= new Show();
	TotalIncome q=new TotalIncome();
	TotalVehicles z=new TotalVehicles();
	FeesCalculation d=new FeesCalculation();
	
public void PickUp();
}
