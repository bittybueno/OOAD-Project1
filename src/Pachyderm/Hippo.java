package Pachyderm;

import Animal.SpeakBehavior;

public class Hippo extends Pachyderm implements SpeakBehavior {

    public Hippo(String name) {
        super(name);
        this.species = "Hippo";
    }

    public String makeNoise() {
        return "BLUB BLUB ...*underwater grumbling*";
    }

}
