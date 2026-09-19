import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        String s = sc.next();

        int minOpen = 0;
        int maxOpen = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                minOpen++;
                maxOpen++;
            }
            else if(ch == ')')
            {
                minOpen--;
                maxOpen--;
            }
            else if(ch == '*')
            {
                minOpen--;
                maxOpen++;
            }
            if(minOpen < 0)
            {
                minOpen = 0;
            }
            if(maxOpen<0)
            {
                System.out.println("False");
                return;
            }

        }
        if(minOpen == 0)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
