package Animal;

public abstract class Animal {
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


    public String wakeUp() { return String.format("%s is awake!", this.name); }
    public String sleep() { return String.format("%s is asleep!", this.name); }
    public String roam() { return String.format("%s is roaming!", this.name); }

    public void printAnimal() {
        System.out.println("Animal is a " + this.getAnimalType() + " and its name is " + this.getAnimalName());
    }

}