package Lesson36_abstract;

abstract class Feline extends Animal{

    int tailLength;
    int tailWhiskers;

    int clawsCount;


    public Feline(double weight, int age, String color, int tailLength, int tailWhiskers, int clawsCount) {
        super(weight, age, color);
        this.tailLength = tailLength;
        this.tailWhiskers = tailWhiskers;
        this.clawsCount = clawsCount;
    }

    abstract void purr();
    abstract void sharpenClaws();
    abstract void landOnPaws();

    @Override
     abstract void talk();

    public void greet(){
        purr();
        talk();
        sharpenClaws();
    }



    @Override
    public String toString() {
        return "Feline{" +
                "tailLength=" + tailLength +
                ", tailWhiskers=" + tailWhiskers +
                ", clawsCount=" + clawsCount +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
