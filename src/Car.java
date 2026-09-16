public class Car {
    String model;
    int rc;
    Car(String s, int r)
    {
        model = s;
        rc = r;
    }
    Car()
    {
        this("jhbsac", 78474);
//        model = "jhbsac";
//        rc = 78474;
    }
    Car(String s)
    {
//        model = s;
//        rc = 986539;
        this("jacbejve", 874745);
    }
    public static void main(String[] args)
    {
        Car c1 = new Car("Honda", 48677);
//        c1.model = "Honda";
//        c1.rc = 87152461;
        Car c2 = new Car();
        Car c3 = new Car("jVJBSC");
//        c2.model = "Hyundai";
//        c2.rc = 8926159;

        System.out.println(c1.model + c1.rc);
        System.out.println(c2.model + c2.rc);
        System.out.println(c3.model + c3.rc);
    }
}
