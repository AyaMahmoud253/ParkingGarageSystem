package Java_project_phase2;
import java.util.Scanner;
public class FirstCome implements Configuration {
	public void PickUp()
	{
		System.out.println("Enter Number of slots");
		int n,num,choice;
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		int number = input.nextInt();		
		Slots obj[]= new Slots[number];
		ParkingIn v=new ParkingIn();
		ParkingOut m=new ParkingOut();
		for(int i=0;i<number;i++)
		{
			obj[i]=new Slots(number,true,i+1);
			obj[i].setAvailable(true);
			System.out.println("Enter width and depth of slot"+(i+1));
			int w = input.nextInt();
			int d = input.nextInt();
			obj[i].setWidth(w);
			obj[i].setDepth(d);
			r.slots.add(obj[i]);
		}
		boolean go=true;
      while(go)
		{
    	  System.out.println("1)Enter cars");
    	  System.out.println("2)Park out");
    	  System.out.println("3)Get number of vehicles");
    	  System.out.println("4)Display the available parking slots");
    	  System.out.println("5)Get Total income");
		System.out.println("6)Exit");
		System.out.println("Enter your choice");
		choice = input.nextInt();
		if(choice==1){
			System.out.println("Enter Number of cars that want to park in");
			 n = input.nextInt();
			 Vehicle cars[]= new Vehicle[n];
				for(int i=0;i<n;i++)
				{
					cars[i]=new Vehicle();
					cars[i].setparked(false);
					System.out.println("Enter ID of the car");
					int id = input.nextInt();
					cars[i].setID(id);
					System.out.println("Enter model name of the car "+cars[i].getID());
					String name = in.nextLine();
					cars[i].setModel_name(name);
					System.out.println("Enter model year of the car "+cars[i].getID());
					int y = input.nextInt();
					cars[i].setModel_year(y);
					System.out.println("Enter width and depth of the car "+cars[i].getID());
					int w = input.nextInt();
					int d = input.nextInt();
					cars[i].setWidth(w);
					cars[i].setDepth(d);
					r.Cars.add(cars[i]);
				}
				for(int i=0;i<number;i++)
				{
					if(obj[i].getAvailable()==true)
					{
						for(int j=0;j<n;j++){
					if((cars[j].getWidth()<=obj[i].getWidth()&&cars[j].getDepth()<=obj[i].getDepth())&&(cars[j].getparked()==false)&&(r.slots.get(i).getAvailable()==true))
					{
					v.parkIn(i, obj[i]);
					System.out.print("the Car "+r.Cars.get(j).getID());
					System.out.println(" is in slot "+r.slots.get(i).getnum());
					cars[j].setparked(true);
					obj[i].setAvailable(false);
					break;
					}
					if(r.slots.get(0).getAvailable()==true)	
					{i=0;}
					}
					}

				}
				}
		else if(choice==2)
		{
			System.out.println("Enter the slot number:");
			 num= input.nextInt();
			for(int i=0;i<number;i++)
			{
				if(obj[i].getAvailable()==false&&obj[i].getnum()==num)
				{
				m.ParkOut(obj[i]);
					obj[i].captureEndTime();
					System.out.println("The fee for this car is: "+d.getTotalFee());
									}
		}
		}
		else if(choice==3)
		{
			for(int i=0;i<number;i++)
			{
			z.getNumVehicles(obj[i]);
				}
			System.out.println("Number of Vehicles is: "+z.v);
			z.v=0;
				}
		else if(choice==4)
		{
		r.Display();
		}
		else if(choice==5)
		{
			System.out.println("The total income ="+q.getIncome());
		}
		else if(choice==6)
		{
		go=false;
		System.out.println("The application is closed");
		}
		} 	
}
}


