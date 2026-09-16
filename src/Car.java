public class Car {
    String model;
    int rc;
    Car(String m, int r)
    {
        model = m;
        rc= r;
    }
    Car(String s)
    {
        this("kavbeve", 876161);
        //model = s;
        //
    }
    Car()
    {
        this("jhas", 8769525);
    }

    public static void main(String[] args)
    {
        Car c1 = new Car("honda", 875244);
        Car c2 = new Car("hyundia");
        Car c3 = new Car();
//        c1.model = "Honda";
//        c1.rc = 7683915;

   //     Car c2 = new Car();
//        c2.model = "Hyundai";
//        c2.rc = 876951;

        System.out.println(c1.model + c1.rc);
        System.out.println(c2.model + c2.rc);
        System.out.println(c3.model + c3.rc);
    }
}
