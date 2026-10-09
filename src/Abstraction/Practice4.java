package Abstraction;
// Functional Interfaces
// lambda with two parameters
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

// lamda with no parameters
@FunctionalInterface
interface Message{
    void show();
}
//lambda with one parameter
@FunctionalInterface
interface Square {
    int calculate(int n);
}
//class MyCalculator implements Calculator {
//
//    public int add(int a, int b) {
//        return a + b;
//    }
//}

public class Practice4 {

    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;

        System.out.println(c.add(10, 20));
        Message m = () -> System.out.println("Here is the message");
        m.show();

        Square s = (n) -> n*n;
        System.out.println(s.calculate(6));
    }
}