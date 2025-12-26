import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class OutputStream
{   public static void main(String[] args)
    {   PrintWriter outputStreams=null;
        String filePath="D:\\JJava\\example1.txt";
       try
       {    outputStreams=new PrintWriter(new FileWriter(filePath));
            outputStreams.println("I Love You my Baby");
            System.out.println("DOne");
       }
       catch
    (FileNotFoundException e)
        {
        e.printStackTrace();
       }
       catch(IOException e){
        e.printStackTrace();
       }
       finally{
        if(outputStreams !=null)
        {
            
            outputStreams.close();
            
            
        }
       }
    }
}