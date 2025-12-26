
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random
{
    public static void main(String[] args)
    {
        String filePath="D:\\JJava\\My Exercise\\CSV\\example.txt";
        try(RandomAccessFile raf=new RandomAccessFile(filePath,"rw"))
        {
            raf.seek(0);
            raf.writeBytes("Hello World");

            raf.seek(20);
            raf.writeBytes("Random Access File");

            raf.seek(50);
            raf.writeBytes("Example");

            raf.seek(0);
            System.out.println("Data at position 0: "+raf.readLine());

            raf.seek(20);
            System.out.println("Data at position 20: "+raf.readLine());

            raf.seek(50);
            System.out.println("Data at position 50: "+raf.readLine());
            
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}