/************************************************************************************************
 * CLASS: Parenthesis (Parenthesis.java)
 *
 * DESCRIPTION
 * This class file is the superclass for RightParen and LeftParen class files
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Parenthesis is the superclass of LeftParen and RightParen. These are treated as a weird sort of Operator
 * because we need to be able to push LeftParens on the operator stack when evaluating the expression.
 */
public abstract class Parenthesis extends Operator
{
	
	public Parenthesis()
	{
	}
	
	/**
	 * Parenthesiss are not really operators so return false.
	 */
	@Override
	public boolean isBinaryOperator()
	{
		return false;
	}
	
}