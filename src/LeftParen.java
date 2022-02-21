/************************************************************************************************
 * CLASS: LeftParen (LeftParen.java)
 *
 * DESCRIPTION
 * This class file represents a left parenthesis.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Represents a left parenthesis in the expression.
 */
public class LeftParen extends Parenthesis
{
	
	public LeftParen()
	{
	}
	
	/**
	 * Returns the normal precedence level of LeftParen which is highest at 5.
	 */
	@Override
	public int precedence()
	{
		return 5;
	}
	
	/**
	 * Returns the precedence level of LeftParen when on it is on the operator stack, it is lowest at 0.
	 */
	@Override
	public int stackPrecedence()
	{
		return 0;
	}
	
}