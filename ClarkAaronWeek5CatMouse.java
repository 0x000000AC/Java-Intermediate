/*****************************************************************************
* ClarkAaronWeek5CatMouse.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. The program simulates the battle between cat and mice.
*	ClarkAaronWeek5CatMouse.java is the driver class for the Mammal/Cat/Mouse
*	hierarchy.
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 17 Feb 13
* Last Change: 17 Feb 13
******************************************************************************/

import java.util.ArrayList;

public class ClarkAaronWeek5CatMouse
{
   public static void main(String[] args) 
   {
		// Instantiation of our Cat and Mouse objects 
		Cat sylvester = new Cat();
		ArrayList<Mouse> mice = new ArrayList<Mouse>();
        mice.add(new Mouse());
        mice.add(new Mouse());
        mice.add(new Mouse());
        mice.get(0).setSex(true);
        mice.get(1).setSex(false);
        mice.get(2).setSex(false);
       
        
        while (mice.size() > 1 && mice.size() < 10) 
        {
            for (Mouse m:mice)
                m.grow();
            sylvester.grow();
            Mouse.mate(mice);
            sylvester.eat(mice);        
        	
        		
        	System.out.println("Mice RULE, Cats Drool Mice Population: " + mice.size());
       		System.out.printf("Cats RULE, Mice Drool Cat Weight(in mice): %.2f\n", sylvester.getWeight());
        }
    
    } // end main
} // end class ClarkAaronWeek5CatMouse