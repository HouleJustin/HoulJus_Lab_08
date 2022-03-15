/*
 * Name: Justin Houle
 * Date: 2022/03/15
 * Description: Main class which is used to test the functions
 */
package Lab08A;

import java.util.ArrayList;
import java.util.Random;

/**
 * Main class used to test the functions
 */
public class MainA {
    static Random rnd = new Random();

    /**
     * code used to test the functions
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // initialize new objects
        Base base = new Base();
        Derived derived = new Derived();
        Derived2 derived2 = new Derived2();
        Separate separate = new Separate();

        System.out.println();

        // Test 1
        base.m1();
        base.m1();
        base.m2("part 1");

        derived.m1();
        derived.m2("Part 1");
        derived.m3();

        derived2.m1();
        derived2.m2("Part 1");
        derived2.m3();
        derived2.m4();

        separate.m1();
        separate.m2("Part 1");
        separate.m3();

        System.out.println();

        ArrayList<Base> objects = new ArrayList<>();

        //filling the arraylist with a random assortment of 10 base, derived, and derived 2
        for (int i = 0; i < 10; i++) {
            switch (rnd.nextInt(3)) {
                case 0 -> objects.add(base);
                case 1 -> objects.add(derived);
                case 2 -> objects.add(derived2);
            }
        }

        // apply m2 function to elements in the array
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).m2("iteration: " + i);
        }
    }
}
