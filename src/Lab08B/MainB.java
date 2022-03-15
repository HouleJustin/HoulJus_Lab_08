/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Main class used to test the functions
 */
package Lab08B;

import java.util.ArrayList;

/**
 * Main class used to test the functions
 */
public class MainB {

    /**
     * code to test the functions
     *
     * @param args command line arguments
     */
    public static void main(String[] args){

        //Initialize the objects
        Calculator calculator = new Calculator();
        Square square = new Square();
        Cube cube = new Cube();
        SquareRoot squareroot = new SquareRoot();

        ArrayList<Number> list = new ArrayList<>();

        // fill in the arraylist from 0 to 10
        for(int i = 0; i < 11; i++){
            list.add(i);
        }

        //output results for squaring the values in the array
        for(int i = 0; i < list.size(); i++){
            System.out.println("Square of " + list.get(i) + " = " + calculator.apply(list, square).get(i));
        }

        System.out.println();

        //output results for cubing the values in the array
        for(int i = 0; i < list.size(); i++){
            System.out.println("Cube of " + list.get(i) + " = " + calculator.apply(list, cube).get(i));
        }

        System.out.println();
        //output results for square rooting the values in the array
        for(int i = 0; i < list.size(); i++){
            System.out.println("SquareRoot of " + list.get(i) + " = " + calculator.apply(list, squareroot).get(i));
        }
    }
}
