package Java_project_phase2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) 
	{
		System.out.println("For sign up do the following");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String w = input.nextLine();
		System.out.print("Enter your password: ");
		String d = input.nextLine();
		System.out.print("Enter your phone number: ");
		String z = input.nextLine();
		GrageOwner g=new GrageOwner(w,z,d);
		Configuration v;
		System.out.println(" ");
		System.out.println("1)First come first served");
		System.out.println("2)Best fit approach");
		System.out.println("Enter your configuration");
		
		int num = input.nextInt();
		switch (num) {
		  case 1:{
				 v=new FirstCome();
						v.PickUp();
		  }		
		    break;
		  case 2:{
					 v=new BestFit();
						v.PickUp();		
		  }
		  break;
		  default:
		    System.out.println("Wrong input");
     
		break;
}	
}
}
