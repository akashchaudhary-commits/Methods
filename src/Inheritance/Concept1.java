package Inheritance;

// Inheritance is an OOP concept in which one class acquires accessible
// properties and behaviors from another class.

//-Superclass: The class whose members are inherited. Here, Person.
//-Subclass: The class that inherits from another class. Here, Student.
//-Generalization:Identifying common features and putting them in a general
// class such as Person.
//-Specialization: Creating a more specific class such as Student that
// adds student-specific features.

class Person3 { // Super class
    String name; // instance variable called by creating object of the
    int age;     // class

//    static String name; // static variable called directly
//    static int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student3 extends Person3 {// sub class extending super class
    String course;

    void displayCourse() {
        System.out.println("Course: " + course);
    }
}

public class Concept1 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        // without using constructors, we have to have to pass values
        // using reference s to eachh variable
        s.name = "Akash";
        s.age = 20;
        s.course = "B.Tech CSE";
        Student3 s1 = new Student3();
        s1.name = "Akash1";
        s1.age = 201;
        s1.course = "B.Tech CSE";

        // if we use contructors we can do pass values while creating and
        // initializing the object of the respective class

        // Student3 s = new Student3("Akash", 20, "B.Tech CSE");


        // run for both static and instance variables
        s.displayPerson();
        s.displayCourse();

        s1.displayPerson();
        s1.displayCourse();

    }
}


