package Abstraction;
abstract class Bank{
    String name;
    Bank(String name)
    {
        this.name = name;
    }
    abstract void deposit();
    abstract void withdraw();
}
class Working extends Bank{
    Working(String name)
    {
        super(name);
//        this.name = name;
        System.out.println(name);
    }
    void deposit()
    {
        System.out.println("Money Deposited");
    }
    void withdraw()
    {
        System.out.println("Money withdrawn");
    }
}
public class Practice1
{
    public static void main(String[] args)
    {
        Working w = new Working("Hello");
        w.withdraw();
        w.deposit();
        Bank b = new Working("Akash");
        b.withdraw();
        b.deposit();
    }
}
