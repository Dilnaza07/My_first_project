package Lesson39_polimorfism.Lesson38_polimorfismPart2;

public class Turtle implements Swimable, Voiceable {

   public static int eggsCount;

    public void postponeableEggs(){
        eggsCount++;
        System.out.println("Черепаха откладывает яйца. Всего яиц: " + eggsCount);
    }

    @Override
    public void swim() {
        System.out.println("Черепаха умеет плавать");
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звуки");



    }
}
