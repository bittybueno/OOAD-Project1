package Feline;


public class Lion extends Feline {

    public Lion(String name) {
        super(name);
    }

    public String makeNoise() { return String.format("%s says: RAWRRRR!", this.name); }

}
