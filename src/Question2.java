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


class Student3 extends Personn {

    int rollNo;
    String course;

    // No-argument Student constructor
    Student3() {
        this(101, "Akash", 20, "B.Tech");
    }

    // Parameterized Student constructor
    Student3(int rollNo, String name, int age, String course) {

        super(name, age);

        this.rollNo = rollNo;
        this.course = course;

        System.out.println("Student parameterized constructor");
    }

    void displayd() {

        System.out.println("Roll No:" + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}


public class Question2 {

    public static void main(String[] args) {

        Student3 s1 = new Student3();

        s1.displayd();

        Student3 s2 = new Student3(102, "Rahul", 21, "BCA");

        s2.displayd();
    }
}