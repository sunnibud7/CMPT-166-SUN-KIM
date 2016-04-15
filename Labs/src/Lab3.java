/** Lab 3
 * @author Sun Kim
 * This program will create a Panel demonstration with six different colored panels
 * Once he colors are clicked the panel will turn into the color that button specified. 
 * It will also have a clear button/ pull down menu "FIle/Quit" which will exit the program.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab3 extends JFrame implements ActionListener
{
	/** Set up the screen width and height*/
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	/** Initialize all the panels*/
	private JPanel redPanel;
	private JPanel orangePanel;
	private JPanel yellowPanel;
	private JPanel greenPanel;
	private JPanel bluePanel;
	private JPanel whitePanel;
	
	public static void main(String[] args)
	{
		Lab3 gui = new Lab3();
		gui.setVisible(true);
	}
	
	public Lab3()
	{
		super("Panel Demonstration");
		
		/**Sets the window Size*/
		setSize(WIDTH, HEIGHT);
		
		/** Closes the application when the x sign is closed*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** Sets the layout*/
		setLayout(new BorderLayout());
		JPanel biggerPanel = new JPanel();
		/**Sets up the Grid so there will be 6 blocks*/
		biggerPanel.setLayout(new GridLayout(1,6));

		/** Initializes the panels by making them white in the beginning*/
		redPanel = new JPanel();
		redPanel.setBackground(Color.WHITE);
		biggerPanel.add(redPanel);
		
		orangePanel = new JPanel();
		orangePanel.setBackground(Color.WHITE);
		biggerPanel.add(orangePanel);
		
		yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.WHITE);
		biggerPanel.add(yellowPanel);
		
		greenPanel = new JPanel();
		greenPanel.setBackground(Color.WHITE);
		biggerPanel.add(greenPanel);
		
		bluePanel = new JPanel();
		bluePanel.setBackground(Color.WHITE);
		biggerPanel.add(bluePanel);
		
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.LIGHT_GRAY);
		biggerPanel.add(whitePanel);
		
		add(biggerPanel, BorderLayout.CENTER);
		
		/** Initializes the Buttons that will change the color when clicked or initated the events*/
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLayout(new FlowLayout());
		
		JButton redButton = new JButton("Red");
		redButton.setBackground(Color.RED);
		redButton.addActionListener(this);
		buttonPanel.add(redButton);
		
		JButton orangeButton = new JButton("Orange");
		orangeButton.setBackground(Color.ORANGE);
		orangeButton.addActionListener(this);
		buttonPanel.add(orangeButton);
		
		JButton yellowButton = new JButton("Yellow");
		yellowButton.setBackground(Color.YELLOW);
		yellowButton.addActionListener(this);
		buttonPanel.add(yellowButton);
		
		JButton greenButton = new JButton("Green");
		greenButton.setBackground(Color.GREEN);
		greenButton.addActionListener(this);
		buttonPanel.add(greenButton);
		
		JButton blueButton = new JButton("Blue");
		blueButton.setBackground(Color.BLUE);
		blueButton.addActionListener(this);
		buttonPanel.add(blueButton);
		
		JButton whiteButton = new JButton("White");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(this);
		buttonPanel.add(whiteButton);
		
		/** Clears the whole screen by coloring everything white*/
		JButton clearButton = new JButton("Clear");
		clearButton.setBackground(Color.WHITE);
		clearButton.addActionListener(this);
		buttonPanel.add(clearButton);
		
		/**Adds the Drop down menu on top left corner*/
		JMenu quitMenu = new JMenu("File");
		JMenuItem close = new JMenuItem("Quit");
		close.addActionListener(this);
		quitMenu.add(close);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(quitMenu);
		setJMenuBar(menuBar);
				
		/** All buttons are in the South of the Panels*/
		add(buttonPanel, BorderLayout.SOUTH);
	}
	
	/** If and else statements for when the buttons are pressed*/
	public void actionPerformed(ActionEvent e)
	{
		String buttonString = e.getActionCommand();
		
		if (buttonString.equals("Red"))
		{
			redPanel.setBackground(Color.RED);
		}
		else if (buttonString.equals("Orange"))
		{
			orangePanel.setBackground(Color.ORANGE);
		}
		else if (buttonString.equals("Yellow"))
		{
			yellowPanel.setBackground(Color.YELLOW);
		}
		else if (buttonString.equals("Green"))
		{
			greenPanel.setBackground(Color.GREEN);
		}
		else if (buttonString.equals("Blue"))
		{
			bluePanel.setBackground(Color.BLUE);
		}
		else if (buttonString.equals("White"))
		{
			whitePanel.setBackground(Color.WHITE);
		}
		/** Changes every panels into white, clearing the whole screen*/
		else if (buttonString.equals("Clear"))
		{
			redPanel.setBackground(Color.WHITE);
			orangePanel.setBackground(Color.WHITE);
			yellowPanel.setBackground(Color.WHITE);
			greenPanel.setBackground(Color.WHITE);
			bluePanel.setBackground(Color.WHITE);
			whitePanel.setBackground(Color.WHITE);
		}
		/** If Quit is pressed, it exits the program*/
		else if (buttonString.equals("Quit"))
		{
			System.exit(0);
		}
		else
		{
			System.out.println("What did you do?!");
		}
		}
}
