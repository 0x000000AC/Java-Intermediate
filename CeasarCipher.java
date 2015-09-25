/*****************************************************************************
* CaesarCipher.java
* 
*	The idea is to build a complete program that performs a simple 
*	substitution cipher.  The program should take plain text and a shift value 
*	to produce encrypted text.  Then it should take encrypted text and a shift 
*	value to produce the plaintext once again.  
*
******************************************************************************/

import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class CaesarCipher
{
	//Private Instance variables for CaesarCipher Object
	private String userSecret;
	private int valueShift;
	
	/*******************************************************************
	*  Constructor that takes the user input string and shift value
	*  from main and assigns that input to instance variables.
	********************************************************************/
	
	public CaesarCipher(String uSec, int vSh)
	{
		// Make the user's input secret uppercase and remove all spaces
		this.userSecret = uSec.toUpperCase().replaceAll("\\s","");
		this.valueShift = vSh;
	}   
		
	/*******************************************************************
	*  This method displays the user's string in the encrpyted format
	*  when called from the main method.
	********************************************************************/
	
	public void printEncrypted()
	{
		System.out.println(encryptSecret(userSecret, valueShift));
    } 
	
	/*******************************************************************
	*  Two-input helper method.  Takes the user's input string and input
	*  shift value.  After it sets the value to shift left or right,
	*  it increments throgh each letter in the string and sends that
	*  letter to the encryptLetter helper method to be changed.
	********************************************************************/
	
	private String encryptSecret(String uSec, int vSh)
	{  
		if (vSh > 0) 
		{ 
			vSh = 26 - vSh; 	
		}  
		else if (vSh < 0)
		{
			vSh = 26 + (-vSh);
		}
		
		// Local variable.  Will be encrypted value after passed
		// to encryptLetter one char at a time in for loop below.
		String encrypted = ""; 
		
		/* Iterates through user input a char at a time
		   and passes each char to encryptLetter method to be 
		   shifted in Ascii value
		*/
		for (int i = 0; i < uSec.length(); i++) 
		{ 
			char ch = encryptLetter(uSec.charAt(i), vSh); 
			encrypted += ch; 
		}
		return encrypted; 
	} 
	
	/*******************************************************************
	*  Two-input helper method.  Takes the individual characters from
	*  the encryptSecret method and changes them to their encrypted values.
	*  Gets sent back to encryptSecret.
	********************************************************************/
	
	private char encryptLetter(char ch, int vSh) 
	{ 
		if (Character.isLetter(ch)) 
		{ 
			/* ch = (char) (ch + vSh);  Does not work.
			 The reason are the characters that are not letters but have 
			ascii values.  Let's say the user entered "E," Then,
			 65 + (69 - 65 + (-3) % 27 = 66 = B  If we want to restrict
			 to just A-Z for Ascii.
			*/
			ch = (char) ('A' + (ch - 'A' + vSh) % 26);
		}
		return ch; 
	} 
	
	/*******************************************************************
	*  Main method takes user input string along with a value that 
	*  performs an alphabetical substitution cipher.
	********************************************************************/
	
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in); // stdIn for encrypted string and shift
		Scanner stdIn2 = new Scanner(System.in); // stdIn2 for decrypted string and shift

		// First section that takes a string and shift value
		System.out.println("Please enter text to encrypt");
		String userString = stdIn.nextLine();
		System.out.println("Please enter shift value");
		int userShift = stdIn.nextInt();
		
		// Instantiate the CaesarCipher class with user entered values
		CaesarCipher secret = new CaesarCipher(userString, userShift);
		secret.printEncrypted();
			
		// Second section that takes a string and shift value
		System.out.println("Please enter text to decrypt");
		String userDecrypt = stdIn2.nextLine();
		System.out.println("Please enter shift value");
		int userShift2 = stdIn2.nextInt();
			
		// Instantiate a new CaesarCipher for the new values		
		CaesarCipher secret2 = new CaesarCipher(userDecrypt, userShift2);
		secret2.printEncrypted();
	} // end main
} // end CaesarCipher class
	
	