//**************************************************************************************************************
// CLASS: Expression
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * Represents an infix expression to be evaluated.
 */
public class Expression {

    /**
     * A queue which stores the tokens of the infix expression in the order in which they were input.
     */
    Queue<Token> mTokenQueue;

    /**
     * Expression(String)
     *
     * pExprStr is a string representing an infix expression, such as "(1 + 2) * -3". This ctor uses the
     * Tokenizer class to break the string into Token objects which are stored in the token queue instance
     * variable.
     *
     * PSEUDOCODE:
     * Create a new Queue<Token> object and pass it to setTokenQueue (this initializes mTokenQueue)
     * Declare and create a Tokenizer object named tokenizer passing pExprStr to the ctor
     * Declare a Token object named prevToken initialized to null
     * -- Read the first token
     * Declare a Token object named token and assign the return value from tokenizer.nextToken() to it
     * -- Keep reading tokens until tokenizer.nextToken() returns null
     * While token is not null Do
     *     -- Check for and handle the negation operator.
     *     If token instanceof SubOperator Then
     *         token = negationCheck(token, prevToken)
     *     End if
     *     -- Add the token to the queue.
     *     Call getTokenQueue().enqueue(token)
     *     prevToken = token
     *     -- Read the next token.
     *     token = call tokenizer.nextToken()
     * End While
     */
    ???

    /**
     * Evaluates the expression and returns the result as a Double.
     *
     * PSEUDOCODE:
     * Declare and create a Stack<Operator> object named operatorStack
     * Declare and create a Stack<Operand> object named operandStack
     * While mTokenQueue is not empty Do
     *     Declare and create a Token object named token assigning getTokenQueue().dequeue() to it
     *     If token instanceof Operand Then
     *         Push token onto the operand stack (type cast token to Operand)
     *     ElseIf token instanceof LeftParen Then
     *         Push token onto the operator stack (type cast token to LeftParen)
     *     ElseIf token instanceof RightParen Then
     *         While the operator on the top of the operator stack is not an instanceof LeftParen Do
     *             Call topEval(operatorStack, operandStack)
     *         End While
     *         Pop the top operator from the operator stack -- removes the LeftParen
     *     Else
     *         Declare Operator object named operator and assign token to it (type cast to Operator)
     *         While keepEvaluating(operatorStack, operator) is true Do
     *             Call topEval(operatorStack, operandStack)
     *         EndWhile
     *         Push operator onto the operator stack
     *     End If
     * End While
     * While the operator stack is not empty Do
     *     Call topEval(operatorStack, operandStack)
     * End While
     * Pop the top Operand from the operand stack and return its value (call getValue() on the Operand).
     */
    ???

    /**
     * Accessor method for mTokenQueue.
     */
    protected Queue<Token> getTokenQueue() {
        return mTokenQueue;
    }

    /**
     * Returns true when we need to pop the operator on top of the operator stack and evaluate it. If the stack
     * is empty, returns false since there is no operator to pop. Otherwise, return true if the operator on top
     * of the operator stack has stack precedence greater than or equal to the normal precedence of pOperator.
     */
    private boolean keepEvaluating(Stack<Operator> pOperatorStack, Operator pOperator) {
        if (pOperatorStack.isEmpty()) {
            return false;
        } else {
            return pOperatorStack.peek().stackPrecedence() >= pOperator.precedence();
        }
    }

    /**
     * Since the negation and subtraction operators look the same we can identify negation when:
     *
     * 1. The previous pToken is null (negation can be the first operator in an expression but sub cannot)
     * 2. Or if the previous pToken was a binary operator (sub cannot be preceded by another binary operator)
     * 3. Or if the previous pToken was a left parenthesis (sub cannot be preceded by a left paren)
     *
     * This method determines if pToken is really a negation operator rather than a subtraction operator, and if
     * so, will return a negation operator pToken. If pToken represents subtraction, then we simply return pToken.
     */
    private Token negationCheck(Token pToken, Token pPrevToken) {
        if (pPrevToken == null || pPrevToken instanceof BinaryOperator || pPrevToken instanceof LeftParen) {
            pToken = new NegOperator();
        }
        return pToken;
    }

    /**
     * Mutator method for mTokenQueue.
     */
    protected void setTokenQueue(Queue<Token> pTokenQueue) {
        mTokenQueue = pTokenQueue;
    }

    /**
     * topEval()
     *
     * Evaluates the "top" of the stack. If the top operator on the operator stack is a unary operator, we pop
     * one operand from the operand stack, evaluate the result, and push the result onto the operand stack. If
     * the top operator on the operator stack is a binary operator, we pop two operands from the operand stack,
     * evaluate the result of the operation, and push the result onto the operand stack.
     *
     * PSEUDOCODE:
     * Declare and create Operand object named right = Call pOperandStack.pop()
     * Declare and create Operator object named operator = Call pOperatorStack.pop()
     * If operator instanceof UnaryOperator Then
     *     Typecast operator to UnaryOperator and call evaluate(right) on it
     *     Push the returned Operand from the above statement onto the operand stack
     * Else
     *     Declare and create Operand object named left = Call pOperandStack.pop()
     *     Typecast operator to BinaryOperator and call evaluate(left, right) on it
     *     Push the returned Operand from the above statement onto the operand stack
     * End If
     */
    ???

}
