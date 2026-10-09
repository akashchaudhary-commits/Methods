package Abstraction;
interface printable{
    void display();
}
interface Shape{
//    Shape(double length, double breadth)
//    {
//        this.length = length;
//        this.breadth = breadth;
//    }
//    double length;
//    double breadth;
//    double radius;
    void area();
    void perimeter();
}
class rectangle implements Shape,printable{
    double length;
    double breadth;
    rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
        //super(length, breadth);
    }
    public void area()
    {
        System.out.println("Area of rectangle: " + length * breadth);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle: " + 2*(length + breadth));
    }
    public void display()
    {
        System.out.println("Display rectangle");
    }

}
class circle implements Shape, printable{
    double radius;
    circle(double radius)
    {
        this.radius = radius;
    }
    public void area()
    {
        System.out.println("Area of circle: " + 3.14*radius*radius);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of circle: " + 2*3.14*radius);
    }
    public void display()
    {
        System.out.println("Display circle");
    }
}
public class Practice2{
    public static void main(String[] args)
    {
        //rectangle r = rectangle();
        //r.area();
        //r.perimeter();
        Shape s = new rectangle(34.7, 25.7);
        s.area();
        s.perimeter();
        circle c = new circle(45.6);
        c.area();
        c.perimeter();
    }
}

