package Lesson38_polimorfism;

public class Turtle implements Swimable, Voiceable{

    @Override
    public void swim() {
        System.out.println("Черепаха умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звуки");

    }
}
