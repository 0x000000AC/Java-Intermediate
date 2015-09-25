/*****************************************************************************
* AaronClarkProg4.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. This driver estalishes two savings accounts, and will display
*	their interest over a 12-month period with a 5% annual interest.
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 10 February 13
* Last Change: 10 February 13
******************************************************************************/

public class AaronClarkProg4
{
	public static void main(String[] args)
	{
		// Variable and method initializations.  For-loop won't run without i init'd
		int i;
		SavingsAccount saver1 = new SavingsAccount(10002, 2000);
		SavingsAccount saver2 = new SavingsAccount(10003, 3000);
		
		// setRate method for each SavingsAccount Instantiation
		saver1.setRate();
		saver2.setRate();
		
		// Display the top of the table.
		System.out.println("Monthly balances for one year with 0.05 annual interest:\n");
		System.out.println("Month Account #   Balance Account #   Balance\n" +
									"----- ---------   ------- ---------   -------");

		// This loop cycles through 12 iterations to represent each month. 5% / 12 months.
		for(i=0; i<=12; i++)
		{
			System.out.printf("   %2d     %4d   %.2f     %4d   %.2f \n",
			    i, saver1.getAccountNum(), saver1.getBalance(), saver2.getAccountNum(), saver2.getBalance());
			
			// Adds the interest accrued to each month to last month's balance.
			if(i!=12)
			{ 
				saver1.addMonthlyInterest();
				saver2.addMonthlyInterest();
			}
		}
		
	    // Adds the final balances for each account
		System.out.printf("\nFinal balance of both accounts combined: %.2f\n",
									(saver1.getBalance() + saver2.getBalance()));
		} // end main
} // end AaronClarkProg4 class