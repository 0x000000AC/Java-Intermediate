/***********************************************************************
* Title: ACDissector.java
* Description: 
*	Stores the phone number as a colon separated string of numbers 
*	and as four separate pieces:
*		- colonSeparated "1:919:882:5000"
*		- countryCode - stored as a String could hold 001
*		- areaCode, prefix, number - stored as int
*		- countryCodeInt - stored as int

*	Constructor: 
*		ACDissector recieves one parameter, a colon-separated string
*		no error checking required.  Initializes the instance variables with 
*		appropriate values.  Must use String methods to extract individual sections
*		as strings and use parseInt to convert strings into int's
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 1/19/2013
* Last Change: 1/19/2013 
***********************************************************************/

public class ACDissector
{
	private String colonSeparated;  	// – a colon separated String. 
	private String countryCode; 		// – stored as a String as it could hold 001
	private int areaCode; 				// - an integer that stores the area code
	private int prefix; 				// - an integer that holds the hmx
	private int number; 				// - number – stored as int variables
	
	//*******************************************************************
		// Primary Constructor.  Takes string from driver and initializes
		// appropriate section variables. The substring method takes the 
		// index of the string as an input to give you a substring back
	
	public ACDissector(String a)
	{
		this.colonSeparated = a;
		this.number = Integer.parseInt(colonSeparated.substring(10));
		this.prefix = Integer.parseInt(colonSeparated.substring(6, 9));
		this.areaCode = Integer.parseInt(colonSeparated.substring(2, 5));
		this.countryCode = colonSeparated.substring(0,1);
	} 
	
	//*******************************************************************
		// getPhoneNumber accessor method with no input arguments. Returns input from 
		// the instantiated object in the driver.
		
	public String getPhoneNumber()
	{	
		return this.colonSeparated;
		
	} // end getPhoneNumber(no arguments)
	
	//*******************************************************************
		// getPhoneNumber accessor method with integer argument
		// Receives 1, 2, 3 or 4 from driver and returns parse portion of the number
		// NOTE: since this accessor returns a String you mus typcast ints as strings
		
	public String getPhoneNumber(int b)
	{
		switch(b)
		{
			case 4: return "" + number;
			case 1: return countryCode;
			case 3: return "" + prefix;
			case 2: return "" + areaCode;
			default: return "";
		}
	} // end getPhoneNumber(int arguments)
} // end ACDissector class