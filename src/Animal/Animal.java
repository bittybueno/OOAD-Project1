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


    abstract public String makeNoise();
    abstract public String wakeUp();
    abstract public String sleep();
    abstract public String eat();
    abstract public String roam();

    public void printAnimal() {
        System.out.println("Animal is a " + this.getAnimalType() + " and its name is " + this.getAnimalName());
    }

}