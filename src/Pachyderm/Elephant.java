package Pachyderm;

import Animal.SpeakBehavior;

public class Elephant extends Pachyderm implements SpeakBehavior {
    public Elephant(String name) {
        super(name);
    }

    public String makeNoise() {
        return "BRAAAAAAAAAAP, Imma Elephant!";
    }
}
