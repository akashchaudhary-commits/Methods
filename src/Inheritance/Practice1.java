package Inheritance;
//1. Single Inheritance -
//// extending the fields and methods of a single class to a sub class
//
//2. Multiple Inheritance -
//// expanding the fields and methods of multiple classes in a single subclass
//
//3. Heirarchical Inheritance -
//// expanding the feilds and methods of a single parent class into multiple
//// subclasses
//
//4. MultiLevel Inheritance -
//// inheriting the fields and methods of a super class to a subclass via
//// another subclass
//
//5. Hybrid Inheritance -
////

// Multiple Inheritance - not allowed using classes in java
    // allowed using interface

//interface one {
//
//}
//interface two{
//
//}
//class three implements one , two{
//
//}


class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }
    void displayPerson()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person{
    int rollno;
    String course;
    Student(String name, int age, int rollno, String course)
    {
        super(name, age);
        this.rollno = rollno;
        this.course = course;
        System.out.println("Student Constructor called");
    }
    void displayStudent()
    {
        displayPerson();
        System.out.println("Rollno: " + rollno);
        System.out.println("Course: " + course);

    }
}
class Teacher extends Person{
    String Department;
    String Subject;
    Teacher(String name, int age, String Department, String Subject)
    {
        super(name, age);
        this.Department = Department;
        this.Subject = Subject;
        System.out.println("Teacher Constructor called");
    }
    void displayTeacher()
    {
        displayPerson();
        System.out.println("Department: " + Department);
        System.out.println("Subject: " + Subject);

    }
}
class Assistant extends Teacher{
    double salary;
    Assistant(String name, int age, String Department, String Subject, double salary)
    {
        super(name, age, Department, Subject);
        this.salary = salary;
        System.out.println("Assistant Constructor called");
    }
    void displayAssistant()
    {
        displayTeacher();
        System.out.println("Salary: " + salary);
    }

}
public class Practice1{
    public static void main(String[] args)
    {
        Student s = new Student("Akash", 25, 101, "B.tech");
        s.displayStudent();
        Teacher t = new Teacher("Akash1", 25, "CSE", "OOPs");
        t.displayTeacher();
        Assistant a = new Assistant("Akash2", 25, "CSE", "B.tech", 858568);
        a.displayAssistant();
    }
}


