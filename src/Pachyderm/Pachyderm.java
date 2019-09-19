package Pachyderm;

import Animal.*;

abstract public class Pachyderm extends Animal implements RoamBehavior {
    public Pachyderm(String name) {
        super(name);
        this.type = "Pachyderm";
    }

    public String roam() {
        return "STOMP. STOMP. STOMP";
    }
}
