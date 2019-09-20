package Animal;

// Varying Eating behavior 
public interface EatBehavior {
    String eat();
}

// Varying Speaking behavior 
public interface SpeakBehavior {
    String makeNoise();
}

// Varying Roaming behavior 
public interface RoamBehavior {
    String roam();
}

public abstract class Animal implements SpeakBehavior, EatBehavior, RoamBehavior {
    protected String name;
    protected String family;
    protected String species;

    public Animal(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return this.name;
    }

    public String getAnimalFamily() {
        return this.family;
    }

    public String getAnimalSpecies() {
        return this.species;
    }

    public String wakeUp() {
        return String.format("%s is awake!", this.name);
    }

    public String sleep() {
        return String.format("%s is asleep!", this.name);
    }

    public void printAnimal() {
        System.out.println("This animal is a(n) " + this.getAnimalSpecies() + " of the " + this.getAnimalFamily()
                + " family, and its name is " + this.getAnimalName());
    }

}
