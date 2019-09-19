package Feline;

import Animal.*;

abstract public class Feline extends Animal {
    SpeakBehavior catNoise;

    public Feline(String name) {
        super(name);
        this.type = "Feline";
    }

    public void setFelineNoise(SpeakBehavior cn) {
        catNoise = cn;
    }

    public String makeNoise() {
        return String.format("%s says: %s", this.name, catNoise.makeNoise());
    }

    public String eat() {
        return felineAte();
    }

    @Override
    public String sleep() {
        return stubbornFelineWontSleep();
    }

    /*
     * #############################################################################
     * ##### Animal.Feline specific behaviors: public String
     * stubbornKittyWontSleep() : feline sleeps or doesn't public String felineAte()
     * : what the feline eats
     */

    public String stubbornFelineWontSleep() {
        return String.format("%s is being stubborn and won't go to sleep!", this.name);
    }

    public String felineAte() {
        int answer = 1;
        String response = "";
        if (Math.random() < 0.5) {
            answer = 0;
        }

        if (answer == 1) {
            response = String.format("mouse!");
        } else {
            response = String.format("feline food!");
        }
        return response;
    }
}
