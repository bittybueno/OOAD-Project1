public class AnimalInheritance{
    public static void main(String[] args) {
        Animal[] arr;
        arr = new Animal[2];
//        Animal dog = new Dog();
//        dog.printAnimal("dog");
//
//        Animal cow = new Cow();
//        cow.printAnimal("cow");
//
//        Animal duck = new Duck();
//        duck.printAnimal("duck");

        Animal feline = new Feline("Carl");
        ((Feline) feline).setCatNoise(new MeanKitty());
        arr[0] = feline;
//        feline.printAnimal();
//        System.out.println(feline.wakeUp());
//        System.out.println(feline.sleep());

        Animal feline2 = new Feline("Katy");
        ((Feline) feline).setCatNoise(new NiceKitty());
        arr[1] = feline;
//        feline2.printAnimal();
//        System.out.println(feline2.wakeUp());
//        System.out.println(feline2.sleep());

        for (int i = 0; i < arr.length; i++) {
            arr[i].printAnimal();
            System.out.println(feline2.wakeUp());
            System.out.println(feline2.sleep());
            System.out.println(feline2.eat());

            System.out.println("_______________\n");
        }


    }
}