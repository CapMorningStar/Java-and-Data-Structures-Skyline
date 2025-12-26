public class Cat extends Animal{
    public Cat(String catName){
        super(catName);
    }
    @Override
    void makeSound(){
        System.out.println(name+" meow");
    }
    @Override
    void eat(){
        System.out.println(name+" eat fish");
    }
}