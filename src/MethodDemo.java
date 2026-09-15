// Find sum of Integers from 1 to 10 , 20 to 35 and 60 to 90
//
import java.util.*;

class MethodDemo{
    public static void main(String[] ars)
    {
//        int sum = 0;
//        for(int i=1;i<=10;i++)
//        {
//            sum+=i;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for(int i=20;i<=30;i++)
//        {
//            sum+=i;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for(int i=60;i<=90;i++)
//        {
//            sum+=i;
//        }
//        System.out.println(sum);

        System.out.println("Using MEthods");
        double m = sum(20, 50);
        //MethodDemo md = new MethodDemo();
        System.out.println(sum(1,10));
        System.out.println(sum((Math.random()*10)+1, (Math.random()*10)+1));
    }
    static double sum(double a, double b)
    {
        double result = 0;
        for(double i=a;i<=b;i++)
        {
            result += i;
        }
        return result;
    }
}
