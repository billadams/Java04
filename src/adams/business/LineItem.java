package adams.business;

public class LineItem
{
	private Tuition tuition;
	
	public LineItem()
	{
		this.tuition = new Tuition();
	}
	
	public LineItem(Tuition tuition)
	{
		this.tuition = tuition;
	}
	
	public Tuition getTuition()
	{
		return tuition;
	}
}
