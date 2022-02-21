/************************************************************************************************
 * CLASS: View (View.java)
 *
 * DESCRIPTION
 * This class creates the GUI part of the application, providing a window with
 * the text field, buttons, and the label containing the result from performing
 * operations.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener
{
	
	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 180;
	
	// Declare instance variables
	private JButton mClearButton;
	private JButton mEvaluateButton;
	private JTextField mInputText;
	private JButton mExitButton;
	private final Main mMain;
	private JLabel mResultLabel;
	
	/**
	 * View()
	 * <p>
	 * The View constructor creates the GUI interface and makes the frame visible at the end.
	 */
	public View(Main pMain)
	{
		// Save a reference to the Main object pMain in mMain.
		this.mMain = pMain;
		
		// PSEUDOCODE:
		// Declare and create a JPanel named panelLabel using the default FlowLayout layout manager.
		// Create mResultLabel as a JLabel initialized to the empty string ""
		// Add mResultLabel to panelLabel
		JPanel panelLabel = new JPanel();
		mResultLabel = new JLabel("");
		panelLabel.add(mResultLabel);
		
		// PSEUDOCODE:
		// Declare and create a JPanel named panelInput using the default FlowLayout layout manager.
		// Create mInputText as a JTextField initialized to 40 columns wide
		// Add mInputText to panelInput
		JPanel panelInput = new JPanel();
		mInputText = new JTextField(40);
		panelInput.add(mInputText);
		
		// PSEUDOCODE:
		// Create a JPanel named panelButtons using FlowLayout.
		// Create the Clear button mClearButton.
		// Make this View the action listener for mClearButton.
		// Add the  Clear button to the panel.
		// Repeat the three above statements for the Evalute button.
		// Repeat the three above statements for the Exit button.
		ActionListener actionListener = this; // Josh, double check this again later if having problems
		JPanel panelButtons = new JPanel();
		
		mClearButton = new JButton();
		mClearButton.addActionListener(actionListener);
		panelButtons.add(mClearButton);
		mEvaluateButton = new JButton();
		mEvaluateButton.addActionListener(actionListener);
		panelButtons.add(mEvaluateButton);
		mExitButton = new JButton();
		mExitButton.addActionListener(actionListener);
		panelButtons.add(mExitButton);
		
		// PSEUDOCODE
		// Create a JPanel named panelMain using a vertical BoxLayout.
		// Add some vertical glue to panelMain
		// Add panelLabel to panelMain.
		// Add panelInput to panelMain.
		// Add panelButtons to panelMain.
		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panelMain.add(panelLabel);
		panelMain.add(panelInput);
		panelMain.add(panelButtons);
		
		setTitle("Joshculator/Seanerator 1.0 (trial-version)");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panelMain);
		setVisible(true);
	}
	
	/**
	 * actionPerformed()
	 *
	 * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
	 *
	 * PSEUDOCODE:
	 * If the source of the event was mClearbutton Then
	 *     Call clear()
	 * ElseIf the source of the event was mEvalButton Then
	 *     Call evaluate()
	 * ElseIf the source of the event was mExitButton Then
	 *     Call exit() on mMain.
	 * End If
	 */
	@Override
	public void actionPerformed(ActionEvent pEvent)
	{
		if(pEvent.getSource() == mClearButton)
		{
			clear();
		}
		else if(pEvent.getSource() == mEvaluateButton)
		{
			evaluate();
		}
		else if(pEvent.getSource() == mExitButton)
		{
			mMain.exit();
		}
	}
	
	/**
	 * clear() is called when the Clear button is clicked. Set the text in mInputText and mResultLabel to the
	 * empty strings "".
	 */
	private void clear()
	{
		mInputText.setText("");
		mResultLabel.setText("");
	}
	
	/**
	 * evaluate() is called when the Evaluate button is clicked.
	 *
	 * PSEUDOCODE:
	 * Retrieve the text string from mInputText
	 * Declare and create an Expression object named expr passing the text string to the ctor
	 * Call expr.evaluate() and assign the return value a Double object named result
	 * Display result in mResultLabel (call toString on result)
	 */
	private void evaluate()
	{
		Expression expr = new Expression(mInputText.getText());
		Double result = expr.evaluate();
		mResultLabel.setText(result.toString());
	}
	
	/**
	 * messageBox()
	 * <p>
	 * Note that passing 'this' as the first arg causes the View to be the parent of the message
	 * dialog window, so the dialog will be centered in the middle of the View. If we pass 'null'
	 * as the argument, then the dialog does not have a parent frame and will be centered in the
	 * middle of the display.
	 */
	public void messageBox(String pMessage)
	{
		JOptionPane.showMessageDialog(this, pMessage, "Notice", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
