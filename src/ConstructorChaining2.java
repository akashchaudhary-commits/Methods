class Person {

    String name;

    Person(String n) {
        name = "Akash";
        System.out.println("Person constructor");
    }
}

class Student extends Person {

    int rollNo;

    Student() {
        this(101, "Unknown");
    }

    Student(int r, String name) {
        super(name);
        rollNo = r;
        System.out.println("Student constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class ConstructorChaining2 {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
