/*****************************************************************************
* AaronClarkProg7.java
* 
* Description: 
*	This program was created to fill partial requirements for CS219 at Park
*   University. This program tests the user's ability to memorize a sequence
*	of colors.
*	
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 3 Mar 13
* Last Change: 3 Mar 13
******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AaronClarkProg7 extends JFrame 
{
    private static final int WIDTH = 325;
	private static final int HEIGHT = 200;
	private final int ARRAYSIZE = 5; // Total size of the color Array, used for iterative purposes
	private int ColorNumber = 0; // Reference for color in the Array
	private String colors[] = {"red", "white", "yellow", "green", "blue"};
	
	private JLabel enterColor = new JLabel("Enter Color Number 1:");
    private JTextField answerBox = new JTextField(15);
    private JButton hintButton = new JButton("Hint");
  
	/**************************************************************************
	* Primary constructor for our GUI window.
	**************************************************************************/
	
	public AaronClarkProg7() 
	{
        setTitle("Memory Game");
		setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); 
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		add(enterColor);
		add(answerBox);
		add(hintButton);
		setVisible(true);
    }
    
	/**************************************************************************
	* Helper method to add actionListeners to the user input and hint button.
	* Also contains the information message that appears before the start
	* of the program.
	**************************************************************************/
	
	private void createContents()
	{
		ActionHandler action = new ActionHandler();
        answerBox.addActionListener(action);
        hintButton.addActionListener(action);
        
		/* Iterates through array to make a string for display in the info message
		   Local variable colorString will be displayed in the dialog.    */
		String colorString = "";
        for (int i = 0; i < ARRAYSIZE; i++) 
		{
            colorString += colors[i] + " ";
        }
        
		JOptionPane.showMessageDialog(this, "How good is your memory? \nTry to memorize this color sequence: \n\n " 
			+ colorString, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**************************************************************************
	* Inner class for event handling.  The overall if..else if is dependent
	* on action from either the hint button or the answerBox with nested
	* conditionals for respective actions in each.
	**************************************************************************/
    
	private class ActionHandler implements ActionListener
	{
        public void actionPerformed(ActionEvent e) 
		{
            if(e.getSource() == answerBox)
			{
				// String color is taken from users input
				String color = answerBox.getText();
				
				// So long as the box is not empty, do this stuff
				if (!color.isEmpty()) 
				{
					
					if (color.equalsIgnoreCase(colors[ColorNumber])) 
					{
						ColorNumber++;
						
						if (ColorNumber < ARRAYSIZE) 
						{
							// Resets the question box after each successfull guess
							enterColor.setText("Enter Color Number " + (ColorNumber+1) + ": ");
							answerBox.setText("");
						}
						else 
						{
                            // When all your guesses are corret, prompt user
                            answerBox.setVisible(false);
                            hintButton.setVisible(false);
                            enterColor.setText("Congratulations - your memory is perfect");
                        }
                    }
					else 
					{
						// If the guess is wrong, display fail message.
						answerBox.setVisible(false);
						hintButton.setVisible(false);
						enterColor.setText("Sorry - wrong color. Eat more antioxidants");
					}
				}
			}  
            else if(e.getSource() == hintButton)
            {
				answerBox.setText((colors[ColorNumber]).charAt(0)+"");
				answerBox.requestFocusInWindow(); // Puts cursor after hint letter
            } 
               
        } // end actionPerformed
    } // end ActionHandler
    
	/**************************************************************************
	* Main method.  Instantiates AaronClarkProg7
	**************************************************************************/
	
    public static void main(String args[]) 
	{
        new AaronClarkProg7();		
    } // end main

} // end AaronClarkProg7 class
