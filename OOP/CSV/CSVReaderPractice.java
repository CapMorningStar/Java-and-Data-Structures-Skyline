import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderPractice
{
    public static void main(String args[])
    {
        File filepath=new File("D:\\JJava\\My Exercise\\CSV\\example.csv");

        try(BufferedReader csv=new BufferedReader(new  FileReader(filepath)))
        {
            String line;

            while((line= csv.readLine()) !=null){
                String[] values=line.split(",");
                for (int i = 0; i <values.length; i++) {
                    System.out.print(values[i]+" ");
                }
                System.out.println();

            }
        }catch(IOException e)
        {
            System.out.println("An error occured while reading the file");
            e.printStackTrace();
        }
        
    }
}