package Inheritance;
// Method overriding in inheritance
// Method overriding happens when a subclass provides its own implementation
// of an inherited instance method with a compatible signature.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

//@Override tells the compiler that you intend to override
// an inherited method. If the method does not actually override
// a compatible method, the compiler reports an error.

// works also without writing @Override.

// Method overriding	                                Method overloading

// Usually involves parent and child classes	        Can occur within one class
// Same method name and compatible signature	        Same method name, different parameter lists
// Example: sound() in Animal and Dog	                Example: add(int, int) and add(double, double)
// Runtime Polymorphism                                 Compile Time polymorphism
// Handled by compliler during compilation              Handled by JVM during program execution.

//Rules for overriding

//- The method name and parameter types must match.
//- The return type must be the same or covariant for reference types.
//- The overriding method cannot reduce the visibility of the inherited method.
//- A final method cannot be overridden.
//- A private method is not inherited for overriding purposes.


//public class Polymorphism {
//    public static void main(String[] args)
//    {
//        Animal a = new Animal();
//        a.sound();
//        Dog d = new Dog();
//        d.sound();
//        //The child provides specialized behavior
//        // while preserving the parent-class method contract.
//    }
//}

// Inheritance and polymorphism
// Inheritance becomes especially powerful when combined with polymorphism.

// Polymorphism - Many forms -> OOPs concept which allows a single method , interface
// to take on many forms.

class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Polymorphism {
    public static void main(String[] args) {

        Animal1 a;
        // Reference type: Animal
        a = new Dog1();
        // Runtime object type: Dog
        a.sound();
        a = new Cat1();
        // Runtime object type: Cat
        a.sound();

//      This is runtime polymorphism, also called dynamic method dispatch.
    }
}
