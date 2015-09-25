/*
	LinePlot2.java
	
	This program plots a line as a series of user-specified
	line segments.
	
	This program expands on LinePlot, in that it handles when
	a user doesn't enter the correct values.
*/

import java.util.Scanner;

public class LinePlot2
{
	private int oldX = 0;  // oldX and oldY save previous point
	private int oldY = 0;  // starting point is the origin (0,0)
	
	//*******************************************
	
	// This method prints description of a line segment from the 
	// previous point to the current point
	
	public void plotSegment(int x, int y)
	{
		System.out.println("New segment = (" + oldX + "," + oldY +
		 ") - (" + x + "," + y + ")");
		 oldX = x;
		 oldY = y;
	} // end plotSegment
	
	//*******************************************
	
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		LinePlot2 line = new LinePlot2();
		String xStr, yStr;  // coordinates for point in String form
		int x, y; 			// coordinates for point
	
		System.out.print("Enter x & y coordinates (q to quit): ");
		xStr = stdIn.next();
		while (!xStr.equalsIgnoreCase("q"))
		{
			yStr = stdIn.next();
			try
			{
				x = Integer.parseInt(xStr); // this and the one below could generate runtime errors
				y = Integer.parseInt(yStr); 
				line.plotSegment(x, y);  // this has to be moved here so that it's executed only if input is valid
			}
			catch (NumberFormatException nfe)
			{
				System.out.println("Invalid entry: " + xStr + " " + yStr
					+ "\nMust enter integer space integer.");
			}
			
			
			System.out.print("Enter x & y coordinates (q to quit): ");
			xStr = stdIn.next();
		} // end while
	} // end main
} // end class LinePlot