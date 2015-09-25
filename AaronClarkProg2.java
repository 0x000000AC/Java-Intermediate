/*****************************************************************************
* AaronClarkProg2.java
* 
* Description: 
*	This program is the driver for ACHwScore.java and was created to
*	fill partial requirements for CS219 at Park University.  The basic
*	ideas is that this driver instantiates a new ACDissector object with
*	student grade information and then displays what they earned paired
*	their overall grade for all assignments.
*	
*	
*	Sample Output: 
*  	On this homework, you earned 26.5 out of 30.0 possible points: B
* 	On this homework, you earned 29.0 out of 27.5 possible points: A
*  	On this homework, you earned 0.0 out of 20.0 possible points: F
*  	On this homework, you earned 16.0 out of 20.0 possible points: B
*  	On all homework, you earned 71.5 out of 97.5 possible points: C
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 1/26/2013
* Last Change: 1/27/2013 
******************************************************************************/

public class AaronClarkProg2
{
	public static void main(String[] args)
	{
		// Instantiate a new ACHwScore with the input values shown.
		ACHwScore[] hw = new ACHwScore[4];
		hw[0] = new ACHwScore(26.5,30);
		hw[1] = new ACHwScore(29,27.5);
		hw[2] = new ACHwScore(0,20);
		hw[3] = new ACHwScore(16,20);
		
		// Call the printGrade method to display earned grades.
		hw[0].printGrade();
		hw[1].printGrade();
		hw[2].printGrade();
		hw[3].printGrade();
		
		// Call the printOverallGrade method to see all scores combined.
		ACHwScore.printOverallGrade();       		
	} // end main
} // end class AaronClarkProg2 