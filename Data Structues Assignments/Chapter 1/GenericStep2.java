import java.util.ArrayList;

public class GenericStep2
{
    public static void main(String[] args) 
    {
        ArrayList<String> titles=new ArrayList<>();

        titles.add("To Kill A Mockingbird");
        titles.add("1984");
        titles.add("The Great Gatsby");

        titles.remove(2);

        for(String item: titles)
        {
            System.out.println(item);
        }

        
    }
}