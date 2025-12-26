import java.util.ArrayList;
public class ExampleArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Nyi Nyi");
        list.add("Aung Aung"); 
        System.out.println(list.get(0)); 

        list.set(0, "Good Bye");
        System.out.println(list);
        list.remove(2);
        list.remove("Aung Aung");
        System.out.println(list);
        System.out.println(list.size());

        for(String item:list)
        {
            System.out.println(item);
        }
    }
}