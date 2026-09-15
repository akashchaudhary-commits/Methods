//Overloading methods enables you to define the methods
// with the same name as long
// as their signatures are different.

public class TestMethodOverLoading {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is "
                + max(3, 4));

        // Invoke the max method with double parameters
        System.out.println("The maximum of 3.0 and 5.4 is "
                + max(4.0, 5));

        // Invoke the max method with 3 double  parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
                + max(3.5, 5.0, 10.14));
    }

//    public static int max(int num1, int num2) {
//        if (num1 > num2)
//            return num1;
//        else
//            return num2;
//    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }


    public static double max(double num1, double num2, double num3) {

        return max(max(num1, num2), num3);
    }
}