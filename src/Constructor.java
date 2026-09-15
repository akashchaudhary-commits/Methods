public class Constructor {
    int rollNo;
    String name;

    Constructor(int r, String n)
    {
        rollNo = r;
        name = n;
    }
    Constructor()
    {
        rollNo = 0;
        name = "hbvq";
    }
    Constructor(int r)
    {
        rollNo = r;
        name = "hbvq";
    }



    public static void main(String[] args) {

        Constructor s1 = new Constructor(101, "Akash");
        Constructor s2 = new Constructor();
        Constructor s3 = new Constructor(101);


//        s1.rollNo = 101;
//        s1.name = "Akash";
//
//        s2.rollNo = 101;
//        s2.name = "Akash";
//        s3.rollNo = 101;
//        s3.name = "Akash";





        System.out.println(s1.rollNo);
        System.out.println(s1.name);

        System.out.println(s2.rollNo);
        System.out.println(s2.name);

        System.out.println(s3.rollNo);
        System.out.println(s3.name);
    }
}
