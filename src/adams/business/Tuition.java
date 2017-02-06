package adams.business;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tuition
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dateOfBirth;
	private double numHours;
	private double totalTuition;

	public Tuition()
	{
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.dateOfBirth = null;
		this.numHours = 0.0;
		this.totalTuition = 0.0;
	}
	
	public Tuition(int id, String firstName, String lastName, String email,
			LocalDate dateOfBirth, double numHours)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.numHours = numHours;
		this.totalTuition = 0;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public double getNumHours()
	{
		return numHours;
	}

	public void setNumHours(double numHours)
	{
		this.numHours = numHours;
	}

	public double getTotalTuition()
	{
		return totalTuition;
	}

	public void setTotalTuition(double totalTuition)
	{
		this.totalTuition = totalTuition;
	}

	public static BigDecimal formatRound(double number)
	{
		BigDecimal decimalRound  = new BigDecimal(number);    
		return decimalRound = decimalRound.setScale(2, RoundingMode.HALF_UP);		
	}
	 
 	public static String formatAndRound(double number)
 	{
		NumberFormat num = NumberFormat.getCurrencyInstance();//dollar sign
		//NumberFormat num = NumberFormat.getNumberInstance();//no dollar sign
		
		BigDecimal decimalRound  = new BigDecimal(number);
		return num.format(decimalRound = decimalRound.setScale(2, RoundingMode.HALF_UP));
    }
	 	
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		s.append("ID: " + this.id + "\n");
		s.append("First name: " + this.firstName + "\n");
		s.append("Last name: " + this.lastName + "\n");
		s.append("Email: " + this.email + "\n");
		s.append("Date of birth: " + dtf.format(this.dateOfBirth) + "\n");
		s.append("Credit hours: " + this.numHours + "\n");
		s.append("Total tuition cost: " + formatAndRound(this.totalTuition) + "\n");
		
		return s.toString();
	}
}
