package Lesson36_abstract;

public class Cat extends Feline {


    public Cat(double weight, int age, String color, int tailLength, int tailWhiskers, int clawsCount) {
        super(weight, age, color, tailLength, tailWhiskers, clawsCount);
    }

    @Override
    public void talk() {
        System.out.println("meow-meow-meow");
    }

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

    @Override
    public String toString() {
        return "Cat{" +
                "tailLength=" + tailLength +
                ", tailWhiskers=" + tailWhiskers +
                ", clawsCount=" + clawsCount +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
