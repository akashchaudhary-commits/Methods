package OOPsPracticeQues;
import java.util.Scanner;
class Rectangle{
    double length;
    double width;

    Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }
    Rectangle(double length)
    {
        this.length = length;
        width = 1.0;
    }
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    double calculateArea()
    {
        return length*width;
    }
    double calculatePerimeter()
    {
        return 2*(length+width);
    }
    void display()
    {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        System.out.println("Length: " + length + ", Width: " + width +
                ", Area: " + area + ", Perimeter: " + perimeter);
    }
}
public class Ques2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Rectangle e;
        if(input.isEmpty())
        {
            e = new Rectangle();
        }
        else if(!input.contains("/"))
        {
            double length = Double.parseDouble(input);
            e = new Rectangle(length);
        }
        else{
            String[] read = input.split("/");
            double length = Double.parseDouble(read[0]);
            double width = Double.parseDouble(read[1]);
            e = new Rectangle(length, width);
        }
        e.display();

    }

}
