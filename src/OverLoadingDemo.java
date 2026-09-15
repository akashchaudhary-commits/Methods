public class OverLoadingDemo {

    // 1. Basic Overloading: Changing the number of parameters
    public void display(int a) {
        System.out.println("Single int parameter: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Two int parameters: " + a + ", " + b);
    }

    // 2. Basic Overloading: Changing the data types of parameters
    public void display(double a) {
        System.out.println("Single double parameter: " + a);
    }

    // 3. Basic Overloading: Changing the order of parameter types
    public void process(int a, String b) {
        System.out.println("Order: (int, String)");
    }

    public void process(String b, int a) {
        System.out.println("Order: (String, int)");
    }

    // 4. Type Promotion / Widening (int promotes to long if int match unavailable)
    public void compute(long a) {
        System.out.println("Widened to long: " + a);
    }

    // 5. Autoboxing vs Primitive Widening (Primitive Widening takes precedence over Autoboxing)
    public void printValue(long a) {
        System.out.println("Primitive Widening (long): " + a);
    }

    public void printValue(Integer a) {
        System.out.println("Autoboxing (Integer): " + a);
    }

    // 6. Fixed Arguments vs Varargs (Fixed arguments take precedence over Varargs)
    public void calculate(int a, int b) {
        System.out.println("Exact match fixed arguments called");
    }

    public void calculate(int... numbers) {
        System.out.println("Varargs method called");
    }

    public static void main(String[] args) {
        OverLoadingDemo demo = new OverLoadingDemo();

        // Parameter number & type differences
        demo.display(10);        // Calls display(int)
        demo.display(10, 20);    // Calls display(int, int)
        demo.display(10.5);      // Calls display(double)

        // Parameter order differences
        demo.process(1, "Java"); // Calls process(int, String)
        demo.process("Java", 1); // Calls process(String, int)

        // Implicit Type Promotion (5 is an int, automatically widened to long)
        demo.compute(5);

        // Precedence Test: Primitive Widening beats Autoboxing
        demo.printValue(100);    // Calls printValue(long) instead of printValue(Integer)

        // Precedence Test: Fixed parameters beat Varargs
        demo.calculate(1, 2);    // Calls calculate(int, int)
        demo.calculate(1, 2, 3); // Calls calculate(int...)
    }
}
