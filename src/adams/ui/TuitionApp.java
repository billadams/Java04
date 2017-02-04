package adams.ui;

import adams.business.Invoice;
import adams.business.LineItem;
import adams.business.Tuition;

public class TuitionApp
{

	public static void main(String[] args)
	{
		Invoice invoice = new Invoice();
		
		getStudentInfo(invoice);
		displayInvoices(invoice);
	}
	
	public static void getStudentInfo(Invoice invoice)
	{
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			int id = Validation.getInt("Enter student id: ", 1, 99999);
			String firstName = Validation.getString("Enter student first name: ");
			String lastName = Validation.getString("Enter student last name: ");
			String email = Validation.getString("Enter student email: ");
			String dob = Validation.getString("Enter student date of birth: ");
			double numHours = Validation.getDouble("Enter number of credit hours taken: ");
			
			Tuition tuition = new Tuition(id, firstName, lastName, email, dob, numHours);
			invoice.addLineItem(new LineItem(tuition));
			
			choice = Validation.getString("Enter another record? (y/n): ");
			System.out.println();
		}
	}
	
	public static void displayInvoices(Invoice invoice)
	{
		for (LineItem lineItem : invoice.getLineItems())
		{
		Tuition tuition = lineItem.getTuition();
			System.out.println(tuition.toString());
		}
	}

}
