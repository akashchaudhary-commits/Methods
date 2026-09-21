public class Encapsulation {
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public String  getName()
    {
        return name;
    }


}
class MainM{
    public static void main(String[] args)
    {
        Encapsulation e = new Encapsulation();
        e.setName("Akash");
        e.getName();

    }
}
