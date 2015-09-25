/***********************************************************************
* Title: AaronClarkProg1.java
* Description: 
*	This program is the driver for ACDissector.java and was created to
*	fill partial requirements for CS219 at Park University.  The basic
*	ideas is that this driver instantiates a new ACDissector object with
*	the input shown below.
*	
*	Expected output:
*	1:919:882:5000
*	5000
*	1
*	882
*	919
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 1/19/2013
* Last Change: 1/19/2013 
***********************************************************************/

public class AaronClarkProg1
{
	public static void main(String[] args)
	{
  		ACDissector phone = new ACDissector("1:919:882:5000"); // Instantiates a new ACDissector
  		System.out.println(phone.getPhoneNumber()); 	// calls no argument getPhoneNumber accessor in ACDissector class
  		System.out.println(phone.getPhoneNumber(4));	// returns the number: 5000
  		System.out.println(phone.getPhoneNumber(1));	// returns the country code: 1
  		System.out.println(phone.getPhoneNumber(3));	// returns the prefix
  		System.out.println(phone.getPhoneNumber(2));	// returns the area code
	} // end main
} // end class AaronClarkProg1