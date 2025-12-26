//KYAW SOE LWIN
//Lab1
//30 Jan 2025
//The program is about a library system simulating book storage, random add/remove operations, and non-interactive execution.

import java.util.ArrayList;
import java.util.Random;

public class LibraryTest
{
    public static void main(String[] args) 
    {   
        
        ArrayList<Library> entry=new ArrayList<Library>();
        entry.add(new Library("Batman", "Bruce", "364", 4, 8));
        entry.add(new Library("Game of the Year", "Jolie", "873", 9, 3));
        entry.add(new Library("Flash", "Barry", "937", 4, 2));
        entry.add(new Library("Loki", "Hiddleston","847", 3, 7));
        entry.add(new Library("Doom", "Nolan","744", 23, 1));
        entry.add(new Library("Roger", "Steve","447", 4, 6));
        entry.add(new Library("Creature", "Han So Hee","543", 3, 22));
        entry.add(new Library("GyengSeong", "Park Seo Jeon","226", 7, 3));
        entry.add(new Library("Three", "Soe","355", 5, 2));
        entry.add(new Library("Thor", "Marvel","943", 54, 3));
        
        
        

        for(Library b: entry)
        {
            System.out.print(b);
            System.out.println();
            System.out.println("");
        }
        

        Random rand=new Random();

        int removedItem=rand.nextInt(entry.size());
        System.out.println("Array That will remove: \n"+entry.get(removedItem));
        entry.remove(removedItem);
        

        
        System.out.println("\nAfter randomly remove: ");

        for(Library b: entry)
        {
            System.out.print(b);
            System.out.println();
            System.out.println("");
        }


        int addItem=rand.nextInt(entry.size());
        
        
        entry.add(addItem, new Library("Superman", "James Gunn", "639", 4, 9));

        System.out.println("Item that will be added is \n"+entry.get(addItem)+"\n");
        System.out.println("After randomly Added an Item: \n");

        for(Library b: entry)
        {
            System.out.print(b);
            System.out.println();
            System.out.println("");
        }


    }


}