
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream
{   public static void main(String[] args) {
    String filePath="D:\\JJava\\example.txt";
    FileInputStream inputStream=null;
    try
    {   inputStream=new FileInputStream(filePath);
        int data;
        while((data =inputStream.read()) !=-1){
            System.out.print((char)data);
        }
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }finally
    {
    if(inputStream!=null)
    try{
        inputStream.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
    
}