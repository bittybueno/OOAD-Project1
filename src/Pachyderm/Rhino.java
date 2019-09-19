package Pachyderm;

import Animal.SpeakBehavior;

public class Rhino extends Pachyderm implements SpeakBehavior {
    public Rhino(String name) {
        super(name);
    }

    public String makeNoise() {
        return "Hufffff, *kicks dirt up with horn*";
    }
}
