// Encapsulation - Data Hiding + Controlled Access
// Wrapping the data and methods of that data
// in a single class
// while restricting their access in other classes;

// 1. making variables private
// 2. providing public methods to access or modify them
// using getter and setter methods

public class Encapsulation {
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

}
class MainM{
    public static void main(String[] args)
    {
        Encapsulation e = new Encapsulation();
        e.setName("Akash");
        System.out.println(e.getName());
    }

}
