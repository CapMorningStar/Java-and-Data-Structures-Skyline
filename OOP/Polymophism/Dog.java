public class Dog extends Animal
{
    public Dog(String dogName){
        super(dogName);
    }

    @Override
    void makeSound(){
        System.out.println(name+" barks.");
    }
    @Override
    void eat(){
        System.out.println(name+ " eats kibble.");
    }

}