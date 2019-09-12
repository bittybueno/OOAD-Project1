abstract class Animal {
    protected boolean isMammal;
    protected boolean isCarnivorous;

    public Animal(boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }

    public boolean getIsMammal() {
        return this.isMammal;
    }

    public boolean getIsCarnivorous() {
        return this.isCarnivorous;
    }

    abstract public String makeNoise();

    public void printAnimal(String name) {
        System.out.println("A " + name + " says '" + this.makeNoise() + "', is " + (this.getIsCarnivorous() ? "" : "not ")
                + "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal.");
    }
}

class Dog extends Animal{
    public Dog() {
        super(true, true);
    }

    public String makeNoise() {
        return "ruff";
    }
}

class Cow extends Animal{
    public Cow() {
        super(true, false);
    }

    public String makeNoise() {
        return "moo";
    }
}

class Cat extends Animal{
    CatNoise catNoise;
    public Cat() {
        super(true, true);
    }

    public void setCatNoise(CatNoise cn) {
        catNoise = cn;
    }

    public String makeNoise() {
        return catNoise.makeNoise();
    }
}

class Duck extends Animal{
    public Duck() {
        super(false, false);
    }

    public String makeNoise() {
        return "quack";
    }
}

