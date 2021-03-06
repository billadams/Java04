package adams.ui;

import java.time.*;
import java.util.Scanner;

import adams.business.DateOutOfRangeException;

public class Validation
{
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void displayNewLine() 
    {
        System.out.println();
    }

    public static void display(String string) 
    {
        System.out.println(string);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    /**
     * @param string prompt
     * @return integer
     */
    public static int getInt(String prompt) 
    {
        boolean isValid = false;
        int i = 0;
        while (isValid == false) 
        {
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) 
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
        }
        return i;
    }

    /**
     * @param string prompt
     * @param integer min
     * @param integer max
     * @return integer
     */
    public static int getInt(String prompt, int min, int max) 
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) 
        {
            i = getInt(prompt);
            if (i <= min) 
            {
                System.out.println(
                        "Error! Number must be greater than " + min);
            } else if (i >= max) 
            {
                System.out.println(
                        "Error! Number must be less than " + max);
            } else 
            {
                isValid = true;
            }
        }
        return i;
    }

    /**
     * @param string prompt
     * @return double
     */
    public static double getDouble(String prompt) 
    {
        boolean isValid = false;
        double d = 0;
        while (isValid == false) 
        {
            System.out.print(prompt);
            try 
            {
                d = Double.parseDouble(sc.nextLine());
                isValid = true;                
            } catch (NumberFormatException e) 
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
        }
        return d;
    }

    /**
     * @param string prompt
     * @param double min
     * @param double max
     * @return double
     */
    public static double getDouble(String prompt, double min, double max) 
    {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) 
        {
            d = getDouble(prompt);
            if (d <= min) 
            {
                System.out.println(
                        "Error! Number must be greater than " + min);
            } else if (d >= max) 
            {
                System.out.println(
                        "Error! Number must be less than " + max);
            } else {
                isValid = true;
            }
        }
        return d;
    }
    
    /**
     * @param string prompt
     * @return date
     */
    public static LocalDate getDate(String prompt)
    {
    	String[] columns;
    	String dateEntered = "";
    	LocalDate date = null;
    	boolean isValid = false;
    	
    	while (isValid == false)
    	{
    		System.out.print(prompt);
    		dateEntered = sc.nextLine();
    		try
    		{	
    			// Split the date the user entered on the forward slash, then order it 
    			// to be properly parsed as a date object.
    			columns = dateEntered.split("/");
	    		date = LocalDate.parse(columns[2] + "-" + columns[0] + "-" + columns[1]);
	    		// TODO This needs to be more realistic.
	    		// Make sure the date entered isn't after today.
    			if (date.isAfter(LocalDate.now()))
    			{
    				throw new DateOutOfRangeException(); // Custom exception
    			}
    			
	    		isValid = true;
    		} catch (DateTimeException e)
    		{
    			System.out.println("Error! Please enter a valid date.");
    		} catch (ArrayIndexOutOfBoundsException e)
    		{
    			System.out.println("Error! Please enter the date in the correct format.");
    		} catch (DateOutOfRangeException e)
    		{
    			System.out.println("Error! Please enter a date in the past.");
    		}
    	}
    	   	
    	return date;
    }
 }