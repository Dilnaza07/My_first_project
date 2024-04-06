package Lesson36_abstract;

public class Cow extends Animal{

    public Cow(double weight, int age, String color) {
        super(weight, age, color);
    }

    public void talk(){
        System.out.println("moo-moo-moo");
    }

    @Override
    void sleep() {
        System.out.println("The cow is sleeping");
    }

    void eat() {
        System.out.println("The cow is eating");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
