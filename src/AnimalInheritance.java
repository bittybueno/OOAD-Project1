public class AnimalInheritance{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.printAnimal("dog");

        Animal cow = new Cow();
        cow.printAnimal("cow");

        Animal duck = new Duck();
        duck.printAnimal("duck");

        Animal cat = new Cat();
        ((Cat) cat).setCatNoise(new MeanKitty());
        cat.printAnimal("mean kitty");
    }
}