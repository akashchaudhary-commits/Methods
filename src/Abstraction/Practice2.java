package Abstraction;
interface print{
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
    abstract void perimeter();
}
class rectangle implements Shape,print{
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
        System.out.println("Shape is rectangle");
    }


}
class circle implements Shape, print{
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
        System.out.println("Shape is circle");
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

