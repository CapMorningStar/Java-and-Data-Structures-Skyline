import java.util.Random;
import java.util.Scanner;
public class SequentialSearchDemo
{

    public static void main (String [] args)
    {

        Scanner keyboard = new Scanner (System.in);
        Random rand = new Random();
        SequentialSearch mySearch = new SequentialSearch();

        int [] salesIn2018 = new int [12];

        //  Read in the data
        //  This is faked by assigning random numbers to the array.
        for (int i=0;  i<salesIn2018.length;  i++)
            salesIn2018 [i] = rand.nextInt(50000);
        for (int i=0;  i<salesIn2018.length;  i++)
            System.out.println (i + "  " + salesIn2018 [i]);

        System.out.print ("Type the value you would like to search for: ");
        int searchValue = keyboard.nextInt();
        
        int answer = mySearch.search (salesIn2018, searchValue);
        if (answer < 0)
            System.out.println ("Value " + searchValue + " not found.");
        else
            System.out.println ("Value " + searchValue + " found at location "
                                + answer + ".");
    }
}