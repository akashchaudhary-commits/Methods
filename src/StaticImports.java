// Static Imports - It is a feature of Java that
// allows us to use static methods or static variables directly,
// without writing the class name every time.

import static java.lang.Math.*;

class StaticImports {

    public static void main(String[] args) {

        double a = sqrt(25);

        double b = pow(2, 3);

        int c = abs(-100);

        System.out.println("Square root = " + a);
        System.out.println("Power = " + b);
        System.out.println("Absolute value = " + c);
        System.out.println("PI = " + PI);
    }
}
