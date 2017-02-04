package adams.business;

public class Tuition
{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String dateOfBirth;
	private double numHours;
	private double totalTuition;

	public Tuition()
	{
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.dateOfBirth = "";
		this.numHours = 0.0;
		this.totalTuition = 0.0;
	}
	
	public Tuition(int id, String firstName, String lastName, String email,
			String dateOfBirth, double numHours)
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

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth)
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

	
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		
		s.append("ID: " + this.id + "\n");
		s.append("First name: " + this.firstName + "\n");
		s.append("Last name: " + this.lastName + "\n");
		s.append("Email: " + this.email + "\n");
		s.append("Date of birth: " + this.dateOfBirth + "\n");
		s.append("Credit hours: " + this.numHours + "\n");
		
		return s.toString();
	}

	
}
