import java.util.Objects;

public class Person
{
    private String name;
    private int age;
    
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this ==o)return true;

        if(o==null || getClass() != o.getClass()) return false;
        Person person=(Person) o;
        return age==person.age && Objects.equals(name, person.name);


    }

    public int hashCode()
    {
        int result=17;
        
        result=31*result+(name!=null? name.hashCode():0);
        result=31*result +age;

        return result;
    }

    public static void main(String[] args) 
    {
        Person p1=new Person("Alice", 30);
        Person p2=new Person("Alice", 30);
        Person p3=new Person("Bob",25);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        System.out.println("p1.equals(p2)? " + p1.equals(p2));          // true
        System.out.println("p1.hashCode() == p2.hashCode()? " +
                            (p1.hashCode() == p2.hashCode()));        // true

        System.out.println("p1.equals(p3)? " + p1.equals(p3));          // false
        System.out.println("p1.hashCode() == p3.hashCode()? " +
                            (p1.hashCode() == p3.hashCode())); 
    }
}