
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamDemo
{
    public static void main(String[] args) 
    {
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("D:\\JJava\\My Exercise\\CSV\\data.bin"))) {
            MyObject obj=new MyObject(45, "John Doe");
            outputStream.writeObject(obj);
        
            
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}