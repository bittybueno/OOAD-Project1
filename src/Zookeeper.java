import Animal.*;
import Feline.*;
import Pachyderm.*;

public class Zookeeper {
    public static void main(String[] args) {
        // Array of feline for Zookeeper to cycle through
        Animal[] arr;
        arr = new Animal[1];

        // We shouldn't have to work this hard to call an animal
        // Feline lion3 = new Lion("Larry");
        // lion3.setFelineNoise(new NiceKitty());
        // arr[1] = lion1;

        // arr[1] = new Lion("Larry") This is how simple it should be to make an Animal
        arr[0] = new Hippo("pimp");

        System.out.println(arr[0].makeNoise());
        System.out.println(arr[0].roam());

        // System.out.println(arr[3].name); //name is protected so you can't print it

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
