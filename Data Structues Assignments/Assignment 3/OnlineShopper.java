//KYAW SOE LWIN
//Lab3
//14 February 2025
//The program manages an online shopping car, calculates the total cost and displays each item and the total.

public class OnlineShopper
{
    public static void main(String[] args) 
    {
        ShopItem[] items = {new ShopItem("Plates", 1200),
                        new ShopItem("Bottle ", 4500),
                        new ShopItem("Straws", 850),
                        new ShopItem("Cups", 1295)};
                      
        BagInterface<ShopItem> shoppingCart = new LinkedBag<>();
        int totalCost = 0;
      
       
        for (int index = 0; index < items.length; index++)
        {
            ShopItem nextItem = items[index]; 
            shoppingCart.add(nextItem);
            totalCost = totalCost + nextItem.getPrice();  
        } 

        
        while (!shoppingCart.isEmpty())
            System.out.println(shoppingCart.remove());

        System.out.println("Total cost: " + "\t$" + totalCost / 100 + "." +
                         totalCost % 100);
    } 
} 


