package Lesson36_abstract;

public class Tiger extends Feline{

    public Tiger(double weight, int age, String color, int tailLength, int tailWhiskers, int clawsCount) {
        super(weight, age, color, tailLength, tailWhiskers, clawsCount);
    }

    @Override
    void purr() {
        System.out.println("Tiger is purring");

    }

    void sharpenClaws() {
        System.out.println("The tiger sharpens its claws");

    }

    void landOnPaws() {
        System.out.println("The tiger lands on its paws");

    }
    void sleep() {
        System.out.println("The tiger is sleeping");

    }

    void eat() {
        System.out.println("The tiger is eating");

    }

    public void talk(){
        System.out.println("rrrrr");
    }



    @Override
    public String toString() {
        return "Tiger{" +
                "tailLength=" + tailLength +
                ", tailWhiskers=" + tailWhiskers +
                ", clawsCount=" + clawsCount +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
