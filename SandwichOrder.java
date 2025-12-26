//KYAW SOE LWIN
//September 11
//Lab7
//The program is about taking order different type of sandwich and calculating the total

import java.util.Scanner;

public class SandwichOrder
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for the number of sandwiches
        System.out.println("Enter the number of sandwiches: ");
        int number=input.nextInt();
        
        input.nextLine();
    
        System.out.print("Enter the type of sandwich (H, C, R, T, V): ");
        String type=input.nextLine();

        String sandwich="";
        double sandwichPrice=0;;
        
        switch (type) 
        {

            case "H": 
                sandwichPrice=8.5;
                sandwich="ham sandwiches";
                break;
            case "C": 
                sandwichPrice=8.00;
                sandwich="chicken sandwiches";
                break;
            case "R": 
                sandwichPrice=10.00;
                sandwich="roastbeef sandwiches";
                break;
            case "T": 
                sandwichPrice=9.00;
                sandwich="tuna sandwiches";
                break;
            case "V": 
                sandwichPrice=8.50;
                sandwich="vegeterian sandwich";
                break;
            default:
                System.out.println("Invalid sandwich input");
                System.exit(0);

        }
            double total= sandwichPrice*number;
            System.out.println(number+" "+sandwich+" $"+total);
    }
}
