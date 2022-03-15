/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Takes in an object and calculates the square root value of that object
 */
package Lab08B;
import java.lang.Math;
import java.lang.Number;

/**
 * Takes in an object and calculates the square root value of that object
 */
public class SquareRoot implements OpClass{

    /**
     * default constructor
     */
    public SquareRoot(){}

    /**
     * Implements the Object function from OpClass
     * @param arg the object to be square rooted
     * @return the new square rooted value of the object
     */
    public Object op(Object arg) {

        // Cast arg as a Number
        Number number = (Number) arg;

        return (Object) Math.sqrt(number.doubleValue());
    }
}
