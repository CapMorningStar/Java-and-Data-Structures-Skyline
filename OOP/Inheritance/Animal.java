public class Animal
{
    private String name;
    private int age;

    public Animal()
    {
        name="Unknown";
        age=0;
    }

    public Animal(String newName,int newAge)
    {
        name=newName;
        age=newAge;
    }

    public String getName()
    {
        return name;
    }
    
    public int getAge(){
        return age;
    }

    @Override
    public String toString()
    {
        System.out.println();
        return"Name: "+getName()+"\nAge: "+getAge()+"\n";
        
    } 
}