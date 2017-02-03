import java.text.NumberFormat;
import java.math.*;

public class Validation
{

//*****************************************
   public static boolean isStringPresent(String stringData)
   {
   	
	  	if(stringData.length() == 0)
		{
			System.out.println("A value must be present, please re-enter: \n");
			return false;
		}
		
		return true;
   }

//******************************************
	public static boolean isInteger(String intData, String fieldName)
	{
		try
		{
			int i = Integer.parseInt(intData);
			return true;
		}
		catch (NumberFormatException e)
		{
		    System.out.println(fieldName + " must be an integer. Please re-enter.");
			return false;
		}
	}
	
//******************************************

	public static boolean isWithinRangeInteger(String integerData, int min, int max, String title)
	{
		int i = Integer.parseInt(integerData);
		if (i < min | i > max)
		{
			System.out.println(title + " must be between " + min + " and " + max + ". " + " Please re-enter.");
			return false;
		}
		return true;
	}
  
   //************************************************** 
	
	public static boolean isDouble(String doubleData, String title)
	{
		try
		{
			double d = Double.parseDouble(doubleData);
			return true;
		}
		catch (NumberFormatException e)
		{
		    System.out.println(title + " must be a numeric value. Please re-enter.");
			return false;
		}
	}
	
//******************************************
	public static boolean isWithinRangeDouble(String doubleData, double min, double max, String title)
	{
		double d = Double.parseDouble(doubleData);
		if (d < min | d > max)
		{
			System.out.println(title + " must be between " + min + " and " + max + ". " + " Please re-enter.");
			return false;
		}
		return true;
	}
//**************************************************

   public static BigDecimal formatRound(double number)
   {
	    BigDecimal decimalRound  = new BigDecimal(number);    
	    return decimalRound = decimalRound.setScale(2, RoundingMode.HALF_UP);		
   }
//**************************************************************
 
 	public static String formatAndRound(double number)
 	{
	 	NumberFormat num = NumberFormat.getCurrencyInstance();//dollar sign
	 	//NumberFormat num = NumberFormat.getNumberInstance();//no dollar sign

		BigDecimal decimalRound  = new BigDecimal(number);
		return num.format(decimalRound = decimalRound.setScale(2, RoundingMode.HALF_UP));
    }
	 
 }