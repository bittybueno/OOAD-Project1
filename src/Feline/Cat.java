package Feline;

import Animal.SpeakBehavior;

public class Cat extends Feline implements SpeakBehavior {

    public Cat(String name) {
        super(name);
        this.species = "Cat";
    }

    public String makeNoise() {
        return "meowww";
    }

}
