package Abstraction;

interface vehicle1{
    public abstract void start();
    default void stop()
    {
        stopping();
        System.out.println("The car has stopped");
    }
    private void stopping()
    {
        System.out.println("The car is stopping");
    }
}
class car1 implements vehicle1{
    public void start()
    {
        System.out.println("Car is starting");
    }
}
class car3 implements vehicle1{
    public void start()
    {
        System.out.println("Car is startinghdyhb");
    }
}
public class Practice5{
    public static void main(String[] args)
    {
        car1 c = new car1();
        c.start();
        c.stop();
    }
}