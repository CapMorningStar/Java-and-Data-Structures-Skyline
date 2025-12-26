import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferedReader{
    public static void main(String[] args) {
        String filepath="D:\\JJava\\example.txt";
        BufferedReader inputStream=null;
        try {
            inputStream=new BufferedReader(new FileReader(filepath));
            String line;
            while((line =inputStream.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file");
            e.printStackTrace();
        }finally{
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                
            }
        }
    }
}