/************************************************************************************************
 * CLASS: RightParen (RightParen.java)
 *
 * DESCRIPTION
 * Class file responsible for representing a right parenthesis in the mathematical
 * expression.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis
{
	
	public RightParen()
	{
	}
	
	/**
	 * Right parentheses really don't have precedence since they are not pushed on the operator stack, but we
	 * have to override precedence() so we assign the lowest precedence level to RightParen.
	 */
	@Override
	public int precedence()
	{
		return 1;
	}
	
	/**
	 * See comments in precedence().
	 */
	@Override
	public int stackPrecedence()
	{
		return 1;
	}
	
}