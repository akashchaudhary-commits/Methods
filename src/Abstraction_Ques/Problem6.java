package Abstraction_Ques;
import java.util.Scanner;

@FunctionalInterface
interface Operation {
    int calculate(int a, int b);
}

public class Problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation type: ");
        String type = sc.next();
        Operation o = null;
        switch(type){
            case"ADD":
                o = (a, b) ->a+b;
                break;
            case"Subtract":
                o = (a, b) -> a-b;
                break;
            case"Multiply":
                o = (a, b) -> a*b;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("result = " + o.calculate(3, 7));

    }
}