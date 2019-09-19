package Canine;

import Animal.SpeakBehavior;

public class Dog extends Canine implements SpeakBehavior {

    public Dog(String name) {
        super(name);
        this.species = "Dog";
    }

    public String makeNoise() {
        return "Ruff *in a sassy domesticated tone*";
    }

}
