import Animal.*;
import Feline.*;
import Pachyderm.*;

public class Zookeeper {
    public static void main(String[] args) {
        // Array of feline for Zookeeper to cycle through
        Animal[] arr;
        int size = 6;
        arr = new Animal[size];

        // Shouldn't have to work this hard to call an animal
        // Feline lion3 = new Lion("Larry");
        // lion3.setFelineNoise(new NiceKitty());
        // arr[1] = lion1;

        arr[0] = new Hippo("Harry");
        arr[1] = new Hippo("Harvey");
        arr[2] = new Rhino("Roger");
        arr[3] = new Rhino("Ronny");
        arr[4] = new Elephant("Earl");
        arr[5] = new Elephant("Edgar");

        // System.out.println(arr[3].name); //name is protected so you can't print it

        // testing only
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
