// Instance Method
public class MethodType {
    // Instance method
    static void displayStudent() {
        System.out.println("Student name: Akash");
        System.out.println("Course: B.Tech CSE");
    }

    public static void main(String[] args) {

        // Creating an object
//        MethodType s1 = new MethodType();

        // Calling instance method using object
        displayStudent();

        // Calling static method using class name
        MethodType md = new MethodType();
        int result = MethodType.add(10, 20);

        System.out.println("Sum = " + result);
    }
    // Static method
    static int add(int a, int b) {
        return a + b;
    }



}
// Abstract Method - An abstract method has no body.
abstract class Animal {
    // Abstract method
    abstract void sound();
}
// Child class
class Dog extends Animal {

    // Providing implementation
    void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}


// Another child class
class Cat extends Animal {

    // Providing implementation
    void sound() {
        System.out.println("Cat says: Meow");
    }
}


class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}

// Final Method -
class Bank {

    // Final method
    final void rules() {
        System.out.println("Bank rules cannot be changed.");
    }
}


class SBI extends Bank {

    // Trying to override final method

    /*void rules() {
        System.out.println("SBI changed the rules.");
    }
       */



}


class Main2 {

    public static void main(String[] args) {

        SBI s = new SBI();

        s.rules();
    }
}
