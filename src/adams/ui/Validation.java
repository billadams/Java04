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
        String s = sc.nextLine();        // read the whole line
        return s;
    }

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
    			columns = dateEntered.split("/");
    			int i = Integer.parseInt(columns[2]);
    			if (i < 16)
    			{
    				throw new DateOutOfRangeException();
    			}
	    		date = LocalDate.parse(20 + columns[2] + "-" + columns[0] + "-" + columns[1]);
	    		
	    		isValid = true;
    		} catch (DateTimeException e)
    		{
    			System.out.println("Error! Please enter a valid date.");
    		} catch (ArrayIndexOutOfBoundsException e)
    		{
    			System.out.println("Error! Please enter the date in the correct format.");
    		}
    		
    	}
    	   	
    	return date;
    	
//    	String[] months = { "January", "February", "March", "April", "May", "June", 
//    			            "July", "August", "September", "October", "November", "December" };
//    	
//    	int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    }
 }