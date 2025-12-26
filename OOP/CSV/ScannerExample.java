import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner; 
 
public class ScannerExample { 
    public static void main(String[] args) { 
        File file = new File("D:\\JJava\\My Exercise\\CSV\\data.txt"); 
        try (Scanner scanner = new Scanner(file)) { 
            while (scanner.hasNextLine()) { 
                String line = scanner.nextLine(); 
                System.out.println(line); 
            } 
        } catch (FileNotFoundException e) { 
            System.err.println("File not found: " + e.getMessage()); 
        } 
    } 
}