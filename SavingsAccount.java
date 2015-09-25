/*****************************************************************************
* SavingsAccount.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. Used in conjuction with AaronClarkProg4 Driver class.  This 
*	class contains the methods necessary to track individual account numbers
*	and their balances paired interest rates.
*	
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 10 February 13
* Last Change: 10 February 13
******************************************************************************/

public class SavingsAccount
{
	// Class variable annualInterestRate
	private static double annualInterestRate;
	
	//Instance constants
	final private int ACCOUNT_NUMBER;
	private double balance;
	
	/*******************************************************************
	*  Two-parameter constructor to initialize instance variable 
	*  balance with a particular account number (instantiated in the driver)
	********************************************************************/
	
	public SavingsAccount(int account, double initialBalance)
	{
		this.ACCOUNT_NUMBER = account;
		this.balance = initialBalance;
	} 

	/*******************************************************************
	*  addMontlyInterest method to update the balance per account
	*  by adding(balance * annualInterestRate / 12) for the current balance
	********************************************************************/
	
	public void addMonthlyInterest()
	{
		balance = balance + (balance * annualInterestRate / 12);
	}   
	
	/*******************************************************************
	*  Class method that sets the annual interest rate, in this case
	*  The annual interest is 5%
	********************************************************************/
	
	public void setRate()
    {
		annualInterestRate = .05;
    }
	
	
	/*******************************************************************
	* These methods return the balance for a particular account number
	* and the account number after interest has been set and balance
	* calulated.
	********************************************************************/
	
	public double getBalance() 
	{
        return balance;
    }

	public int getAccountNum()
	{
		return ACCOUNT_NUMBER;
	}
	
} // end SavingsAccount class