//KYAW SOE LWIN
//Lab13
//3 November 2024
//The program is writing about reading integers,one per line and displays their sum

import java.util.Scanner;

public class NumberArrayMethod
{
    public int[] numbers;
    int sum=0;
    public  NumberArrayMethod(int arrayNumber)
    {
        numbers=new int[arrayNumber];
        System.out.println("Enter "+arrayNumber+" integers,one per line: ");
        addnumbers();
    }

    public void addnumbers()
    {
        Scanner input=new Scanner(System.in);
        
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }

        System.out.println("The sum is "+sum);
        percentage();
    
    }

    public void percentage()
    {
        System.out.println("The numbers are ");
        for (int i = 0; i < numbers.length; i++) 
        {
            double percentage=(numbers[i]/(double)sum)*100;
           System.out.printf("%d,which is %.4f%% of the sum.\n",numbers[i],percentage);
            

        }
    }
}