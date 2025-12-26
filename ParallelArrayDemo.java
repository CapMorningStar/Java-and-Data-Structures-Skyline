import java.util.Scanner;
public class ParallelArrayDemo
{
    public static void main (String [] args)
    {
        final int NUMBER_OF_CLIENTS = 10;
        String [] clientName = new String [NUMBER_OF_CLIENTS];
        int [] clientID = new int [NUMBER_OF_CLIENTS];

        //  Instantiate Scanner.
        Scanner keyboard = new Scanner (System.in);
        
        //  Initialize client list
        clientName [0] = "George Washington";        clientID [0] = 677;
        clientName [1] = "John Adams";               clientID [1] = 643;
        clientName [2] = "Thomas Jefferson";         clientID [2] = 353;
        clientName [3] = "James Madison";            clientID [3] = 641;
        clientName [4] = "James Monroe";             clientID [4] = 726;
        clientName [5] = "John Quincy Adams";        clientID [5] = 331;
        clientName [6] = "Andrew Jackson";           clientID [6] = 764;
        clientName [7] = "Martin Van Buren";         clientID [7] = 557;
        clientName [8] = "William Henry Harrison";   clientID [8] = 234;
        clientName [9] = "John Tyler";               clientID [9] = 241;
    
        //  Print client list
        for (int i=1;  i<NUMBER_OF_CLIENTS;  i++)
            System.out.println (i + "  " + clientName [i]);

        //  Ask for and print information about selected client
        System.out.print ("Type the number of the client you would like to see: ");
        int clientPosn = keyboard.nextInt();
        System.out.println ("Client " + clientPosn + ":  " +
                            clientName [clientPosn] + "  " + clientID [clientPosn]);
        
    }
}

