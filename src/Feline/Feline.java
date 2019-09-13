package Feline;

import Animal.Animal;

public class Feline extends Animal {
    FelineNoise catNoise;

    public Feline(String name) {
        super(name);
        this.type = "Feline";
    }

    public void setFelineNoise(FelineNoise cn) {
        catNoise = cn;
    }

    public String makeNoise() { return String.format("%s says: %s", this.name, catNoise.makeNoise()); }
    public String wakeUp(){ return String.format("%s is awake!", this.name); }
    public String sleep(){ return stubbornFelineWontSleep(); }
    public String eat(){ return felineAte(); }
    public String roam(){ return String.format("%s is roaming!", this.name); }

    /* ##################################################################################
       Animal.Feline specific behaviors:
       public String stubbornKittyWontSleep() : feline sleeps or doesn't
       public String felineAte() : what the feline eats
    */

    public String stubbornFelineWontSleep(){
        return String.format("%s is being stubborn and won't go to sleep!", this.name);
    }

    public String felineAte(){
        int answer = 1;
        String response = "";
        if(Math.random() < 0.5) {
            answer = 0;
        }

        if (answer == 1){
            response = String.format("%s ate a mouse!", this.name);
        } else {
            response = String.format("%s ate a feline food!", this.name);
        }
        return response;
    }
}