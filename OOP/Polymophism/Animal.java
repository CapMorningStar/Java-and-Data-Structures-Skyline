public class Animal{
    String name;

    public Animal(String animalName){
        name=animalName;
    }

    void makeSound(){
        System.out.println(name+" makes a sound");
    }

    void eat(){
        System.out.println(name+" eats food");
    }
}

