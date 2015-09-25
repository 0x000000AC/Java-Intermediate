/*****************************************************************************
* Buttons.java
* 
* Description: 
* 
*	This program was created to fill partial requirements for CS219 at Park
*   University. This program tests the user's ability to memorize a sequence
*	of colors.Left button shifts buttons left, blue button turns BG blue,
*	reset is supposed to put everything back as it was.
*	
* Company: Park University
* Author: Aaron P. Clark
* Email: aaron.clark@park.edu
* Date: 10 Mar 13
* Last Change: 10 Mar 13
******************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buttons extends JFrame 
{
    private static final int WIDTH = 400;
	private static final int HEIGHT = 200;
	
	// lBorder and rBorder aren't actual buttons, but buffer regions.
	private JButton leftButton;
	private JButton blueButton;
	private JButton resetButton;
  	private JButton lBorder;
  	private JButton rBorder;
  	
  	private JPanel lPanel;
	private JPanel bPanel;
	private JPanel rPanel;
	private JPanel leftBorder;
	private JPanel rightBorder;
	
	/**************************************************************************
	* Primary constructor for our GUI window.
	**************************************************************************/
	
	public Buttons() 
	{
        setTitle("Buttons Window");
		setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createContents();
		setVisible(true);	
    }
    
	/**************************************************************************
	* Helper methods to add actionListeners to the buttons / place layouts
	**************************************************************************/
	
	private void createContents()
	{	
		setLayout(new GridLayout(1, 5));
		
		lBorder = new JButton();
		leftBorder = new JPanel(new FlowLayout());
		leftBorder.add(lBorder);
		lBorder.setVisible(false);
		
		leftButton = new JButton("Left");
		lPanel = new JPanel(new FlowLayout());
		lPanel.add(leftButton);
		leftButton.addActionListener(new ButtonListener());
		
		blueButton = new JButton("Blue");
		bPanel = new JPanel(new FlowLayout());
		bPanel.add(blueButton);
		blueButton.addActionListener(new ButtonListener());
		
		resetButton = new JButton("Reset");
		rPanel = new JPanel(new FlowLayout());
		rPanel.add(resetButton);
		resetButton.addActionListener(new ButtonListener());
		
		rBorder = new JButton();
		rightBorder = new JPanel(new FlowLayout());
		rightBorder.add(rBorder);
		rBorder.setVisible(false);		
		
		add(lBorder);
		add(lPanel);
		add(bPanel);
		add(rPanel);
		add(rBorder);
		
	}
		
	private void createAlternativeContents()
	{	
		setLayout(new GridLayout(1, 5));
		
		leftButton = new JButton("Left");
		lPanel = new JPanel(new FlowLayout());
		lPanel.add(leftButton);
		leftButton.addActionListener(new ButtonListener());
		
		blueButton = new JButton("Blue");
		bPanel = new JPanel(new FlowLayout());
		bPanel.add(blueButton);
		blueButton.addActionListener(new ButtonListener());
		
		resetButton = new JButton("Reset");
		rPanel = new JPanel(new FlowLayout());
		rPanel.add(resetButton);
		resetButton.addActionListener(new ButtonListener());
		
		add(lPanel);
		add(bPanel);
		add(rPanel);
		add(new JLabel()); // For adding empty space to the right of the buttons
		add(new JLabel()); // See ^ Comment	
	}
			
	/**************************************************************************
	* Inner class for event handling.  Moves buttons left, turns background
	* to blue, or resets to original position.  "Left" button calls 
	* createAlternativeContents() helper method to move the button positions.
	* "Blue" button sets the content pane and background to blue.
	* "Reset" button re-invokes the createContents() helper method so that to
	* get back to how things are at the start of the program.
	**************************************************************************/
    
	private class ButtonListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e) 
		{
            Container contentPane = getContentPane();
            
            //Get default window color as it may differ on different platforms
            //bPanel was chosen arbitrarily, it could have been any button       
            Color defaultColor = bPanel.getBackground(); 
        
            if(e.getSource() == leftButton)
			{
				getContentPane().removeAll();
				createAlternativeContents();
				setVisible(true);
            } 
            else if(e.getSource() == blueButton)
            {
            	setBackground(Color.BLUE);
            }
            else if(e.getSource() == resetButton)
            {
            	getContentPane().removeAll();
            	contentPane.setBackground(defaultColor);
            	setBackground(defaultColor);
            	createContents();
            	setVisible(true);
            }
               
        } // end actionPerformed
    } // end ActionHandler
    
	/**************************************************************************
	* Main method.  Instantiates Buttons GUI window.
	**************************************************************************/
	
    public static void main(String args[]) 
	{
        new Buttons();		
    } // end main
} // end Buttons class