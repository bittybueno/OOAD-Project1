abstract class Animal {
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
//    abstract public String roam();

    public void printAnimal() {
        System.out.println("Animal is a " + this.getAnimalType() + " and its name is " + this.getAnimalName());
    }

}

class Feline extends Animal{
    CatNoise catNoise;

    public Feline(String name) {
        super(name);
        this.type = "Feline";
    }

    public void setCatNoise(CatNoise cn) {
        catNoise = cn;
    }

    public String makeNoise() {
        return catNoise.makeNoise();
    }

    public String wakeUp(){
        return String.format("%s is awake!", this.name);
    }

    public String sleep(){ return stubbornKittyWontSleep(); }

    public String eat(){ return felineAte(); }
//    public String roam(){}

    public String stubbornKittyWontSleep(){
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
            response = String.format("%s ate a cat food!", this.name);
        }
        return response;
    }
}