package Pachyderm;

import Animal.*;

abstract public class Pachyderm extends Animal implements RoamBehavior, EatBehavior {
    public Pachyderm(String name) {
        super(name);
        this.family = "Pachyderm";
    }

    public String eat() {
        return "Cronching on some Hay and fruit \n";
    }

    public String roam() {
        return "STOMP. STOMP. STOMP";
    }
}
