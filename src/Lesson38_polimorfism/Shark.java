package Lesson38_polimorfism;

public class Shark implements Swimable, Voiceable{
    @Override
    public void swim() {
        System.out.println("Акула умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Акула издает звуки");

    }
}
