
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo
{
    public static void main(String[] args) 
    {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\JJava\\My Exercise\\CSV\\data.bin"))){
            MyObject obj=(MyObject) ois.readObject();
            System.out.println("Object read from file: ");
            System.out.println("ID: "+obj.getage()+", Name: "+obj.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}