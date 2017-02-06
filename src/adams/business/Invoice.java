package adams.business;

import java.util.ArrayList;

public class Invoice
{
	private final double COST_CREDIT_HOUR = 61.50; // per credit hour
	private final double STUDENT_SERVICE_FEE = 1.50; // per credit hour
	private final double GRADUATION_FEE = 25.00; // flat fee
	
	private ArrayList<LineItem> lineItems;
	
	public Invoice()
	{
		lineItems = new ArrayList<LineItem>();
	}

	public ArrayList<LineItem> getLineItems()
	{
		return lineItems;
	}

	public void addLineItem(LineItem lineItem)
	{
		this.lineItems.add(lineItem);
	}
	
	public double getTotal(double hours)
	{
		double total =  hours * COST_CREDIT_HOUR;
			   total += hours * STUDENT_SERVICE_FEE;
			   total += GRADUATION_FEE;
			
		return total;
	}
}
