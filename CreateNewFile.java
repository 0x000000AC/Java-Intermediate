/*
	CreateNewFile.java
	
	This creates a new file.
	
	The program exists to show a situation where
	there is a checked exception and Java forces
	you to use try and catch.
	
	The program prompts the user for the name of a file
	that is to be created.  If the file exists already, 
	the program prints a "Sorry, file already exists"
	message.  If the file does not exist, it creates 
	the file.
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreateNewFile
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		String fileName; // user-specified filename
		File file;
		
		System.out.print("Enter file to be created: ");
		fileName = stdIn.nextLine();
		file = new File(fileName); // API Constructor call
		
		if (file.exists())
		{
			System.out.println("Sorry, file already exists.");
		}
		else
		{
			file.createNewFile();
			System.out.println(fileName + " created.");
		}
	} // end main
} // end CreatenewFile class