//KYAW SOE LWIN
//28October
//Lab12
//The program should count the number of families whose income is below a certain value
import java.util.Scanner;
public class CountFamilies
{
    public int [] incomes;


    public CountFamilies(int k)
    {
        incomes=new int[k];
        readIncome();
    }

    public void readIncome()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the incomes for each family: ");
        for (int i=0;i<incomes.length;i++)
        {
            incomes[i]=input.nextInt();
        }
        input.close();
    }
    public int findMaxIncome()
    {
        int max=incomes[0];
        for (int income:incomes){
            if(income>max)
            {
                max=income;
            }
        }
        return max;
    } 

    public void countlowIncomeFamilies()
    {
        int maxIncome=findMaxIncome();
        double percentage= maxIncome*0.1;
        int count=0;
        System.out.println("Families earning less than 10% of the maximum income("+percentage+")");
        for(int income: incomes)
        {
            if(income<percentage)
            {
                System.out.println("Income: "+income);
                count++;
            }
        }
        System.out.println("Number of families earning less than 10% of the maximum income: "+count);
    }

}
