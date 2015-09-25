/*****************************************************************************
* ClarkAaronDateDriver.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. The idea is to create a class named Date that stores date
*	values and prints out the date in either a pure numeric format or a name
*	and number format.
*	
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 24 Feb 13
* Last Change: 24 Feb 13
******************************************************************************/

import java.util.Scanner; 

public class ClarkAaronDateDriver 
{ 
	public static void main(String args[])
	{ 
		// Initialize a Date class object for while loop.
		Date dateStr; 
		Scanner stdIn = new Scanner(System.in); 

		while(true) 
		{ 
			// Get the input date string as long as user doesn't enter 'q'
			System.out.print("Enter a date in the form mm/dd (q to quit): "); 
			String userInputDate = stdIn.next(); 
			
			if(userInputDate.equalsIgnoreCase("q")) 
			{	
				System.exit(0); 
			}
			
			// Instantiate the date object as long as user doesn't enter 'q'
			dateStr = new Date(userInputDate); 

			// If instantiated date is error free, print the result if errors, print error
			if((dateStr.getErrorMsg()) == null) 
			{ 
				System.out.println("0" + dateStr.getMonthNumber() + "/" + "0" +	dateStr.getDay()); 
				System.out.println(dateStr.getMonth() + " " + dateStr.getDay()); 
			} 
			else
			{
				System.out.println(dateStr.getErrorMsg()); 
			} 
		} // end while loop
	} // end main 
} // end ClarkAaronDateDriver class


