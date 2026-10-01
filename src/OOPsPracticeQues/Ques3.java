package OOPsPracticeQues;
import java.util.Scanner;
class Stu {
    String name;
    double[] scores;

    Stu() {
        name = "Unknown";
        scores = new double[0];
    }
    Stu(String name)
    {
        this.name = name;
        scores = new double[0];
    }
    Stu(String name, double... scores)
    {
        this.name = name;
        this.scores = scores;
    }
    double calculateAverage()
    {
        if(scores.length == 0)
        {
            return 0.0;
        }
        double sum = 0;
        for(int i=0;i<=scores.length-1;i++)
        {
            sum += scores[i];
        }
        return sum/scores.length;
    }
    double highest()
    {
        if(scores.length == 0)
        {
            return 0.0;
        }
        double high = scores[0];
        for(int i=0;i<scores.length;i++)
        {
            if(high < scores[i])
            {
                high = scores[i];
            }
        }
        return high;
    }
    void display()
    {
        double average = calculateAverage();
        double highest = highest();
        System.out.println("Name: " + name + " Average: " + average + " Highest: " + highest);
    }
}
public class Ques3
{
    public static void main(String[] args)
    {
        System.out.println("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // Empty input
        if(input.isEmpty())
        {
            Stu s = new Stu();
            s.display();
        }
        else{
            String[] parts = input.split("/");
            String name = parts[0];
            if(parts.length == 1)
            {
                Stu s = new Stu(name);
                s.display();
            }
            else{
                double[] scores = new double[parts.length-1];
                for(int i=0;i<parts.length-1;i++)
                {
                    scores[i] = Double.parseDouble(parts[i+1]);
                }
                Stu s = new Stu(name, scores);
                s.display();
            }
        }
    }
}