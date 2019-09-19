package Feline;

import Animal.*;

abstract public class Feline extends Animal implements RoamBehavior, EatBehavior{

    public Feline(String name) {
        super(name);
        this.family = "Feline";
    }


    public String eat() {
        return felineAte();
    }

    public String roam() {
        return "...Sshwoooshhhh...";
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
            response = String.format("Eatin' a mouse!");
        } else {
            response = String.format("Eatin' some feline food!");
        }
        return response;
    }
}
