//**************************************************************************************************************
// CLASS: Operand
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************

/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
    private double mValue;

    public Operand(double pvalue)
    {
        setValue(pvalue);
    }

    public double getValue()
    {
        return mValue;
    }

    public void setValue(double pvalue)
    {
        mValue = pvalue;
    }

}
