//package Abstraction_Ques;
//import java.util.Scanner;
//
//interface Payment {
//    void pay(double amount);
//    void refund(double amount);
//}
//
//class Credit implements Payment{
//    public void pay(double amount)
//    {
//        System.out.println(amount + " paid using credit");
//    }
//    public void refund(double amount)
//    {
//        System.out.println(amount + " refunded using credit");
//    }
//}
//class UPI implements Payment{
//    public void pay(double amount)
//    {
//        System.out.println(amount + " paid using UPI");
//    }
//    public void refund(double amount)
//    {
//        System.out.println(amount + " refunded using UPI");
//    }
//}
//public class Problem1{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        String paymentType = sc.next();
//        double amount = sc.nextDouble();
//        String Operation = sc.next();
//        Payment p = null;
//        if(paymentType.equalsIgnoreCase("Credit"))
//        {
//            p = new Credit();
//
//        }
//        else if(paymentType.equalsIgnoreCase("UPI"))
//        {
//            p= new UPI();
//        }
//
//        if(Operation.equals("Pay"))
//        {
//            System.out.println(p.pay(amount));
//        }
//        else if (){
//            System.out.println((p.refund(amount)));
//        }
//    }
//}
