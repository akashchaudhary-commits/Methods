package CollegeCL;

public class StudentST {
    protected String name;
    public int rollno;
}

class student{
    public static void main(String[] args)
    {
        StudentST s = new StudentST();
        s.name = "Akash";
    }
}

class chils extends StudentST
{
    public static void main(String[] args)
    {
        StudentST s = new StudentST();
        {
            s.name = "javscj";
            System.out.println(s.name);
        }
    }
}
