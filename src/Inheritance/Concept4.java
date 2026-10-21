package Inheritance;
// Multiple Inheritance - > using interfaces
interface Student2{
    void displayStudent();
}
interface Teacher2{
    void displayTeacher();
}
class Person2 implements Student2, Teacher2{
    String name;
    int age;
    String Department;
    String Subject;
    Person2(String name, int age, String Department, String Subject)
    {
        this.name = name;
        this.age = age;
        this.Department = Department;
        this.Subject = Subject;
    }
    public void displayStudent(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void displayTeacher()
    {
        System.out.println("Department: " + Department);
        System.out.println("Subject: " + Subject);
    }
}
public class Concept4 {
    public static void main(String[] args)
    {
        Person2 p = new Person2("Akash", 25, "CSE", "B.TECT");
        p.displayStudent();
        p.displayTeacher();
    }
}



// Interface can extend multiple interfaces
// can Combine class inheritance with multiple interfaces


