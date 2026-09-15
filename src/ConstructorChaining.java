
class ConstructorChaining {

    int rollNo;
    String name;

    ConstructorChaining() {
        this(0, "Unknown");// this must be the first statement
        //Call another constructor of the same class that
        // accepts int and String
    }

    ConstructorChaining(int r) {

        this(r, "Unknown");
    }

    ConstructorChaining(int r, String n) {
        rollNo = r;
        name = n;
    }
    public static void main(String[] args) {

        ConstructorChaining s1 = new ConstructorChaining(101, "Akash");
        ConstructorChaining s2 = new ConstructorChaining(102);
        ConstructorChaining s3 = new ConstructorChaining();

        System.out.println(s1.rollNo);
        System.out.println(s1.name);

        System.out.println(s2.rollNo);
        System.out.println(s2.name);

        System.out.println(s3.rollNo);
        System.out.println(s3.name);
    }
}