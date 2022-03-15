/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Applies the OpClass objects
 */
package Lab08B;

import java.util.ArrayList;
import java.lang.Number;
import java.util.Iterator;

/**
 * Applies the OpClass objects
 */
public class Calculator {

    /**
     * Default constructor
     */
    public Calculator(){}

    /**
     * Calculates the square, cube or root of the values in an arraylist of Numbers
     *
     * @param numbers The arraylist of Numbers
     * @param calc the Opclass object which will either square, cube or root the values
     * @return a new arraylist of objects containing the new values
     */
    public ArrayList<Object> apply(ArrayList<Number> numbers, OpClass calc){

        ArrayList<Object> ob = new ArrayList<>();

        Iterator<Number> iter = numbers.iterator();

        while(iter.hasNext()){
          ob.add(calc.op((Object) iter.next()));
        }

        return ob;
    }
}
