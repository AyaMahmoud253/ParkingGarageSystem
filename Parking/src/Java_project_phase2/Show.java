package Java_project_phase2;

import java.util.ArrayList;

public class Show {
	Show()
	{}
	 public ArrayList<Slots>slots = new ArrayList<Slots>();
		public ArrayList<Vehicle>Cars = new ArrayList<Vehicle>();
	   public void Display()
	 	{

	 		for(int i = 0; i < slots.size(); i++)
	 		{	
	 			if(slots.get(i).getAvailable()== true)
	 			{
	 			System.out.println("Slot("+slots.get(i).getnum()+") is available");
	 			System.out.println("with width="+slots.get(i).getWidth()+" and depth="+slots.get(i).getDepth());
	 			System.out.println(" ");
	 			}
	 		}
	 	}
	}

