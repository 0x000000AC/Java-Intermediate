/*****************************************************************************
* Mouse.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. Overly, this program along with Mammal, Cat, and 
*	ClarkAaronWeek5CatMouse.java (which is the driver class) simulates a 
*	battle between a cat and mice.  This class is a subclass of the Mammal
*	superclass.  The methods for this class are described in block comments below
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 17 Feb 13	
* Last Change: 17 Feb 13
******************************************************************************/

import java.util.Random;
import java.util.ArrayList;

public class Mouse extends Mammal 
{
    static Random r;
    
	/*******************************************************************
	*  Constructor for mouse instantiation.  Randomly chooses sex and 
	*  assigns isMale as appropriate.  Set age to 1. Set weight to 1.
	********************************************************************/
    
    public Mouse() 
	{
        r = new Random();
        this.setSex(r.nextBoolean());
        this.setAge(1);
        this.setWeight(1.0);
    }
    
	/*******************************************************************
	*  Grow method.  Increase age of mouse by 1 and weight of mouse
	*  by 1% of current weight.
	********************************************************************/
    
    public void grow()
	{
        super.grow();
        double weight=this.getWeight();
        weight += weight * 0.01;
        this.setWeight(weight);       
    }
   
    /*******************************************************************
	*  Mate method: Static method, recieve mouse arraylist as an argument
	*  Randomly choose 2 mice objects from arraylist and if conditions
	*  are correct, proceed with mating.  
	*	Conditions:
	*   -	1 male, 1 female
	*	-	Both mice older than 1 day
	*	-	If successful mating, randomly create between 0-4 mice and
	*		append to arraylist received as argument.
	********************************************************************/
    
    public static void mate(ArrayList<Mouse> mice)
	{
        Mouse m1 = mice.get(r.nextInt(mice.size()));
        Mouse m2 = mice.get(r.nextInt(mice.size()));
       
		boolean male = m1.getSex();
		boolean female = m2.getSex();
        
        if((!male && female) || (male && !female))
        {
            if((m1.getAge() >= 1 ) && (m2.getAge() >= 1))
            {
                // If they mate, add 0 - 4 mice to the array
                int num = r.nextInt(5);
                
                for(int i = 0; i<num; i++)
                {
                    mice.add(new Mouse());
                } // end for i
            }
        }
    } // end mate method  

} //end Mouse class