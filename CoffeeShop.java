//KYAW SOE LWIN
//Lab14
//3 November 2024
/*The program is writing about asking type and number of coffee that 
customer want and displays the total cost*/


public class CoffeeShop
{   public String[] coffees={"Regular Coffee","Cafe Americano","Latte","Cafe mocha","Cappucccino"};
    public double[] prices={3.00,2.75,3.25,3.50,3.50};
    double sum=0;
    
    public void ArrayOfCoffee()
    {   
        System.out.println("\nWelcome to KYAW SOE LWIN Coffee Shop!"+
                           "\n \n Here is our menu.");
    
        for (int i = 0; i < coffees.length; i++) 
        {
            System.out.printf(i+1+". %s-$%.2f\n",coffees[i],prices[i]);
            
        }
        System.out.println("");

    }

    public double TotalPrice(int typeCoffee,int number)
    {
    
        sum=prices[typeCoffee-1]*number;
        return sum;
    }
}