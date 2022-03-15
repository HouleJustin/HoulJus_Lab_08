/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Takes in an object and calculates the squared value of that object
 */
package Lab08B;
import java.lang.Math;
import java.lang.Number;

/**
 * Takes in an object and calculates the squared value of that object
 */
public class Square implements OpClass{

    /**
     * default constructor
     */
    public Square(){};

    /**
     * Implements the Object function from OpClass
     *
     * @param arg the object to be squared
     * @return the new square value of the object
     */
    public Object op(Object arg) {

        // Cast arg as a Number
        Number number = (Number) arg;

        return (Object) Math.pow(number.doubleValue(),2);
    }
}
