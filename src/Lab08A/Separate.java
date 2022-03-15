/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Class which implements the IType functions
 */
package Lab08A;

/**
 * implements IType functions
 */
public class Separate implements IType{

    /**
     * Default constructor which outputs a string
     */
    public Separate(){
        System.out.println("Separate Constructor");
    }

    /**
     * outputs a string
     */
    public void m1(){
        System.out.println("Separate.m1");
    }

    /**
     * inplements the m2 function from IType
     * @param s part of the string to be printed
     */
    public void m2(String s) {
        System.out.println("From Separate: " + s);
    }

    /**
     * implements the m3 Function
     */
    public void m3() {
        System.out.println("Separate.m3");
    }
}
