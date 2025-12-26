
import java.io.Serializable;
public class MyObject implements Serializable
{   public int age;
    public String name;
    public MyObject(int newAge,String newName)
    {
        age=newAge;
        name=newName;

    }

    public String getName(){
        return name;
    }

    public int getage(){
        return age;
    }
    @Override
    public String toString(){
        return "Age= "+getage()+"Name= "+getName();
    }
}