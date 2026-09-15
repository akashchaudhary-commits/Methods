class Personn {

    String name;
    int age;

    // No-argument constructor
    Personn() {
        name = "Unknown";
        age = 0;
        System.out.println("Person no-argument constructor");
    }

    // Parameterized constructor
    Personn(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person parameterized constructor");
    }
}


class Student2 extends Personn {

    int rollNo;
    String course;

    // No-argument Student constructor
    Student2() {
        this(101, "Akash", 20, "B.Tech");
    }

    // Parameterized Student constructor
    Student2(int rollNo, String name, int age, String course) {

        super(name, age);

        this.rollNo = rollNo;
        this.course = course;

        System.out.println("Student parameterized constructor");
    }

    void display() {

        System.out.println("-------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("-------------------");
    }
}


public class Question2 {

    public static void main(String[] args) {

        System.out.println("Creating Student 1");

        Student s1 = new Student();

        s1.display();


        System.out.println("\nCreating Student 2");

        Student2 s2 = new Student2(102, "Rahul", 21, "BCA");

        s2.display();
    }
}