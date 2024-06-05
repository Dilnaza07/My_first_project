package Lesson37_intradaction_to_interfaces2;

public class Turtle implements Turtleable{
    @Override
    public void postpone() {
        System.out.println("Черепаха может откладывать яйца");
    }

//    @Override
//    public void swim() {
//        System.out.println("Черепаха плавает");
//
//    }

    @Override
    public void wearable() {
        System.out.println("Черепаха носит панцирь");
    }
}
