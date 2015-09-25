/*
	ConditionalLogic.java
	
	Shows how to use the Conditional Operator
*/

public class ConditionalLogic
{
	public static void main(String[] args)
	{
		int score = 58;
		boolean extraCredit = true;
		
		score += (extraCredit ? 2 : 0);
		System.out.println(
			"grade = " + ((score>=60) ? "pass" : "fail"));
	} // end main
} //  end ConditionalLogic class