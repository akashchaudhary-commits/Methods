class Student1 {

    int rollNo;
    String name;
    String course;

    // No-argument constructor
    Student1() {
        this(0, "Unknown", "Not Assigned");
    }

    // Constructor with roll number
    Student1(int rollNo) {
        this(rollNo, "Unknown", "Not Assigned");
    }

    // Constructor with roll number and name
    Student1(int rollNo, String name) {
        this(rollNo, name, "Not Assigned");
    }

    // Constructor with all values
    Student1(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("-------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("-------------------");
    }
}

public class Question1 {

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1(101);
        Student1 s3 = new Student1(102, "Rahul");
        Student1 s4 = new Student1(103, "Aman", "B.Tech");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
