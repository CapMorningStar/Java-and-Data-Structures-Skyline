//KYAW SOE LWIN
//September 20
//Lab8
//The program is about a user entering scores and calculated for average and show highest,lowest and number of scores he/she entered;
import java.util.*;
public class TestScores
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter non negative number test scores: ");
        int scores=input.nextInt();

        int count=0;
        int highest=0;
        int lowest=0;
        double sum=0;

        if (scores>=0)
        {
            lowest=scores;
        }
        while(scores>=0)
        {
            sum+=scores;
            count++;
            if(scores> highest)
            {
                highest=scores;
            } 
            if(scores<lowest)
           {
                lowest=scores;
           }
                System.out.println("Enter non negative number(or a negative number to quit): ");
                scores=input.nextInt();
        }
        if(count>0)
        {
            double average=sum/count;
            System.out.println("Number of scores you entered: "+count);
            System.out.println("Highest score: "+highest);
            System.out.println("Lowest score: "+lowest);
            System.out.println("Average score: "+average);
        }else 
        {
            System.out.println("No scores was entered");
        }
    }
}