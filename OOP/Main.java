import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Main 
{
    public static void main(String[] args) throws IOException
    {
        User user = new User("Kyaw","Abcd9876");
        
        FileOutputStream file = new FileOutputStream("UserInfo.ser");

        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(user);
        out.close();
        file.close();

        System.out.println("Object info saved");
    }    
}
