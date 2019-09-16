package Animal;

public abstract class Animal implements SpeakBehavior, EatBehavior{
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


//    abstract public String makeNoise();
//    abstract public String eat();
    public String wakeUp() { return String.format("%s is awake!", this.name); }
    public String sleep() { return String.format("%s is asleep!", this.name); }
    public String roam() { return String.format("%s is roaming!", this.name); }

    public void printAnimal() {
        System.out.println("Animal is a " + this.getAnimalType() + " and its name is " + this.getAnimalName());
    }

}