//**************************************************************************************************************
// CLASS: NegOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents the negation operator which is a specific type of unary operator.
 */

public class NegOperator extends UnaryOperator
{
    public NegOperator()
    {

    }
    @Override
    public Operand evaluate(Operand pOperand)
    {
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence()
    {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence()
    {
        return 4;
    }
}