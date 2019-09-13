import Animal.*;
import Feline.*;

public class Zookeeper{
    public static void main(String[] args) {
        // Array of animal for Zookeeper to cycle through
        Animal[] arr;
        arr = new Animal[3];

        // Creating the objects
        Animal feline = new Feline("Carl");
        ((Feline) feline).setFelineNoise(new MeanKitty());
        arr[0] = feline;


        Animal feline2 = new Feline("Katy");
        ((Feline) feline2).setFelineNoise(new NiceKitty());
        arr[1] = feline2;

        Animal lion1 = new Lion("Larry");
        arr[2] = lion1;


        // Zookeeper performs duties
        for (int i = 0; i < arr.length; i++) {
            arr[i].printAnimal();
            System.out.println(arr[i].makeNoise());
            System.out.println(arr[i].wakeUp());
            System.out.println(arr[i].sleep());
            System.out.println(arr[i].eat());
            System.out.println(arr[i].roam());
            System.out.println("_______________\n");
        }


    }
}