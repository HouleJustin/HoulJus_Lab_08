/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description:Class which changes some functions from the
 * Base class and implements some functions from the IType interface.
 */
package Lab08A;

/**
 * Class which changes some functions from the Base class and implements some functions from the IType interface.o
 */
public class Derived extends Base implements IType{

    /**
     * Initializes a new Derived object which also outputs a string
     */
    public Derived(){
        System.out.println("Derived Constructor");
    }

    /**
     * Outputs a string
     */
    public void m1(){
        System.out.println("Derived.m1");
    }

    /**
     * Outputs a string
     */
    public void m3() {
        System.out.println("Derived.m3");
    }
}
