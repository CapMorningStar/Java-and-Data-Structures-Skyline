public class Person{
    private  String name;
    public Person(){
        name="Unknown";
    }

    public Person(String personName){
        name=personName;
    }

    public void setName(String personName){
        name=personName;
    }

    public String getName(){
        return name;
    }

    public void writeOutput(){
        System.out.println("Name: "+name);
    }


}