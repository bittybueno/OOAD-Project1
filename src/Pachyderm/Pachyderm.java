package Pachyderm;

import Animal.*;

public class Pachyderm extends Animal implements SpeakBehavior {
    public Pachyderm(String name) {
        super(name);
        this.type = "Pachyderm";
    }
}
