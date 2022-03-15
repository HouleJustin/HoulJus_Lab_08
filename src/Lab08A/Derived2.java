/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Class where it implements functions from Derived which extends the Base class
 */
package Lab08A;

/**
 * Class where it implements functions from Derived which extends the Base class
 */
public class Derived2 extends Derived{

    /**
     * Initializes a new Derived2 object which also outputs a String
     */
    public Derived2(){
        System.out.println("Derived2 Constructor");
    }

    /**
     * Override from base which outputs a string
     * @param s a part of the string to be printed
     */
    @Override
    public void m2(String s){
        System.out.println("From Derived2: " + s);
    }

    /**
     * outputs a string
     */
    public void m4(){
        System.out.println("Derived2.m4");
    }
}
