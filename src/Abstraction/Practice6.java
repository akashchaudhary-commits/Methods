package Abstraction;
// multiple parameters passed
@FunctionalInterface
interface Calculate
{
    int add(int a, int b);
}
// no parameters passed
@FunctionalInterface
interface Display{
    void show();
}
//class One implements Calculate{
//    public int add(int a, int b)
//    {
//        return a + b;
//    }
//}
public class Practice6{
    public static void main(String[] args)
    {
//        One o = new One();
//        o.add(3, 6);
        //Calculate c = (a, b) -> a+b;
        Calculate c = (a, b) -> {
            int result = a+b;
            return result;
        };
        System.out.println(c.add(3, 7));

        Display p = () -> System.out.println("No parameters passed");
        p.show();
    }
}
