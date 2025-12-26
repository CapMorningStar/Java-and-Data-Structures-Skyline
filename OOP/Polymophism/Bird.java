public class Bird extends Animal{
    public Bird(String birdName){
        super(birdName);
    }
    @Override
    void makeSound(){
        System.out.println(name+" Pew Pew");
    }
    @Override
    void eat(){
        System.out.println(name+" rice plant");
    }
}