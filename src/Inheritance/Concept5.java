package Inheritance;

// Accessing superclass members and the private keyword

// a subclass cannot directly access a private member
// declared in its superclass.

//class A {
//    int money = 100;
//    private int pocketMoney = 50;
//}
//
//class B extends A {
//    void display() {
//        System.out.println(money);
//
//        // Compilation error:
//        // System.out.println(pocketMoney);
//    }
//}


// Correct way to do it
// using a getter method  - accessing the private member via public method

class A{
    int money = 100;
    private int pocketMoney = 50;
    public int getPocketMoney()
    {
        return pocketMoney;
    }
}
class B extends A{
    void TotalMoney()
    {
        int Total = money + getPocketMoney();
        System.out.println("Total Money: " + Total);
    }
}
//public class Concept5 {
//    public static void main(String[] args)
//    {
//        B b = new B();
//        b.TotalMoney();
//    }
//}


//The super keyword

//There are three important ideas to teach:
//  super() calls a constructor of the immediate superclass.
//  super.methodName() calls an accessible superclass method.
//  super.fieldName can access an accessible superclass field when needed.


class Person5 {
    String name;

    Person5(String name) {
        System.out.println("Parent constructor called");
        this.name = name;
    }

    void display() {
        System.out.println("Parent method called");
    }
}

class Student5 extends Person5 {
    String name = "Child Name";

    Student5(String name) {
        super(name);  // 1. Calls parent constructor
    }

    void show() {
        super.display();  // 2. Calls parent method

        System.out.println(super.name); // 3. Accesses parent variable
        System.out.println(this.name);  // Accesses child variable
    }
}

//public class Concept5 {
//    public static void main(String[] args) {
//        Student5 s = new Student5("Akash");
//        s.show();
//    }
//}

// The instanceof operator

// instanceof checks whether an object is an instance of a particular class or compatible type.
// It returns a boolean value: true or false.

class Employee2 { }

class Manager2 extends Employee2 { }

class Director extends Manager2 { }

public class Concept5 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        Manager2 m = new Manager2();
        Director d = new Director();

        System.out.println(e instanceof Employee2);
        System.out.println(m instanceof Employee2);
        System.out.println(d instanceof Employee2);
        System.out.println(d instanceof Manager2);
        System.out.println(d instanceof Director);
        System.out.println(e instanceof Manager2); // false
    }
}

// Why are all these results true except the last one?
//  An Employee object is an Employee.
//  A Manager object is a Manager and an Employee.
//  A Director object is a Director, a Manager, and an Employee.

