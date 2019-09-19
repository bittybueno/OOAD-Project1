import Animal.*;
import Feline.*;
import Pachyderm.*;
import Canine.*;

public class Zookeeper {
    public static void main(String[] args) {
        // Array of feline for Zookeeper to cycle through
        Animal[] arr;
        int size = 16;
        arr = new Animal[size];

        arr[0] = new Hippo("Harry");
        arr[1] = new Hippo("Harvey");
        arr[2] = new Rhino("Roger");
        arr[3] = new Rhino("Ronny");
        arr[4] = new Elephant("Earl");
        arr[5] = new Elephant("Edgar");
        arr[6] = new Dog("Daryl");
        arr[7] = new Dog("Dayna");
        arr[8] = new Wolf("Wesley");
        arr[9] = new Wolf("Wyatt");
        arr[10] = new Lion("Larry");
        arr[11] = new Lion("Linda");
        arr[12] = new Tiger("Tony");
        arr[13] = new Tiger("Terri");
        arr[14] = new Cat("Cathy");
        arr[15] = new Cat("Chris");

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
