package Java_project_phase2;

public class TotalIncome {
	public static double income;
	FeesCalculation a=new FeesCalculation();
	public double getIncome()
	{
		income+=a.totalFee;
		return income;
	}
	
}
