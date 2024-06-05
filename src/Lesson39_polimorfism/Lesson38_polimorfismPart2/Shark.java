package Lesson39_polimorfism.Lesson38_polimorfismPart2;

public class Shark implements Swimable, Voiceable {

    public void hunting(){
        System.out.println("Акула охотится");
    }
    @Override
    public void swim() {
        System.out.println("Акула умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Акула издает звуки");

    }
}
