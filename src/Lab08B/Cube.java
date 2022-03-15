/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Takes in an object and calculates the cube value of that object
 */
package Lab08B;
import java.lang.Math;
import java.lang.Number;

/**
 * Takes in an object and calculates the cube value of that object
 */
public class Cube implements OpClass{

    /**
     * default constructor
     */
    public Cube(){}

    /**
     * Implements the Object function from OpClass
     * @param arg the object to be cubed
     * @return the new cubed value of the object
     */
    public Object op(Object arg) {

        // Cast arg as a Number
        Number number = (Number) arg;

        return (Object) Math.pow(number.doubleValue(),3);
    }
}
