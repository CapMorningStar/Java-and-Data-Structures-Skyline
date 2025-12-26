//KYAW SOE LWIN
//September 20
//Lab9
//The program is about a user is storing files after compressing in 512-byte blocks
import java.util.Scanner;

public class StoreFile
{
    public static void main(String[] args) 
    {
        double compressed;

        Scanner input=new Scanner(System.in);
        
        System.out.print("How many 512-byte blocks are available on the storage device?");
        int availableBlocks=input.nextInt();
        
        
        System.out.println("How big is the file in bytes?");
        int fileSize=input.nextInt();
       
            while(fileSize>=0 && availableBlocks>0 && availableBlocks<=1000)
            {
                compressed=fileSize*0.8;
                int blockNeeded=(int)(compressed/512);
                if(compressed%512!=0)
                {   
                    blockNeeded++;
                }

                if (blockNeeded <= availableBlocks) 
                {
                    availableBlocks -= blockNeeded; 
                    System.out.printf("The file will be compressed to %.0f bytes. That will take %d blocks. You have %d blocks available.%n",
                                      compressed, blockNeeded, availableBlocks);
                } else 
                {
                    System.out.printf("The file will be compressed to %.0f bytes.That will take %d blocks. You have only %d blocks. The file cannot be compressed and stored.%n",
                                      compressed, blockNeeded, availableBlocks);
                    break;
                }

                System.out.println("How big is the file in bytes?");
                fileSize=input.nextInt();
            }
        if(fileSize<0)
        {
            System.out.println("Negative file size entered.");
        }else if(availableBlocks<=0)
        {
            System.out.println("No more blocks available");
        }
        
       
    }
}