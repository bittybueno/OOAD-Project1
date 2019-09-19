package Animal;

public interface EatBehavior {
    String eat();
}

public interface SpeakBehavior {
    String makeNoise();
}

public interface RoamBehavior {
    String roam();
}

public abstract class Animal implements SpeakBehavior, EatBehavior, RoamBehavior {
    // I'd like these to be public so we don't have to run methods to retrieve them
    protected String name;
    protected String type;

    public Animal(String name) {
        this.name = name;
    }

    public String getAnimalName() {
        return this.name;
    }

    public String getAnimalType() {
        return this.type;
    }

    public String wakeUp() {
        return String.format("%s is awake!", this.name);
    }

    public String sleep() {
        return String.format("%s is asleep!", this.name);
    }

    public void printAnimal() {
        System.out.println("Animal is a " + this.getAnimalType() + " and its name is " + this.getAnimalName());
    }

}
