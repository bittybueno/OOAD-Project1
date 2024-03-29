package Feline;

import Animal.SpeakBehavior;

public class Lion extends Feline implements SpeakBehavior {

    public Lion(String name) {
        super(name);
        this.species = "Lion";
    }

    public String makeNoise() {
        return "RAWRRRRRRR!";
    }

}
