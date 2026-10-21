package Inheritance;
// Relationships in Inheritance
//IS-A relationship

//An IS-A relationship expresses inheritance: a subclass is a
// more specific kind of its superclass.
//Examples:
//        - A Manager IS-A Employee.
//        - A Student IS-A Person.
//        - A Dog IS-AN Animal.
class Employee {
    String name;
    Employee(String name)
    {
        this.name = name;
    }

    void work() {
        System.out.println(name + " is working");
    }
}
class Manager extends Employee {
    Manager(String name)
    {
        super(name);
    }
    void conductMeeting() {
        work();
        System.out.println(name + " is conducting a meeting");
    }
}
// Main class for Manager and Employee class
//public class Concept2 {
//    public static void main(String[] args) {
//        Manager m = new Manager("Rahul");
//        m.conductMeeting();
//    }
//}

// HAS-A relationship also can be termed as Association

// HAS-A relationship means one object contains a reference to another object.
// In Java, we commonly implement this using an instance variable
// whose type is another class.
//Examples:
//        - A House HAS-A Kitchen.
//        - A Computer HAS-A Keyboard.
//        - A College HAS-A Student.

class Kitchen{
    void cook()
    {
        System.out.println("The cook is using the Kitchen");
    }
}
class House extends Kitchen{
    Kitchen k = new Kitchen();
    void UseKitchen()
    {
        k.cook();
    }
}
// Main class for Kitchen and cook class
public class Concept2{
    public static void main(String[] args)
    {
        House h = new House();
        h.UseKitchen();
    }

}
//IS-A  vs  HAS-A
//IS-A	                                HAS-A
//Represents inheritance	            Represents reference
//Uses extends for class inheritance	Uses an object reference as a field
//Student extends Person	            House has a Kitchen field
//Describes a type of thing	            Describes a relationship between things


//Association (Has-A Relationship)-> aggregation and composition

//These concepts describe relationships between objects.

//Association is a relationship between two objects.

// Types of Association

// 1. Aggregation

//Aggregation is a weaker form of HAS-A relationship.
// The contained object can exist independently of the object
// that refers to it.

//Example: A College has Students, but a Student can continue to exist
// if the College object is removed from the program.

// 2. Composition
// Composition is a stronger ownership relationship.
// A contained object is conceptually treated as part of its owner
// and has a lifecycle tied to that ownership.
