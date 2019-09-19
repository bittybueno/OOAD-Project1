package Feline;

import Animal.SpeakBehavior;

public class Tiger extends Feline implements SpeakBehavior {

    public Tiger(String name) {
        super(name);
        this.species = "Lion";
    }

    public String makeNoise() {
        return "Grrrrrrr!";
    }

}
