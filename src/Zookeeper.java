import Animal.*;
import Feline.*;
import Pachyderm.*;

public class Zookeeper {
    public static void main(String[] args) {
        // Array of feline for Zookeeper to cycle through
        Animal[] arr;
        arr = new Animal[4];

        // Creating the objects
        Feline lion1 = new Lion("Carl");
        lion1.setFelineNoise(new MeanKitty());
        arr[0] = lion1;

        Feline lion2 = new Lion("Katy");
        lion2.setFelineNoise(new NiceKitty());
        arr[1] = lion2;

        Feline lion3 = new Lion("Larry");
        lion3.setFelineNoise(new NiceKitty());
        arr[2] = lion3;

        arr[3] = new Hippo("pimp");

        System.out.println(arr[3].makeNoise());
        System.out.println(arr[3].name);

        // Zookeeper performs duties
        // for (int i = 0; i < arr.length; i++) {
        // arr[i].printAnimal();
        // System.out.println(arr[i].makeNoise());
        // System.out.println(arr[i].wakeUp());
        // System.out.println(arr[i].sleep());
        // System.out.println(arr[i].eat());
        // System.out.println(arr[i].roam());
        // System.out.println("_______________\n");
        // }
    }
}
