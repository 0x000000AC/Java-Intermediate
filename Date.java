/*****************************************************************************
* Date.java
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

public class Date 
{ 
	// Instance variables
	private int day;
	private int month; 
	private String error = null; 

	/*******************************************************************
	* 1-parameter Date constructor.  Recieves dateStr string parameter
	* and performs complete error checking on the given value.  If the
	* str is instantiated, it is instantiated without errors.
	********************************************************************/
	
	public Date(String date) 
	{  
		// Local variable to check for a slash
		int index = date.indexOf('/'); 
		
		if(index!= -1) 
		{ 
			// Check day and month for valid integers.
			String mon = date.substring(0,index); 
			String day = date.substring(index+1,date.length()); 

			try
			{ 
				setMonth(Integer.parseInt(mon)); 

				try
				{ 
					setDay(Integer.parseInt(day)); 

				} catch(Exception e) 
				  { 
						error = "invalid format - For input string - " + "\"" + day + "\""; 
				  } 
			} catch(Exception e) 
			 { 
				error = "invalid format - For input string - " + "\"" + mon + "\""; 
			 } 
		} 
		else 
		{
			error = "Invalid date format - " + date; 
		}
	} // end Date Constructor 

	/*******************************************************************
	* Mutator method which ensures month is between 1 and 12
	********************************************************************/

	public void setMonth(int m)
	{ 
		if(m > 0 && m < 13)
		{
			month = m; 
		}
		else
		{
			error = "Invalid month - " + m; 
		} 
	} // end setMonth method

	/*******************************************************************
	* Mutator method that ensures day is valid.
	********************************************************************/
	
	public void setDay(int d)
	{ 
		if(d <= 0)
		{
		  error = "Invalid day - " + d; 
		}
		else if(month == 2 && d > 29 ) 
		{
			error = "Invalid day - " + d; 
		}
		else if((month == 1 || month == 3 || month == 5 || month == 7 
			|| month == 8 || month == 10 || month == 12) && d > 31) 
		{
			error = "Inalid day - " + d; 
		}
		else if((month == 4 || month == 6 || month == 9 || month == 11) && d > 30) 
		{
			error = "Invlid day - " + d; 
		}
		else 
		{
			day = d; 
		}
	} // end setDay method

	/*******************************************************************
	* Accessor method that returns a month in string format.
	********************************************************************/

	public String getMonth()
	{ 
		// Local variable that will return month based on month int
		String mnthIntToStr = ""; 
		
		switch(this.month) 
		{ 
			case 1: 
				mnthIntToStr = "January"; 
				break; 
			case 2: 
				mnthIntToStr = "February"; 
				break; 
			case 3: 
				mnthIntToStr = "March"; 
				break; 
			case 4: 
				mnthIntToStr = "April"; 
				break; 
			case 5: 
				mnthIntToStr = "May"; 
				break; 
			case 6: 
				mnthIntToStr = "June"; 
				break; 
			case 7: 
				mnthIntToStr = "July"; 
				break; 
			case 8: 
				mnthIntToStr = "August"; 
				break; 
			case 9: 
				mnthIntToStr = "September"; 
				break; 
			case 10: 
				mnthIntToStr = "October"; 
				break; 
			case 11: 
				mnthIntToStr = "Novenber"; 
				break; 
			case 12: 
				mnthIntToStr = "December"; 
				break; 
		} 
		return mnthIntToStr; 
	} 

	/*******************************************************************
	* Accessor methods that return the day, month, and error value
	********************************************************************/

	public int getDay()
	{ 
		return day; 
	} 
	
	public int getMonthNumber()
	{ 
		return month; 
	} 

	public String getErrorMsg()
	{ 
		return error; 
	} 

} //end of Date class 


