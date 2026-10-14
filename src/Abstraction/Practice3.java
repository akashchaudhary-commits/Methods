package Abstraction;

interface vehicle{
    //abstract void start();
    void start();
    default void stop()
    {
        display();
        System.out.println("The car had stopped");
    }
    private void display()
    {
        System.out.println("The car is stopping");
    }
}
class car implements vehicle{
    public void start()
    {
        System.out.println("The car is starting");
    }
}
class car2 implements vehicle{
    public void start()
    {
        System.out.println("k,BWKMWV;LEWV");
    }
}
public class Practice3{
    public static void main(String[] args)
    {
        car c = new car();
        c.start();
    }
}