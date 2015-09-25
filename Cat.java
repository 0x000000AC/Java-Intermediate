/*****************************************************************************
* Cat.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University.  Overly, this program along with Mammal, Mouse, and 
*	ClarkAaronWeek5CatMouse.java (which is the driver class) simulates a 
*	battle between a cat and mice.  This class is a subclass of the Mammal
*	superclass.  The cat kills 1 mouse a day and does not reproduce.
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 17 February 13
* Last Change: 17 February 13
******************************************************************************/

import java.util.Random;
import java.util.ArrayList;

public class Cat extends Mammal 
{
    Random r; // Random variable must be created here to be used in eat method
    
	/*******************************************************************
	*  Empty Parameter Constructor.  Instantiates a cat object, but
	*  since there is no return for name, no need to create a this ref
	********************************************************************/
    
	public Cat() 
	{}
    
    /*******************************************************************
	*  eat method: (receives mouse arraylist as an argument).
	********************************************************************/
   
    public void eat(ArrayList<Mouse> mice)
    {
    	r = new Random();
    	int randNum = r.nextInt(100);
    	
    	if(randNum > 30) // 70% of the time
    	{
    		int ranNum2 = r.nextInt(mice.size());
		
			// Grab the random Mouse
        	Mouse m = mice.get(ranNum2);
		
			// Eat the random mouse
        	this.setWeight(this.getWeight() + m.getWeight());
		
			// Remove the mouse -- it has been "eaten"
       		 mice.remove(ranNum2);      

    	}
    } // end eat method  
    
	/*******************************************************************
	*  grow method: sets the cat's age to the current age + 1  
	*  Instructions say to use set and get instead of super for some
	*  reason.
	********************************************************************/
    
    public void grow() 
	{
		setAge(getAge()+1); 
	} // end grow method

} //end of Cat class