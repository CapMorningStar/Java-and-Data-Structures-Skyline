//KYAW SOE LWIN
//Lab13
//3 November 2024
//The program is writing about reading integers,one per line and displays their sum

import java.util.Scanner;
public class NumberArrayTest
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers will you enters: ");
        int k=input.nextInt();
        
        NumberArrayMethod num=new NumberArrayMethod(k);

    }
}