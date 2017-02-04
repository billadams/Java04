package adams.business;

public class LineItem
{
	private Tuition tuition;
//	private double costCreditHour;
//	private double studentServiceFee;
//	private double graduationFee;
	
	public LineItem()
	{
		this.tuition = new Tuition();
//		this.costCreditHour = 0;
//		this.studentServiceFee = 0;
//		this.graduationFee = 0;
	}
	
	public LineItem(Tuition tuition)
	{
		this.tuition = tuition;
	}
	
	public Tuition getTuition()
	{
		return tuition;
	}

	public double getTotal(double costCreditHour, double studentServiceFee, double graduationFee)
	{
		double hours =  tuition.getNumHours();
		double total =  hours * costCreditHour;
			   total += hours * studentServiceFee;
			   total += graduationFee;
			   
		return total;
	}
}
