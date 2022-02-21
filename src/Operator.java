/************************************************************************************************
 * CLASS: Operator (Operator.java)
 *
 * DESCRIPTION
 * This is the superclass encompassing all operators below it.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token
{
	
	public Operator()
	{
	}
	
	abstract boolean isBinaryOperator();
	
	abstract int precedence();
	
	abstract int stackPrecedence();
}