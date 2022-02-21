/************************************************************************************************
 * CLASS: Operand (Operand.java)
 *
 * DESCRIPTION
 * This class is the representation of the value of a double floating-point number.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

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
