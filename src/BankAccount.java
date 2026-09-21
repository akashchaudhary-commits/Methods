// Encapsulation - Data Hiding + Controlled access
// wrapping data and methods that oparate on the data into a
// single class, while restricting direct access to the data.
public class BankAccount {
    private double balance;
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(double amount)
    {
        if(amount > 0 && amount<=balance)
        {
            balance = balance - amount;
        }
        else{
            System.out.println("Invalid withdawal");
        }
    }

    public double getBalance() {
        return balance;
    }
}
class Encapsulation2{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount();

        ba.deposit(10000000);
        ba.withdraw(50000);

        System.out.println(ba.getBalance());


    }
}
