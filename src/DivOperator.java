/************************************************************************************************
 * CLASS: DivOperator (DivOperator.java)
 *
 * DESCRIPTION
 * Class file responsible for performing division operations on two operands.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Represents the division operator which is a specific type of binary operator.
 */

public class DivOperator extends BinaryOperator
{
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand)
    {
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence()
    {
        return 3;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence()
    {
        return 3;
    }
}