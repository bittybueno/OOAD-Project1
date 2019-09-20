package Canine;

import Animal.*;

abstract public class Canine extends Animal implements RoamBehavior, EatBehavior {
    public Canine(String name) {
        super(name);
        this.family = "Canine";
    }

    public String eat() {
        return "Eating some kibble and cat";
    }

    public String roam() {
        return "ZOOOOOMIES. Stop. Sniff. ZOOOOOOOOOM.";
    }
}
