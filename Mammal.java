/*****************************************************************************
* Mammal.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. Mammal.java is the superclass or the Mouse.java and Cat.java
*	classes.
*
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 17 Feb 13
* Last Change: 17 Feb 13
******************************************************************************/

public class Mammal 
{
	// Instance variables
	private String name;		
    private int age;			
    private double weight;		
    private boolean isMale;		
   
    /*******************************************************************
	*  Default constructor.  Sets the age to 1.
	********************************************************************/
    
    public Mammal() 
	{
        age = 1;
    }
    
	/*******************************************************************
	* Default grow method.  Increases the age of the mammal by 1.
	********************************************************************/
    
	public void grow()
	{
        age++;
    }
    
	/*******************************************************************
	*  Mutator methods.  Methods for each instance variable listed
	*  above (name, age, weight, isMale)
	********************************************************************/
    
    public void setName(String n)
	{
        name = n;       
    }
    
	public void setAge(int a)
	{
        age = a;
    }
    
	public void setWeight(double w)
	{
        weight = w;
    }
    
	public void setSex(boolean value)
	{
        isMale = value;
    }
    
	/*******************************************************************
	*  Accessor methods fro each instance variable above: Returns the
	*  variable as specified for the appropriate data.
	********************************************************************/
    
	public String getName()
	{
        return name;
    }
    public int getAge()
	{
        return age;
    }
    
	public double getWeight()
	{
        return weight;
    }
    public boolean getSex()
	{
        return isMale;
    }   

} //end of Mammal class