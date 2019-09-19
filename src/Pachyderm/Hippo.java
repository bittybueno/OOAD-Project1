package Pachyderm;

import Animal.SpeakBehavior;

public class Hippo extends Pachyderm implements SpeakBehavior {

    public Hippo(String name) {
        super(name);
    }

    public String makeNoise() {
        return "BLUB BLUB ...*underwater grumbling*";
    }

}
