public class Car {
    static String model;
    static int rc;
//    Car(String model, int r)
//    {
//        this.model = model;
//        rc = r;
//    }
//    Car()
//    {
//        this("Unknown", 0);
////        model = "Unknown";
////        rc = 0;
//    }
//    Car(String s)
//    {
//        //this("Maruti");
//        model = s;
//    }

    public static void main(String[] args)
    {
        int m =0;
        Car c1 = new Car();
        c1.model = "Honda";
        c1.rc = 12344;
        Car c2 = new Car();
//        Car c3 = new Car();
//        Car c4 = new Car("Maruti");
        c2.model = "Hyundai";
        c2.rc = 67890;

        display();
        //c2.display();
//        System.out.println(c1.model + " " + c1.rc);
//        System.out.println(c2.model + " " + c2.rc);
//        System.out.println(c3.model + " " + c3.rc);
//        System.out.println(c4.model + " " + c4.rc);

    }
    static void display()
    {
//        Car c1 = new Car();
//        Car c2 = new Car();
        System.out.println(model + " " + rc);
        //System.out.println(c2.model + " " + c2.rc);
    }

}
