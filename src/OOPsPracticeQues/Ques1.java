package OOPsPracticeQues;
import java.util.Scanner;

class Employee{
    String name;
    double salary;
    String department;

    Employee()
    {
        this.name = "null";
        this.salary = 0.0;
        this.department = "Not assigned";
    }
    Employee(String name)
    {
        this.name = name;
        this.salary = 0.0;
        this.department = "Not assigned";
    }
    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
        this.department = "Not assigned";
    }
    Employee(String name, double salary, String department)
    {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    void displayInfo()
    {
        System.out.println("Name: "+ name + ", Salary: " + salary + ", Department: "+ department);
    }
}
public class Ques1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] read = input.split("/");
        Employee e;
        if(input.isEmpty())
        {
            e = new Employee();
        }
        if(read.length == 1)
        {
            e = new Employee(read[0]);
        }
        else if(read.length == 2)
        {
            double salary = Double.parseDouble(read[1]);
            e = new Employee(read[0], salary);
        }
        else{
            double salary = Double.parseDouble(read[1]);
            e = new Employee(read[0], salary, read[2]);
        }
        e.displayInfo();
    }
}