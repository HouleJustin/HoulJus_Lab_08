/*
* Name: Justin Houle
* Date: 2022/03/15
* Description: Superclass which extends others
*/
package Lab08A;

/**
 * Superclass which extends others
 */
public class Base {
    private int counter = 0;

    /**
     * Initialize a new Base which outputs "Base constructor"
     */
    public Base(){
        System.out.println("Base constructor");
    }

    /**
     * increment a counter every time m1 is called
     */
    public void m1(){
        this.counter++;
        System.out.println(this.counter);
    }

    /**
     * Outputs a string
     * @param s a part of the string to be printed
     */
    public void m2(String s){
        System.out.println("from Base: " + s);
    }
}
