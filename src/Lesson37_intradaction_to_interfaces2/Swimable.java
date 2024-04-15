package Lesson37_intradaction_to_interfaces2;

public interface Swimable {

    public static final boolean isSwimable = true;
    public static final double maximumDepthEarthsOceans = 361.26;

    default void swim() {
        System.out.println("Я умею плавать");
    }
}
