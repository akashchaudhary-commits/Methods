package Inheritance;

//// Multiple Inheritance - is not allowed using classes in java
//// allowed using interface
//interface One{
//
//}
//interface two{
//
//}
//class three implements One , two{
//
//}

class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Person class constructor");
    }
    void displayPerson()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person{
    int roll_no;
    String course;
    Student(String name, int age, int roll_no, String course)
    {
        super(name, age);
        this.roll_no = roll_no;
        this.course = course;
        System.out.println("Student class Constructor");
    }
    void displayStudents()
    {
        displayPerson();
        System.out.println("Rollno: "+ roll_no);
        System.out.println("Course: " + course);
    }
}
public class Practice1{
    public static void main(String[] args)
    {
        Student s = new Student("Akash", 25, 101, "BTECH");
        s.displayStudents();
    }
}
