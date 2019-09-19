package Canine;

import Animal.SpeakBehavior;

public class Wolf extends Canine implements SpeakBehavior {
    public Wolf(String name) {
        super(name);
        this.species = "Wolf";
    }

    public String makeNoise() {
        return "AWOOOOOOOOOOOOOOOOOO *in a badass wild tone*";
    }
}
