import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Main
{
    public static void main(String[] args) 
    {
        try
        {
        User user = null;
        FileInputStream fileIn = new FileInputStream("D:\\JJava\\My Exercise\\Object\\UserInfo.ser"); 
        ObjectInputStream objIn= new ObjectInputStream(fileIn);
        
        user = (User) objIn.readObject();

        
        objIn.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
        }
        catch(IOException  | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        

    }
}