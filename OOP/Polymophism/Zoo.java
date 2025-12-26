public class Zoo {

    void feedAnimals(Animal animal) {
        animal.eat();
    }

    void feedAnimals(Animal[] animals) {
        for (Animal ani : animals) {
            ani.eat();
        }
    }

    void voiceAnimals(Animal animal) {
        animal.makeSound();
    }

    void voiceAnimals(Animal[] animals) {
        for (Animal ani : animals) {
            ani.makeSound();
        }
    }
}
