package Lesson39_polimorfism.Lesson38_polimorfismPart2;

public class Duck implements Voiceable, Swimable {

    @Override
    public void swim() {
        System.out.println("Уточка умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Уточка издает звуки");

    }
}
