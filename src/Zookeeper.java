import Animal.*;
import Feline.*;

public class Zookeeper {
    public static void main(String[] args) {
        // Array of feline for Zookeeper to cycle through
        Feline[] arrFeline;
        arrFeline = new Feline[3];

        // Creating the objects
        Feline lion1 = new Lion("Carl");
        lion1.setFelineNoise(new MeanKitty());
        arrFeline[0] = lion1;

        Feline lion2 = new Lion("Katy");
        lion2.setFelineNoise(new NiceKitty());
        arrFeline[1] = lion2;

        Feline lion3 = new Lion("Larry");
        lion3.setFelineNoise(new NiceKitty());
        arrFeline[2] = lion3;

        // Zookeeper performs duties
        for (int i = 0; i < arrFeline.length; i++) {
            arrFeline[i].printAnimal();
            System.out.println(arrFeline[i].makeNoise());
            System.out.println(arrFeline[i].wakeUp());
            System.out.println(arrFeline[i].sleep());
            System.out.println(arrFeline[i].eat());
            System.out.println(arrFeline[i].roam());
            System.out.println("_______________\n");
        }
    }
}
