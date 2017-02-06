package adams.ui;

import java.time.LocalDate;

import adams.business.Invoice;
import adams.business.LineItem;
import adams.business.Tuition;

public class TuitionApp
{

	public static void main(String[] args)
	{
		Invoice invoice = new Invoice();
		
		// Start collecting information
		getTuitionInfo(invoice);
		
		// Once the user has entered all of the information,
		// display the results back on screen.
		displayTuition(invoice);
	}
	
	public static void getTuitionInfo(Invoice invoice)
	{
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y"))
		{
			int id = Validation.getInt("Enter student id: ", 1, 99999);
			String firstName = Validation.getString("Enter student first name: ");
			String lastName = Validation.getString("Enter student last name: ");
			String email = Validation.getString("Enter student email: ");
			LocalDate dob = Validation.getDate("Enter student date of birth (mm/dd/yyyy): ");
			double numHours = Validation.getDouble("Enter number of credit hours taken: ");
			
			Tuition tuition = new Tuition(id, firstName, lastName, email, dob, numHours);
			// Calculate the total cost of the tuition.
			tuition.setTotalTuition(invoice.getTotal(tuition.getNumHours()));
			
			// Add the current tuition object to the invoice collection.
			invoice.addLineItem(new LineItem(tuition));
			
			choice = Validation.getString("Enter another record? (y/n): ");
			System.out.println();
		}
	}
	
	public static void displayTuition(Invoice invoice)
	{
		for (LineItem lineItem : invoice.getLineItems())
		{
		Tuition tuition = lineItem.getTuition();
			System.out.println(tuition.toString());
		}
	}

}
