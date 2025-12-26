import java.util.ArrayList;
import java.util.Collections;

public class GenericStep2
{
    public static void main(String[] args) 
    {
        ArrayList<String> titles=new ArrayList<>();

        titles.add("To Kill A Mockingbird");
        titles.add("1984");
        titles.add("The Great Gatsby");

        titles.remove(2);

        for(String item: titles)
        {
            System.out.println(item);
        }

        titles.set(1, "HungerGames");
        System.out.println("Total Titles: "+titles.size());
        System.out.println("First Titles: "+titles.get(0));

        if(titles.contains("HungerGames"))
        {
            System.out.println("The Title is in the Array");
        } else
        {
            System.out.println("The Title is not in the Array");
        }
        System.out.println();
        titles.add("Express VPN");

        titles.set(2, "Kyaw Soe Lwin");

        for(String item:titles)
        {
            System.out.println(item);
        }

        Collections.sort(titles);
        
        System.out.println("Sorted: ");
        for(String item:titles)
        {
            System.out.println(item);
        }

        System.out.println("Number of titles: "+titles.size());
    }
}