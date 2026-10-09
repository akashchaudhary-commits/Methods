package Abstraction;
// types of methods in Interfaces -
interface vehicle
{
    void start();
    default void stop()
    {
        message();
        System.out.println("the car has stopped");
    }
    private void message()
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
public class Practice3 {
    public static void main(String[] args)
    {
        car c = new car();
        c.start();
        c.stop();
    }
}

