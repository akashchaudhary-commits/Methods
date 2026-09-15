// Find Max -
public class CallingMethod {
    public static void main(String[] args)
    {
        int i=20;
        int j = 30;
        int max = maximum(i, j);
        System.out.println(maximum(i, j));
        grade(101);
    }
    static int maximum(int a, int b)
    {
        int result;
        if(a > b)
        {
            result = a;
        }
        else{
            result = b;
        }
        return result;
    }
    static void grade(int g)
    {
        if(g<0 || g>100)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(g>90)
        {
            System.out.println("Grade > A");
        }
        else{
            System.out.println("Grade < A");
        }
    }


}
