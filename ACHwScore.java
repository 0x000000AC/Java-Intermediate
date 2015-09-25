/***********************************************************************************
* ACHwScore.java
* 
* Description: 
*	Intakes array of homework scores, divides earned points v. possible points
*	for each assignment as well as all entered assignments.  Contains methods
*	that return the calculated values.
*
*	Instance variables:
*		- earnedPoints - double, how many points one earned for an assignment
*		- possiblePoints - double, how many points an assignment was out of
*	Array constants:
*		- CUTOFFS - a double array of decimal values corresponding to letter grades
*		- LTRGRADE - a string array corresponding to lettergrades
*	Class variables:
*		- totalEarnedPoints - an addition of all points obtained
*		- PossiblePoints - an addition of all points that you could have obtained
*
*	Contructor:
*		- ACHwScore - Two parameter.  Handles initializations for earnedPoints
*					  and PossiblePoints instance variables.
*	
*	Methods:	
*		- printGrade - Returns grade on a case-by-case basis.
*		- printOverallGrade - Returns overall grade based on all entries
*		- earnedGrade - Helper, compares earned grade against letter/numeric
*						grade values.
* 
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 1/26/2013
* Last Change: 1/27/2013 
***********************************************************************************/

public class ACHwScore
{
	// Private Instance variables per assignment instructions
	private double earnedPoints;
	private double possiblePoints;
	
	// Array constants for letter grades per assignment instructions
	private static final double CUTOFFS[] = {.9,.8,.7,.6};
	private static final String[] LTRGRADES = new String[] {"A","B","C","D","F"};
	
	// Class variables that are needed to perform a task on the class
	private static double totalEarnedPoints;
	private static double PossiblePoints;
	
	/*******************************************************************
	*  Two-parameter constructor that handles initializations for
	*  earnedPoints and PossiblePoints instance variables
	********************************************************************/
	
	public ACHwScore(double eP, double PP)
	{
		this.earnedPoints = eP;
		this.possiblePoints = PP;
		
		//While you take each in, add for overall totals - hence class variables
		totalEarnedPoints += earnedPoints;
        PossiblePoints += possiblePoints;
	}   
		
	/*******************************************************************
	*  This should be a printGrade method that prints a particular
	*  homework's earned point, possible points, and letter grade.
	*  For the letter grade, it calles a helper method
	********************************************************************/
	
	public void printGrade()
	{
		System.out.println("On this homework, you earned " + earnedPoints +
                " out of " + possiblePoints + " possible points: " +
                earnedGrade(earnedPoints, possiblePoints));
    } 
		
	/*******************************************************************
	*  A class method named printOverallGrade that prints the overall
	*  earned points, overall possible points, and overall letter grade
	********************************************************************/
	
	public static void printOverallGrade() 
    {
        System.out.println("On all homework, you earned " + totalEarnedPoints +
                " out of " + PossiblePoints + " possible points: " +
                earnedGrade(totalEarnedPoints, PossiblePoints));
    } 
	
	/*******************************************************************
	*  A helper method that takes each instance value from the 
	*  ACHwScore constructor and compares score against numeric/letter grade
	********************************************************************/
	
	private static String earnedGrade(double eP, double PP) 
    {
    	int i = 0;
        for (;i<CUTOFFS.length;i++) 
        {
            if (eP/PP >= CUTOFFS[i])
            { 
            	return LTRGRADES[i];
            }
        }
        return LTRGRADES[i];
    } // end helper method earnedGrade
} // end class ACHwScore