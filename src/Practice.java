public class Practice{
    String model;
    int rc;
    Practice(String model, int rc)
    {

        this.model = model;
        this.rc = rc;
    }
    Practice(int r)
    {
        this("Unknown", 86619);
        //rc = r;
    }
    Practice()
    {
        //this("Unknown", 8614965);
    }
    public static void main(String[] args)
    {
        Practice p1 = new Practice("Honda", 71571);
//        p1.model = "Honda";
//        p1.rc = 715471;
        Practice p3 = new Practice(86591);
        Practice p2 = new Practice();

//        p2.model = "Hyundai";
//        p2.rc = 263412;

        System.out.println(p1.model + p1.rc);
        System.out.println(p2.model + p2.rc);
        System.out.println(p3.model + p3.rc);

    }
}
