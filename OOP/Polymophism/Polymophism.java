public class Polymophism{
    public static void main(String[] args) {
        Animal myAnimal=new Animal("Ted");
        Animal dog=new Dog("May Sabel");
        Animal cat=new Cat("Zarni");
        Animal bird=new Bird("Nyi Nyi");
       
        Animal[] ani=new Animal[3];
        ani[0]=new Dog("Baby");
        ani[1]=new Cat("Mae Lone");
        ani[2]=new Bird("Batman");

        for(Animal a:ani){
            a.makeSound();;
            System.out.println();
        }


        Zoo zoo=new Zoo();
        Animal[] animals={myAnimal,dog,cat,bird};

        
        zoo.voiceAnimals(cat);
        zoo.voiceAnimals(bird);
        zoo.feedAnimals(animals);
        zoo.voiceAnimals(animals);
    }
}