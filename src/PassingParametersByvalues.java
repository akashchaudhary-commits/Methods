////When calling a method,
//// you need to provide arguments, which must be given in the
//// same order as their respective parameters
//// in the method signature.
//
//public class PassingParametersByvalues {
//    public static void main(String[] args) {
//        nPrintln("Hello", 5);
//        int x = 1;
//        System.out.println("Before the call, x is " + x);
//        increament(x);
//        System.out.println("After the call, x is " + x);
//    }
//
//    public static void nPrintln(String message, double n) {
//        for (int i = 0; i < n; i++)
//            System.out.println(message);
//
//    }
//    //The arguments must match the parameters in
//    // order, number, and compatible type, as
//    // defined in the method signature
//
//    // Pass-By-Value - >
//    static void increament(int a)
//    {
//        a++;
//        System.out.println("a inside the method is " + a);
//    }
//}
public class PassingParametersByvalues {
// Main method //

    public static void main(String[] args) {
// Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

              System.out.println("Before invoking the swap method, num1 is " +
                        num1 + " and num2 is " + num2);


// Invoke the swap method to attempt to swap two variables
        swap(num1, num2);


              System.out.println("After invoking the swap method, num1 is " +
                        num1 + " and num2 is " + num2);
            }


//Swap two variables //

    public static void swap(int n1, int n2)
    {
              System.out.println("\tInside the swap method");
              System.out.println("\t\tBefore swapping, n1 is " + n1
                    + " and n2 is " + n2);
// Swap n1 with n2

        int temp = n1;
              n1 = n2;
              n2 = temp;
        System.out.println("\t\tAfter swapping, n1 is " + n1
            + " and n2 is " + n2);
    }
}


