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


class Person1{
    String name;
    int age;
//    void displayPerson()
//    {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
}
class Student1 extends Person1{
    int rollno;
    String course;
    void displayStudent()
    {
//        displayPerson();
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Rollno: " + rollno);
        System.out.println("Course: " + course);

    }
}
class Teacher1 extends Person1{
    String Department;
    String Subject;
    void displayTeacher()
    {
        //displayPerson();
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Department: " + Department);
        System.out.println("Subject: " + Subject);

    }
}
class Assistant1 extends Teacher1{
    double salary;
    void displayAssistant()
    {
        displayTeacher();
        System.out.println("Salary: " + salary);
    }

}
public class Practice2{
    public static void main(String[] args)
    {
        Student1 s = new Student1();
        s.name = "Akash";
        s.age =25;
        s.rollno = 101;
        s.course = "B.Tech";
        s.displayStudent();
        Assistant1 a = new Assistant1();
        a.name = "Akash";
        a.age =25;
        a.Department = "CSE";
        a.Subject = "OOPs";
        a.salary = 764436;
        a.displayAssistant();
    }
}



