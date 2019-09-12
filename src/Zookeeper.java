public class Zookeeper{
    public static void main(String[] args) {
        // Array of animal for Zookeeper to cycle through
        Animal[] arr;
        arr = new Animal[2];

        // Creating the objects
        Animal feline = new Feline("Carl");
        ((Feline) feline).setCatNoise(new MeanKitty());
        arr[0] = feline;


        Animal feline2 = new Feline("Katy");
        ((Feline) feline).setCatNoise(new NiceKitty());
        arr[1] = feline;


        // Zookeeper performs duties
        for (int i = 0; i < arr.length; i++) {
            arr[i].printAnimal();
            System.out.println(feline2.wakeUp());
            System.out.println(feline2.sleep());
            System.out.println(feline2.eat());
            System.out.println(feline2.roam());
            System.out.println("_______________\n");
        }


    }
}