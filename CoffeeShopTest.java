//KYAW SOE LWIN
//Lab14
//3 November 2024
/*The program is writing about asking type and number of coffee that 
customer want and displays the total cost*/

import java.util.Scanner;
public class CoffeeShopTest
{
    public static void main(String[] args)
     {
        CoffeeShop coffee=new CoffeeShop();
        coffee.ArrayOfCoffee();

        System.out.println("Which type of coffee do you want(1-5): ");
        Scanner input=new Scanner(System.in);

        int type=input.nextInt();
        while(type>=6)
        {   
            System.out.println("Enter Correct number (1-5): ");
            type=input.nextInt();
        }

        System.out.println("How many cups do you want? ");
        int amount=input.nextInt();

        double totalCost=coffee.TotalPrice(type, amount);
        
        System.out.println("Your total cost is $"+totalCost);
           
    }
}